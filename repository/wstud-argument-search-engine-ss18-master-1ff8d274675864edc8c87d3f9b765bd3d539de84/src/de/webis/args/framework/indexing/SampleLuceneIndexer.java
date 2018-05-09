package de.webis.args.framework.indexing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.IntPoint;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static java.lang.Math.toIntExact;

import java.util.Properties;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.StopwordAnalyzerBase;

/**
 * Sample indexer which indexes all text files under a directory.
 * <BR>
 * This example uses apache lucene to index the database of files.
 */
public class SampleLuceneIndexer implements IIndexGenerator {

	// -------------------------------------------------------------------------
	// Property
	// -------------------------------------------------------------------------
	private static final String INDEX_INDEX_PATH = "index_output_path";
	private static final String INDEX_SRC_PATH = "index_src_path";

	// -------------------------------------------------------------------------
	// Member
	// -------------------------------------------------------------------------
	private String mIndexPath;
	private String mSrcPath;

	// -------------------------------------------------------------------------
	// Index fields
	// -------------------------------------------------------------------------

	static final String CONTEXT = "Context";
	static final String DISCUSSION_ID = "DiscussionID";
	static final String TITLE = "Title";
	static final String CRAWLDATE = "CrawlDate";
	static final String URL = "URL";

	static final String ARGUMENT = "Argument";

	static final String ARG_ID = "ArgumentID";
	static final String PREV_ID = "prevID";
	static final String NEXT_ID = "nextID";

	static final String CONCLUSION = "Conclusion";
	static final String CONCLUSION_START_POS = "ConclusionStartPos";
	static final String CONCLUSION_END_POS = "ConclusionEndPos";

	static final String PREMISE = "Premise";
	static final String PREMISE_START_POS = "PremiseStartPos";
	static final String PREMISE_END_POS = "PremiseEndPos";
	static final String PREMISE_STANCE = "PremiseStance";

	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------

	@Override
	public void initializeIndexer(Properties config) {
		// Load all configurations
		mIndexPath = config.getProperty(INDEX_INDEX_PATH);
		mSrcPath = config.getProperty(INDEX_SRC_PATH);
	}

	@Override
	public void createIndex() {
		String docsPath = mSrcPath;
		boolean create = true;

		final Path docDir = Paths.get(docsPath);

		if (!Files.isReadable(docDir)) {
			System.out.println("Document directory '" + docDir.toAbsolutePath()
					+ "' does not exist or is not readable, please check the path");
			System.exit(1);
		}

		Date start = new Date();
		try {
			System.out.println("Indexing to directory '" + mIndexPath + "'...");

			Directory dir = FSDirectory.open(Paths.get(mIndexPath));
			Analyzer analyzer = new StandardAnalyzer();
			IndexWriterConfig iwc = new IndexWriterConfig(analyzer);

			if (create) {
				// Create a new index in the directory, removing any
				// previously indexed documents:
				iwc.setOpenMode(OpenMode.CREATE);
			} else {
				// Add new documents to an existing index:
				iwc.setOpenMode(OpenMode.CREATE_OR_APPEND);
			}

			// Optional: for better indexing performance, if you
			// are indexing many documents, increase the RAM
			// buffer. But if you do this, increase the max heap
			// size to the JVM (eg add -Xmx512m or -Xmx1g):
			//
			// iwc.setRAMBufferSizeMB(256.0);

			IndexWriter writer = new IndexWriter(dir, iwc);
			indexDocs(writer, docDir);

			// NOTE: if you want to maximize search performance,
			// you can optionally call forceMerge here. This can be
			// a terribly costly operation, so generally it's only
			// worth it when your index is relatively static (ie
			// you're done adding documents to it):
			//
			// writer.forceMerge(1);

			writer.close();

			Date end = new Date();
			System.out.println(end.getTime() - start.getTime() + " total milliseconds");

		} catch (IOException e) {
			System.out.println(" caught a " + e.getClass() + "\n with message: " + e.getMessage());
		}
	}

	// -------------------------------------------------------------------------
	// Methods
	// -------------------------------------------------------------------------

	/**
	 * Read JSON files and prepare for index
	 * 
	 * @throws ParseException
	 * @throws IOException
	 */
	static JSONObject JSON_Reader(String filename) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader(filename));

			// convert Object to JSONObject
			JSONObject jsonObject = (JSONObject) object;
			return jsonObject;
		} catch (FileNotFoundException e) {
		}
		return null;
	}

	/**
	 * Indexes the given file using the given writer, or if a directory is given,
	 * recurses over files and directories found under the given directory.
	 * 
	 * NOTE: This method indexes one document per input file. This is slow. For good
	 * throughput, put multiple documents into your input file(s). An example of
	 * this is in the benchmark module, which can create "line doc" files, one
	 * document per line, using the <a href=
	 * "../../../../../contrib-benchmark/org/apache/lucene/benchmark/byTask/tasks/WriteLineDocTask.html"
	 * >WriteLineDocTask</a>.
	 * 
	 * @param writer
	 *            Writer to the index where the given file/dir info will be stored
	 * @param path
	 *            The file to index, or the directory to recurse into to find files
	 *            to index
	 * @throws IOException
	 *             If there is a low-level I/O error
	 */
	static void indexDocs(final IndexWriter writer, Path path) throws IOException {
		if (Files.isDirectory(path)) {
			Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					try {
						indexDoc(writer, file, attrs.lastModifiedTime().toMillis());
					} catch (IOException ignore) {
						// Don't index files that can't be read.
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			indexDoc(writer, path, Files.getLastModifiedTime(path).toMillis());
		}
	}

	/** Indexes a single document */
	static void indexDoc(IndexWriter writer, Path file, long lastModified) throws IOException {
		// Call writeFields method to fill the fields of each document
		ArrayList<Document> docsList = new ArrayList<Document>();
		writeFields(file, docsList);

		// Add documents to our writer
		for (Document doc : docsList) {
			if (writer.getConfig().getOpenMode() == OpenMode.CREATE) {
				// New index, so we just add the document (no old document can be there)
				System.out.println("adding " + file);
				writer.addDocument(doc);
			} else {
				// Existing index, so we use updateDocument instead to replace the old one
				System.out.println("updating " + file);
				writer.updateDocument(new Term("path", file.toString()), doc);
			}
		}
	}

	/** Writes fields into a single document */
	static void writeFields(Path file, ArrayList<Document> docsList) {
		int count = 0;
		try {
			JSONObject obj = JSON_Reader(file.toString());

			if (obj == null) {
				System.out.println("File not found: " + file.toString());
			}

			else {
				// Get metadata from json objects and add them to corresponding fields
				JSONObject metaData = (JSONObject) obj.get("MetaData");
				JSONArray argumentList = (JSONArray) obj.get("ArgumentList");

				// Iterate argument list and create lucene documents
				for (int i = 0; i < argumentList.size(); i++) {
					// Create new empty document
					Document doc = new Document();

					// Add context to our document
					doc.add(new TextField(CONTEXT, (String) metaData.get(CONTEXT), Field.Store.NO));
					doc.add(new StringField(DISCUSSION_ID, (String) metaData.get(DISCUSSION_ID), Field.Store.YES));
					doc.add(new StringField(TITLE, (String) metaData.get(TITLE), Field.Store.YES));
					doc.add(new StringField(CRAWLDATE, (String) metaData.get(URL), Field.Store.YES));
					doc.add(new StringField(URL, (String) metaData.get(URL), Field.Store.YES));

					// Add argument data to our document
					JSONObject outer = (JSONObject) argumentList.get(i);
					JSONObject argument = (JSONObject) outer.get(ARGUMENT);
					doc.add(new StringField(ARG_ID, (String) argument.get(ARG_ID), Field.Store.YES));
					doc.add(new StringField(PREV_ID, (String) argument.get(PREV_ID), Field.Store.YES));
					doc.add(new StringField(NEXT_ID, (String) argument.get(NEXT_ID), Field.Store.YES));

					doc.add(new TextField(CONCLUSION, (String) argument.get(CONCLUSION), Field.Store.YES));
					// To store IntPoint as a field in the document, the field also has to be separately stored with 
					// a separate instance of StoredField. Otherwise the value of the field will be null.
					doc.add(new IntPoint(CONCLUSION_START_POS, toIntExact((Long) argument.get(CONCLUSION_START_POS))));
					doc.add(new StoredField(CONCLUSION_START_POS, toIntExact((Long) argument.get(CONCLUSION_START_POS))));
					doc.add(new IntPoint(CONCLUSION_END_POS, toIntExact((Long) argument.get(CONCLUSION_END_POS))));
					doc.add(new StoredField(CONCLUSION_END_POS, toIntExact((Long) argument.get(CONCLUSION_END_POS))));

					JSONArray premises = (JSONArray) argument.get(PREMISE);
					doc.add(new TextField(PREMISE, (String) premises.get(0), Field.Store.YES));
					JSONArray startPosList = (JSONArray) argument.get(PREMISE_START_POS);
					JSONArray endPosList = (JSONArray) argument.get(PREMISE_END_POS);
					for (int j = 0; j < startPosList.size(); j++) {
						doc.add(new IntPoint(PREMISE_START_POS, toIntExact((Long) startPosList.get(j))));
						doc.add(new StoredField(PREMISE_START_POS, toIntExact((Long) startPosList.get(j))));
						doc.add(new IntPoint(PREMISE_END_POS, toIntExact((Long) endPosList.get(j))));
						doc.add(new StoredField(PREMISE_END_POS, toIntExact((Long) endPosList.get(j))));
					}
					JSONArray stances = (JSONArray) argument.get(PREMISE_STANCE);
					doc.add(new TextField(PREMISE_STANCE, (String) stances.get(0), Field.Store.YES));

					// Add document to our list
					docsList.add(doc);
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println(count + " During writeFields caught a " + e.getClass() + "\n with message: "
					+ e.getMessage() + " | " + file);
		}
	}
	
	/**
	 * A function to remove the standard set of stopwords (after executing, no stopword)
	 */
	private static CharArraySet removeStandardStopWords() {
		Analyzer analyzer = new StandardAnalyzer();
		CharArraySet stopwords = ((StopwordAnalyzerBase) analyzer).getStopwordSet();
		CharArraySet customStopwords = CharArraySet.copy(stopwords);
		customStopwords.clear();
		analyzer.close();
		return customStopwords;
	}

}
