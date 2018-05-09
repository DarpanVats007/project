package de.webis.args.framework.querying;

import java.util.List;
import java.util.Properties;

public interface IQueryCreator {
	
	public void initializeQuery(Properties config);
	
	public List<PreparedQuery> createQuery(String jsonSrcPath);
}
