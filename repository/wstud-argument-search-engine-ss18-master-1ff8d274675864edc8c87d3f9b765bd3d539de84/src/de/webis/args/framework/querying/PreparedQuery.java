package de.webis.args.framework.querying;

/**
 * PreparedQuery is a result class after executing the query step of the framework.
 * It stores 
 * <BR>
 * a) the query string/sub query string depending on the use-defined processes
 * in the query type and 
 * <BR>
 * b) a boolean value indicating if the stance of the query/sub query should be 
 * inverted in search. 
 * 
 * @author Jiani Qu
 *
 */

public class PreparedQuery {
	
	// -------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------
	
	public PreparedQuery() {};
	
	public PreparedQuery(String string, boolean inv) {
		mQueryString = string;
		mStanceInversion = inv;
	}
	
	// -------------------------------------------------------------------------
	// DEFAULT MEMBERS
	// -------------------------------------------------------------------------
	
	private String mQueryString;
	private boolean mStanceInversion;		
	
	// -------------------------------------------------------------------------
	// GETTERS
	// -------------------------------------------------------------------------
	
	public String queryString() {
		return mQueryString;
	}
	
	public boolean stanceIndicator() {
		return mStanceInversion;
	}
	
	// -------------------------------------------------------------------------
	// SETTER
	// -------------------------------------------------------------------------
	
	public void setQueryString(String queryStringPart) {
		mQueryString = queryStringPart;
	}
	
	public void setStanceIndicator(boolean inv) {
		mStanceInversion = inv;
	}
	
	// -------------------------------------------------------------------------
	// PRINT
	// -------------------------------------------------------------------------
	
	public void print() {
		System.out.println(queryString() + "\t" + stanceIndicator());
	}
}
