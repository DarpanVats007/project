package de.webis.args.framework.indexing;

import java.util.Properties;

/**
 * Proposed interface to be implemented for all self-written 
 * indexer types that should be used in the initialization of the 
 * indexer and the application of the indexer to generate search indexes.
 * 
 * @author Jiani Qu
 *
 */

public interface IIndexGenerator {
	
	/**
	 * Initialize the necessary values of the properties to be used in generating 
	 * indexes with this indexer type.
	 * <BR>
	 * This method needs to be called once in the beginning of the creation of a 
	 * indexer type.
	 * 
	 * @param config The configuration parameters
	 */
	public void initializeIndexer(Properties config);
	
	/**
	 * Generate indexes according to this indexer type. The generated index files 
	 * should be stored in an output folder.
	 * <BR>
	 * This method needs to be called once after the initialization.
	 */
	public void createIndex();

}
