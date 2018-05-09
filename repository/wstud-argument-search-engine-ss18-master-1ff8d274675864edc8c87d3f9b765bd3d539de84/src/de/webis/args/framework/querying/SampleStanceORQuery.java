package de.webis.args.framework.querying;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SampleStanceORQuery implements IQueryCreator{

	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String QUERY_STANCE_INDICATOR = 
			"query_stance_indicator";
	
	// -------------------------------------------------------------------------
	// MEMBERS
	// -------------------------------------------------------------------------
	
	private List<String> mStanceIndicator;
	
	private int[] mStanceMatchPos;
	
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------
	
	@Override
	public void initializeQuery(Properties config) {
		String prop_indicators = config.getProperty(QUERY_STANCE_INDICATOR);
		// If the property is not defined in config, end method
		if (prop_indicators == null || prop_indicators.isEmpty()) {
			return;
		}
		// If property exists, store value in member
		String[] stanceIndicators = prop_indicators.split(",");
		mStanceIndicator = new ArrayList<String>();
		for (String indicator : stanceIndicators) {
			mStanceIndicator.add(indicator);
		}
		this.mStanceMatchPos = 
				new int[stanceIndicators.length];
	}

	@Override
	public List<PreparedQuery> createQuery(String queryString) {
		List<PreparedQuery> prepQueries = new ArrayList<PreparedQuery>();
		
		// Find matches of indicators in queryString
		for (int i = 0; i < mStanceIndicator.size(); i++) {
			int matchPos = queryString.indexOf(mStanceIndicator.get(i));
			mStanceMatchPos[i] = matchPos;
		}
		
		// Each stance indicator indicates a stace change of the query. 
		// The substrings before the indicator contain it's stance, 
		// the substrings after have inverted stance
		int start = 0, end = queryString.length();
		boolean inv = true;
		for (int i = 0; i < mStanceMatchPos.length; i++) {
			int pos = mStanceMatchPos[i];
			if (pos > 0 || pos == 0) {
				System.out.println("Indicator found!");
				if (pos > 0) {
					createNewPrepQueries(queryString, start, pos, inv, prepQueries);
				}
				start = pos + mStanceIndicator.get(i).length();
				inv = invertStance(inv);		// Invert stance for the next subquery
			}
		}
		createNewPrepQueries(queryString, start, end, inv, prepQueries);
		
		return prepQueries;
	}
	
	
	// -------------------------------------------------------------------------
	// PRIVATE METHODES
	// -------------------------------------------------------------------------
	
	private void createNewPrepQueries(String queryString, int subStart, 
			int subEnd, boolean inv, List<PreparedQuery> prepQueries) {
		queryString = queryString.substring(subStart, subEnd).trim();
		String[] queryParts = queryString.split("\\s+");
		for (String subQ : queryParts) {
			subQ = subQ.trim();
			createNewPrepQuery(subQ, inv, prepQueries);
		}
	}
	
	private void createNewPrepQuery(String queryString, boolean inv, 
			List<PreparedQuery> prepQueries) {
		PreparedQuery newSubQuery = new PreparedQuery(queryString.trim(),inv);
		prepQueries.add(newSubQuery);
	}
	
	private boolean invertStance(boolean inv) {
		if (inv) {
			inv = false;
		} else {
			inv = true;
		}
		return inv;
	}
	
}
