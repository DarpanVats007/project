package de.webis.args.framework.presentation;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;
import de.webis.args.framework.ranking.GenericRankingGenerator;
import de.webis.args.framework.retrieval.GenericArgumentsGenerator;

/**
 * This class is the final step of the whole retrieval process 
 * (querying, retrieval, ranking, presentation). It can be used to create
 * the presentation of the retrieved arguments for the web-interface. 
 * It is fully configurable via the defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>generatePresi()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericPresiGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_PRESI_TYPE = "presi_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS AND MEMBERS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mPresiConfig;
	
	/**
	 * The presentation type to be used
	 */
	private IPresiCreator mPresiType;
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------

	/**
	 * Constructor.
	 */
	public GenericPresiGenerator(String configPath){
		// Load properties
		mPresiConfig = this.loadProperties(configPath);
		
		// Set Presi type
		mPresiType = this.createPresiType(
				mPresiConfig.getProperty(PROPS_PRESI_TYPE));	
		
	}
	
	/**
	 * Creates and returns an object of the presi type class 
	 * specified by its class name
	 */
	private IPresiCreator createPresiType(String className){
		IPresiCreator component = null;
		try{
			component = (IPresiCreator) Class.forName(className, true, 
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
	 * Generate presentation
	 */
	public void generatePresi(List<Argument> rankedArguments,
			List<PreparedQuery> preparedQueries) {
		System.out.println("----------------------------------------------------");
		System.out.println("Generating presentation with given configuration... ");
		System.out.println("----------------------------------------------------");
		
		mPresiType.initializePresi(mPresiConfig);

		// Extracting query-strings for highlighting
		String querystring = "";
    	for (PreparedQuery query : preparedQueries) {
    		querystring += " " + query.queryString();
    	}
    	
    	// Create presentation components for each Argument
		for(Argument argument : rankedArguments) {
			try{
				String contentSnippet = mPresiType.createContentSnippet(argument, querystring);
				String titleSnippet = mPresiType.createTitleSnippet(argument);
				String polishedPremise = mPresiType.createPolishedPremise(argument, querystring);
				String urlSnippet = mPresiType.createURLSnippet(argument);
				String finalExplanation = mPresiType.createFinalExplanation(argument);
				argument.setAllPresiComponents(titleSnippet, contentSnippet, urlSnippet, 
						polishedPremise, finalExplanation);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InvalidTokenOffsetsException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		
		GenericArgumentsGenerator argumentsGenerator = 
				new GenericArgumentsGenerator(ConfigPath);
		List<PreparedQuery> preparedQueries = new ArrayList<PreparedQuery>();
		preparedQueries.add(new PreparedQuery("test",true));
		List<Set<Argument>> arguments = argumentsGenerator.retrieveArguments(preparedQueries);
		
		GenericRankingGenerator rankingGenerator = new GenericRankingGenerator(ConfigPath);
		List<Argument> rankedArgs = rankingGenerator.
				generateRanking(arguments, null);
		
		GenericPresiGenerator presiGenerator = new GenericPresiGenerator(ConfigPath);
		presiGenerator.generatePresi(rankedArgs, preparedQueries);
	
		for (int i = 0; i < 10; i++) {
			Argument argument = rankedArgs.get(i);
			System.out.println(argument.presiTitleSnippet());
//			System.out.println(argument.presiURLSnippet());
//			System.out.println(argument.presiContentSnippet());
//			System.out.println(argument.presiPolishedPremise());
		}
	}
}
