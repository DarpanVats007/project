package de.webis.args.framework.querying;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SimpleORQuery implements IQueryCreator{
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------

	@Override
	public void initializeQuery(Properties config) {}

	@Override
	public List<PreparedQuery> createQuery(String queryString) {
		List<PreparedQuery> preparedQueries = new ArrayList<PreparedQuery>();
		String[] subQueryStrings = queryString.split("\\s");
		for (String subQuery : subQueryStrings) {
			PreparedQuery query = new PreparedQuery(subQuery,true);
			preparedQueries.add(query);
		}
		return preparedQueries;
	}
}
