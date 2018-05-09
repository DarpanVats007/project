package de.webis.args.framework.retrieval;

import java.util.Properties;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;

public interface IArgumentsCreator {
	
	public void initializeRetrieval(Properties config);
	
	public Set<Argument> retrieveArguments(PreparedQuery query);
	
	public String classifyStance(Argument retrievedArgument, PreparedQuery query);
	
}
