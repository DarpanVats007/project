package de.webis.args.framework.querying;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SimpleANDQuery implements IQueryCreator{
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------

	@Override
	public void initializeQuery(Properties config) {}

	@Override
	public List<PreparedQuery> createQuery(String queryString) {
		PreparedQuery query = new PreparedQuery(queryString,true);
		List<PreparedQuery> preparedQueries = new ArrayList<PreparedQuery>();
		preparedQueries.add(query);
		return preparedQueries;
	}
}
