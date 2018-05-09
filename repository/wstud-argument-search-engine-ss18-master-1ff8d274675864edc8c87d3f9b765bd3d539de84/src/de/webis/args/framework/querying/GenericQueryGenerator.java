package de.webis.args.framework.querying;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.spell.JaroWinklerDistance;
import org.apache.lucene.search.spell.PlainTextDictionary;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.store.FSDirectory;

import de.webis.args.framework.querying.IQueryCreator;

/**
 * This class is the first step of the whole retrieval process 
 * (querying, retrieval, ranking, presentation). It can be used to
 * prepare queries for argument-retrieval.
 * It is fully configurable via the defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>generateQuery()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericQueryGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_QUERY_TYPE = "query_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mQueryConfig;
	
	/**
	 * The query type to be used
	 */
	private IQueryCreator mQueryType;
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public GenericQueryGenerator(String configPath){
		// Load properties
		mQueryConfig = this.loadProperties(configPath);
		
		// Set query type
		mQueryType = this.createQueryType(
				mQueryConfig.getProperty(PROPS_QUERY_TYPE));	
		
	}
	
	/**
	 * Creates and returns an object of the query type class 
	 * specified by its class name
	 */
	private IQueryCreator createQueryType(String className){
		IQueryCreator component = null;
		try{
			component = (IQueryCreator) Class.forName(className, true, 
							this.getClass().getClassLoader()).newInstance();
		} catch (Exception e){
			e.printStackTrace();
		}
		return component;
	}
	
	/**
	 * Loads the properties.
	 */
	private Properties loadProperties(String path){
		Properties props = new Properties();
		FileInputStream inputStream = null;
		Path configFile = Paths.get(path);
		try {
			inputStream = new FileInputStream(configFile.toString());
			props.load(inputStream);
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
		return props;
	}
	
	
	/**
     * corrects the spelling of a given String
     * @param queryString original query input by the user
     * @return new, corrected queryString
     * @throws IOException Path to dictionary or index-directory not found
     */
    public static String correctSpelling(String queryString) throws IOException{
        System.out.println("----------------------------------------------");
        System.out.println("Checking for spelling errors on queryString: " + queryString);

        // Partition original query String into single words that can be spell-checked separately
        String [] subStrings = queryString.split(" ");
        System.out.println("----------------------------------------------");
        System.out.println("Original String split into these words: ");
        for (int i = 0; i < subStrings.length; i++)
            System.out.println(subStrings[i]);

        //TODO:        // Try using our index (fields?)
                    // To index a field of a user index:
                    //spellchecker.indexDictionary(new LuceneDictionary(my_lucene_reader, a_field));

        // Initialize SpellChecker, add Dictionary, index directory
        Path dir = Paths.get("/home/weki3907/Desktop/WebisProject/wstud-argument-search-engine-ss18/spellChecker");
        Path dictionary = Paths.get("/home/weki3907/Desktop/words.txt");
        SpellChecker spellChecker = new SpellChecker(FSDirectory.open(dir));
        
        spellChecker.indexDictionary(new PlainTextDictionary(dictionary), new IndexWriterConfig(new StandardAnalyzer()), false);
        spellChecker.setStringDistance(new JaroWinklerDistance());

        /* Customization
        strDistance.setThreshold(0.7f);
        spellChecker.setAccuracy(0.2f);
        */
        /*for testing purposes
        String [] correctedList = spellChecker.suggestSimilar(subStrings[2], 5);
        System.out.println("Corrected Spelling to: " + correctedList[1]);
        System.out.println("Corrected Spelling to: " + correctedList[2]);
        System.out.println("Corrected Spelling to: " + correctedList[3]);
        */
        
        String correctedQueryString = "";

        // Check each substring for spelling errors, connect all substrings to a single query String again
        for (int i = 0; i < subStrings.length; i++) {
        	
        	if (subStrings[i].length() < 3){
        		System.out.println("---------------------------------------------");
        		System.out.println("Word is to short and therefore will not be corrected: " + subStrings[i]);
        		correctedQueryString = correctedQueryString + subStrings[i] + " ";        		
        	}

        	else if (spellChecker.exist(subStrings[i])) {
                System.out.println("---------------------------------------------");
                System.out.println("No spelling errors found in " + subStrings[i]);
                correctedQueryString = correctedQueryString + subStrings[i] + " ";
            }

            else {
                System.out.println("---------------------------------------------");
                System.out.println("Correcting spelling from: " + subStrings[i]);
                subStrings[i] = spellChecker.suggestSimilar(subStrings[i], 1)[0];
                System.out.println("Corrected spelling to: " + subStrings[i]);
                correctedQueryString = correctedQueryString + subStrings[i] + " ";
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Corrected query input spelling to: " + correctedQueryString);
        spellChecker.clearIndex();
        spellChecker.close();
        return correctedQueryString;
    }

	
	/**
	 * Generate query
	 */
	public List<PreparedQuery> generateQuery(String queryString){
		
		System.out.println("---------------------------------------------");
		System.out.println("Processing query with given configuration... ");
		System.out.println("---------------------------------------------");
		System.out.println("Original query string: " + queryString);
		
		mQueryType.initializeQuery(mQueryConfig);
		return mQueryType.createQuery(queryString);
	}
	
	
	/**
	 * Main method for testing
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		GenericQueryGenerator generator = new GenericQueryGenerator(ConfigPath);
		
		String queryString = "daeth";
		
		List<PreparedQuery> output = generator.generateQuery(correctSpelling(queryString));
	
		System.out.println("Prepared queries count: " + output.size());
		for (PreparedQuery preparedQuery : output) {
			System.out.println(
				  "sub-query: " + preparedQuery.queryString() + "	"
				+ "stance-inv: " + preparedQuery.stanceIndicator());
		}
	}
}
