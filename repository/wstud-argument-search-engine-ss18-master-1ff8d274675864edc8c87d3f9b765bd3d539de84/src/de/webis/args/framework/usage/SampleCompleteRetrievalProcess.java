package de.webis.args.framework.usage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.presentation.GenericPresiGenerator;
import de.webis.args.framework.querying.GenericQueryGenerator;
import de.webis.args.framework.querying.PreparedQuery;
import de.webis.args.framework.ranking.GenericRankingGenerator;
import de.webis.args.framework.retrieval.GenericArgumentsGenerator;

public class SampleCompleteRetrievalProcess {
	
	
	public static final String ConfigPath = "conf/exampleConfig.properties";  // Path of a sample property file
	public static final String QueryString = "universal health care";  // A sample query string
	
	
	public static void main(String[] args) throws IOException {
		
		// Querying
    	GenericQueryGenerator queryGenerator = new GenericQueryGenerator(ConfigPath);
    	List<PreparedQuery> preparedQueries = queryGenerator.generateQuery(QueryString);
    	for (PreparedQuery query : preparedQueries) {
			query.print();
		}
    	
    	// Retrieval
    	GenericArgumentsGenerator argumentsGenerator = 
				new GenericArgumentsGenerator(ConfigPath);
    	List<Set<Argument>> arguments = argumentsGenerator.retrieveArguments(preparedQueries);
		
    	// Ranking
		GenericRankingGenerator rankingGenerator = new GenericRankingGenerator(ConfigPath);
		List<Argument> rankedArgs = rankingGenerator.generateRanking(arguments, null);
		
		// Presentation
		GenericPresiGenerator presiGenerator = new GenericPresiGenerator(ConfigPath);
		presiGenerator.generatePresi(rankedArgs, preparedQueries);
		
		// Test prints
		int numResults = rankedArgs.size();
		System.out.println("Total results: " + numResults);
		if (numResults > 5) {
			System.out.println("Printing IDs of the first 5 results: ");
			for (int i = 0; i < 5; i++) {
				Argument argument = rankedArgs.get(i);
				System.out.println(argument.argID());
			}
		} else if (numResults > 0) {
			System.out.println("Printing IDs of the results: ");
			for (int i = 0; i < numResults; i++) {
				Argument argument = rankedArgs.get(i);
				System.out.println(argument.argID());
			}
		}
	}
}
