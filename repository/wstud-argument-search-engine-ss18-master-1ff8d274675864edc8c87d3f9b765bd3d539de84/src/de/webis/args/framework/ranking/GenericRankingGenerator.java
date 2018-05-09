package de.webis.args.framework.ranking;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;
import de.webis.args.framework.retrieval.GenericArgumentsGenerator;

/**
 * This class is the third step of the whole retrieval process 
 * (querying, retrieval, ranking, presentation). It can be used to rank the 
 * retrieved arguments.
 * It is fully configurable via the defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>generateRanking()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericRankingGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_RANKING_TYPE = "ranking_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS AND MEMBERS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mRankingConfig;
	
	/**
	 * The ranking type to be used
	 */
	private IScoreCreator mRankingType;
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------

	/**
	 * Constructor.
	 */
	public GenericRankingGenerator(String configPath){
		// Load properties
		mRankingConfig = this.loadProperties(configPath);
		
		// Set ranking type
		mRankingType = this.createRankingType(
				mRankingConfig.getProperty(PROPS_RANKING_TYPE));	
		
	}
	
	/**
	 * Creates and returns an object of the ranking type class 
	 * specified by its class name
	 */
	private IScoreCreator createRankingType(String className){
		IScoreCreator component = null;
		try{
			component = (IScoreCreator) Class.forName(className, true, 
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
	 * Generate ranked arguments
	 * @return 
	 */
	public List<Argument> generateRanking(List<Set<Argument>> retrievedArguments, 
			List<PreparedQuery> preparedQueries) {
		System.out.println("---------------------------------------------");
		System.out.println("Computing scores with given configuration... ");
		System.out.println("---------------------------------------------");
		
		mRankingType.initializeRanking(mRankingConfig);
		return mRankingType.computeScoresAndSort(retrievedArguments, preparedQueries);
	}
	
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		
		GenericArgumentsGenerator argumentsGenerator = 
				new GenericArgumentsGenerator(ConfigPath);
		List<PreparedQuery> preparedQueries = new ArrayList<PreparedQuery>();
		preparedQueries.add(new PreparedQuery("hilary clinton",false));
		List<Set<Argument>> arguments = argumentsGenerator.retrieveArguments(preparedQueries);
		
		GenericRankingGenerator generator = new GenericRankingGenerator(ConfigPath);
		List<Argument> res = generator.generateRanking(arguments, null);
		for (int i = 0; i < 1; i++) {
			Argument argument = res.get(i);
//			System.out.println(argument.argID());
//			System.out.println(argument.score());
//			System.out.println(argument.explain().toString());
			System.out.println(argument.explain().clean());
		}
	
	}
}
