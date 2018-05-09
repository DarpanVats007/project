package de.webis.args.framework.indexing;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * This class is the final step of the whole indexing process 
 * (acquisition, mining, assessment, indexing). It can be used to create
 * index files from assessed documents. It is fully configurable via the 
 * defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>generateIndex()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericIndexGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_INDEXER_TYPE = "index_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mIndexerConfig;
	
	/**
	 * The indexer type to be used
	 */
	private IIndexGenerator mIndexerType;
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public GenericIndexGenerator(String configPath){
		// Load properties
		mIndexerConfig = this.loadProperties(configPath);
		
		// Set indexer type
		mIndexerType = this.createIndexerType(
				mIndexerConfig.getProperty(PROPS_INDEXER_TYPE));	
		System.out.println(mIndexerConfig.getProperty(PROPS_INDEXER_TYPE));
	}
	
	/**
	 * Creates and returns an object of the indexer type class 
	 * specified by its class name
	 */
	private IIndexGenerator createIndexerType(String className){
		IIndexGenerator component = null;
		try{
			component = (IIndexGenerator) Class.forName(className, true, 
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
	 * Generate index
	 */
	public void generateIndex() {
		System.out.println("---------------------------------------------");
		System.out.println("Generating index... ");
		System.out.println("---------------------------------------------");
		
		mIndexerType.initializeIndexer(mIndexerConfig);
		mIndexerType.createIndex();
	}

	
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		GenericIndexGenerator generator = new GenericIndexGenerator(ConfigPath);
		generator.generateIndex();
	}
}
