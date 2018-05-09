package de.webis.args.framework.presentation;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;

public interface IPresiCreator {
	
	public void initializePresi(Properties config);
	
	/**
	 * Generate content snippet for an argument given from parameter
	 * @param rankedArguments from ranking step
	 */
	public String createContentSnippet(Argument argument, String querystring) 
			throws IOException, InvalidTokenOffsetsException, ParseException;
	
	/**
	 * Generate title snippet for an argument given from parameter
	 * @param rankedArguments from ranking step
	 */
	public String createTitleSnippet(Argument argument) 
			throws IOException, InvalidTokenOffsetsException, ParseException;
	
	/**
	 * Generate url snippet for an argument given from parameter
	 * @param rankedArguments from ranking step
	 */
	public String createURLSnippet(Argument argument);
	
	/**
	 * Polish the complete premise for the expanded content with 
	 * removing HTML Tags and highlighting the query-string keywords of 
	 * an argument given from parameter
	 * @param rankedArguments from ranking step
	 */
	public String createPolishedPremise(Argument argument, String querystring) 
			throws IOException, InvalidTokenOffsetsException, ParseException;
	
	/**
	 * Generate the final explanation for an argument given from parameter
	 * @param rankedArguments from ranking step
	 */
	public String createFinalExplanation(Argument argument);

}
