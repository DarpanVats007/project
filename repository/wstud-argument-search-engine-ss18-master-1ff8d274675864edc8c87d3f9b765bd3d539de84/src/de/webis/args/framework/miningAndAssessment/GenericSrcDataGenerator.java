package de.webis.args.framework.miningAndAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * This class is the first three steps of the whole indexing process 
 * (acquisition, mining, assessment, indexing).
 * It is fully configurable via the defined properties file.
 * <BR><BR>
 * File generation can be triggered either by executing the main method of this 
 * class or by creating an object of this class and then calling its method 
 * <CODE>generateData()</CODE>
 * <BR><BR>
 * The path of the properties file is stored in the public static variable
 * <CODE>ConfigPath</CODE> and can be modified if needed.
 * 
 * @author Henning Wachsmuth, Jiani Qu
 *
 */

public class GenericSrcDataGenerator {
	
	/**
	 * The path of the properties file to be used for configuration.
	 */
	public static final String ConfigPath = "conf/exampleConfig.properties";
	
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PROPS_MINING_TYPE = "mining_type_class";
	
	
	// -------------------------------------------------------------------------
	// CONFIGURATIONS
	// -------------------------------------------------------------------------
	
	/**
	 * The config properties.
	 */
	private Properties mMiningConfig;
	
	/**
	 * The miner and assessment type to be used
	 */
	private IMinerCreator mMinerType;
	
	//TODO: what is the output here?
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public GenericSrcDataGenerator(String configPath){
		// Load properties
		mMiningConfig = this.loadProperties(configPath);
		
		// Set query type
		mMinerType = this.createMinerType(
				mMiningConfig.getProperty(PROPS_MINING_TYPE));	
		
	}
	
	/**
	 * Creates and returns an object of the miner and assessment type class 
	 * specified by its class name
	 */
	private IMinerCreator createMinerType(String className){
		IMinerCreator component = null;
		try{
			component = (IMinerCreator) Class.forName(className, true, 
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
	 * Generate json-files to be indexed in the next step
	 */
	public void generateData() {
		System.out.println("---------------------------------------------");
		System.out.println("Mining step happening. Json-files being written...");
		System.out.println("---------------------------------------------");
		
		mMinerType.initializeMining(mMiningConfig);
		mMinerType.generateFiles();
	}
	
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		GenericSrcDataGenerator generator = new GenericSrcDataGenerator(ConfigPath);
		generator.generateData();
	}
}
