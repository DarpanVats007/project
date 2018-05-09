package de.webis.args.framework.ranking;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;

public interface IScoreCreator {
	
	public void initializeRanking(Properties config);
	
	public List<Argument> computeScoresAndSort(List<Set<Argument>> retrievedArguments, List<PreparedQuery> preparedQueries);
	
}
