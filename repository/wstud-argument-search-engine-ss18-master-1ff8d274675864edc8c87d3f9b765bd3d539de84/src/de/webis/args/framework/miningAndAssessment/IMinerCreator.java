package de.webis.args.framework.miningAndAssessment;

import java.util.Properties;

/**
 * Proposed interface to be implemented for all self-written 
 * miner and assessment types that should be used in the initialization
 * and the application of the mining and assessment steps
 * to generate a database of arguments to be indexed later.
 * 
 * @author Jiani Qu
 *
 */

public interface IMinerCreator {

	/**
	 * Initialize the necessary values of the properties to be used in generating 
	 * json files with this mining and assessment type.
	 * <BR>
	 * This method needs to be called once in the beginning of the creation of a 
	 * miner type.
	 * 
	 * @param config The configuration parameters
	 */
	public void initializeMining(Properties config);
	
	/**
	 * Generate database according to this miner type. The generated files 
	 * should be stored in an output folder and to be used as input in indexing 
	 * step later.
	 * <BR>
	 * This method needs to be called once after the initialization.
	 */
	public void generateFiles();
}
