package de.webis.args.framework.retrieval;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;
import de.webis.args.framework.retrieval.IArgumentsCreator;;

/**
 * This class is the second step of the whole retrieval process 
 * (querying, retrieval, ranking, presentation). It can be used to 
 * retrieve arguments.
 * It is fully configurable via the defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>retrieveArguments()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericArgumentsGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_RETRIEVAL_TYPE = "retrieval_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS AND MEMBERS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mRetrievalConfig;
	
	/**
	 * The retrieval type to be used
	 */
	private IArgumentsCreator mRetrievalType;
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public GenericArgumentsGenerator(String configPath){
		// Load properties
		mRetrievalConfig = loadProperties(configPath);
		
		// Set query type
		mRetrievalType = this.createRetrievalType(
				mRetrievalConfig.getProperty(PROPS_RETRIEVAL_TYPE));	
		
	}
	
	/**
	 * Creates and returns an object of the retrieval type class 
	 * specified by its class name
	 */
	private IArgumentsCreator createRetrievalType(String className){
		IArgumentsCreator component = null;
		try{
			component = (IArgumentsCreator) Class.forName(className, true, 
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
	 * retrieve arguments
	 */
	public List<Set<Argument>> retrieveArguments(List<PreparedQuery> prepQueries) {
		System.out.println("---------------------------------------------");
		System.out.println("Retrieving with given configuration... ");
		System.out.println("---------------------------------------------");
		
		mRetrievalType.initializeRetrieval(mRetrievalConfig);
		List<Set<Argument>> retrievedArguments = new ArrayList<Set<Argument>>();
		for (PreparedQuery query : prepQueries) {
			Set<Argument> arguments = 
					mRetrievalType.retrieveArguments(query);
			retrievedArguments.add(arguments);
			for (Argument arg : arguments) {
				arg.setComputedStance(
						mRetrievalType.classifyStance(arg, query));
			}
		}	
		return retrievedArguments;
	}
	
	/**
	 * Main method for testing 
	 */
	public static void main(String[] args) {
		GenericArgumentsGenerator generator = 
				new GenericArgumentsGenerator(ConfigPath);
		
		List<PreparedQuery> preparedQueries = new ArrayList<PreparedQuery>();
		preparedQueries.add(new PreparedQuery("Hilary Clinton",false));
		
		generator.retrieveArguments(preparedQueries);
	
	}
}
