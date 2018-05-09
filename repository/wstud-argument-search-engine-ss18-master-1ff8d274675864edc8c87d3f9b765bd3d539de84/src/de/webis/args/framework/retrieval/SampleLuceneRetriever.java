package de.webis.args.framework.retrieval;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.queryparser.classic.QueryParser.Operator;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.commons.lang3.StringUtils;


import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;

public class SampleLuceneRetriever implements IArgumentsCreator{
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_INDEX_FILE_PATH = "retrieval_index_file_path";
	
	
	// -------------------------------------------------------------------------
	// FIELDS
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
	// MEMBERS
	// -------------------------------------------------------------------------
	
	private String mIndexFilePath;
	private IndexReader mReader;
	private IndexSearcher mSearcher;
	private Analyzer mAnalyzer;
	private String[] mSearchFields = {"Conclusion", "Premise", "Context"};
	
	
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------
	
	@Override
	public void initializeRetrieval(Properties config) {
		// Read properties
		mIndexFilePath = config.getProperty(PROPS_INDEX_FILE_PATH);
		
		// Read lucene index files and prepare for retrieval
		try {
			mReader = DirectoryReader.open(FSDirectory.open(Paths.get(mIndexFilePath)));
			mSearcher = new IndexSearcher(mReader);
		    mAnalyzer = new StandardAnalyzer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Set<Argument> retrieveArguments(PreparedQuery query) {
		Set<Argument> results = new HashSet<Argument>();
		String queryString = query.queryString();
		// Create Lucene Queries with the prepared queries
        QueryParser concParser = new QueryParser("Conclusion",mAnalyzer);
        MultiFieldQueryParser multiFParser = new MultiFieldQueryParser(mSearchFields, mAnalyzer, putBoostMap());
        multiFParser.setDefaultOperator(Operator.AND);
        try {
			Query concQuery = concParser.parse(queryString);
			Query multiFieldQuery = multiFParser.parse(queryString);
			BooleanQuery luceneQuery = new BooleanQuery.Builder()
		        	  .add(multiFieldQuery, BooleanClause.Occur.MUST)
		        	  .add(concQuery, BooleanClause.Occur.MUST)
		      		  .build();
			TopDocs searchRes = mSearcher.search(luceneQuery, Integer.MAX_VALUE);
			
			ScoreDoc[] hits = searchRes.scoreDocs;
	        
	        for (int i = 0; i < hits.length; i++) {
	        	Document doc = mSearcher.doc(hits[i].doc);
	        	Argument argument = new Argument();
	        	boolean stance = false;
	        	if (doc.get(PREMISE_STANCE).equals("Pro")) {
					stance = true;
				}
	        	argument.setAllFields(doc.get(CONTEXT), 
	        			doc.get(DISCUSSION_ID), 
	        			doc.get(TITLE), 
	        			doc.get(CRAWLDATE), 
	        			doc.get(URL), 
	        			doc.get(ARGUMENT), 
	        			doc.get(ARG_ID), 
	        			doc.get(PREV_ID), 
	        			doc.get(NEXT_ID), 
	        			doc.get(CONCLUSION), 
	        			Integer.parseInt(doc.get(CONCLUSION_START_POS)), 
	        			Integer.parseInt(doc.get(CONCLUSION_END_POS)), 
	        			doc.get(PREMISE), 
	        			Integer.parseInt(doc.get(PREMISE_START_POS)), 
	        			Integer.parseInt(doc.get(PREMISE_END_POS)), 
	        			stance, 
	        			hits[i].score);
	        	argument.setExplanation(mSearcher.explain(luceneQuery, hits[i].doc));
	        	results.add(argument);
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		// new
		
        Set<Argument> tempResults = new HashSet<Argument>();
        tempResults = results;
		List<Argument> testList = new ArrayList<Argument>(tempResults);
	
		// transform List of Arguments into Map
		Map<String, Integer> conclusionCount = new HashMap<String, Integer>();
		for(int i = 0; i<results.size(); i++) {
			  String word = testList.get(i).conclusion().trim().toLowerCase();
			  Integer count = conclusionCount.get(word);          
			  conclusionCount.put(word, (count==null) ? 1 : count+1);
			}
		
		//Used for counting in the next foreach loop
		int count =0;
		String str= "";
		
		// counts the most debated conclusion
		// TODO: display the conclusion on frontend
		// TODO: search for the next most debated conclusion if user clicks "Not what I meant"
		for (Map.Entry<String, Integer> entry: conclusionCount.entrySet()){
			if (count < entry.getValue()){
				count = entry.getValue();
				str = entry.getKey();
			}
			//System.out.println(entry.getKey() + " / "+ entry.getValue());
		}
		System.out.println("Conclusion with the most occurences: " + str + " with " + conclusionCount.get(str));
		//System.out.println("Size of results Set: " + results.size() + " tempResults: " + tempResults.size());
		
		
		Argument[] argumentArray = new Argument [tempResults.size()];
		
		// finalResults contains all the arguments with the same conclusion
		Set<Argument> finalResults = new HashSet<Argument>();
		
		int max = tempResults.toArray().length;
		for (int i = 0; i < max; i++){
			
			// Alternate way to compare Strings as to recognize small missspellings
			/*if (!(StringUtils.getLevenshteinDistance(str.trim(),tempResults.toArray(argumentArray)[i].conclusion().trim()) < 3)){
				tempResults.remove(argumentArray[i]);
				System.out.println("Argument" +i + " removed: " + argumentArray[i].conclusion() + " with ID " + argumentArray[i].argID());
			}*/
			
			if (!(tempResults.toArray(argumentArray)[i].conclusion().trim().toLowerCase().equals(str.toLowerCase()))){
				//System.out.println("Argument" + i + " removed: " + argumentArray[i].conclusion() + " with ID " + argumentArray[i].argID());
			}
			else{
				finalResults.add(argumentArray[i]);
				//System.out.println("Argument" + i + " added: " + argumentArray[i].conclusion() + " with ID " + argumentArray[i].argID());
			}			
		}
		
		List <Argument> finalList = new ArrayList<>();
		finalList = new ArrayList<Argument>(finalResults);
		
		/**
		for (int i = 0; i < finalList.size(); i++){
			System.out.println("Argument " + i +" conclusion: " + finalList.get(i).conclusion() + "with ID: " + finalList.get(i).argID());
		}
		*/
		// finalResults contains only the arguments with the same (most found) conclusion
        // return finalResults
		System.out.println("---------------------------------------------");
		System.out.println("Did you mean: " + str + "?");
		return finalResults;
	}

	@Override
	public String classifyStance(Argument retrievedArgument, PreparedQuery query) {
		if (retrievedArgument.premiStance() == true) {
			return "pro";
		}
		else {
			return "con";
		}
		/*if (query.stanceIndicator() == true) {
			return "pro";
		}
		else {
			return "con";
		}*/
	}

	
	
	// -------------------------------------------------------------------------
	// PRIVATE METHODES
	// -------------------------------------------------------------------------
	
	private static HashMap<String, Float> putBoostMap() {
		HashMap<String,Float> boosts = new HashMap<String,Float>();
		boosts.put("Context", 0.2f);
		boosts.put("Conclusion", 0.5f);
		boosts.put("Premise", 1f);
		return boosts;	  
	}

}
