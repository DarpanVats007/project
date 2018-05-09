package de.webis.args.framework.ranking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;


/**
 * This class doesn't really rank anything itself. It takes the default lucene
 * scores from the retrieving process.
 * @author xiwo8493
 *
 */
public class SampleLuceneRanking implements IScoreCreator{	
	
	// -------------------------------------------------------------------------
	// MEMBERS
	// -------------------------------------------------------------------------
	
	
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------

	@Override
	public void initializeRanking(Properties config) {
	}

	@Override
	public List<Argument> computeScoresAndSort(List<Set<Argument>> retrievedArguments,
			List<PreparedQuery> preparedQueries) {
		// Merging all retrieved arguments into one set (since we don't compute new scores)
		Set<Argument> allArguments = new HashSet<Argument>();
		for (Set<Argument> set : retrievedArguments) {
			allArguments.addAll(set);
		}
		// Copying scores in Argument objects
		for (Argument argument : allArguments) {
			argument.setScore(argument.luceneScore());
		}
		// Store the set in list
		List<Argument> rankedArguments = new ArrayList<Argument>(allArguments);
		
		Collections.sort(rankedArguments, new Comparator<Argument>() {
			@Override
			public int compare(Argument a1, Argument a2) {
				if (a1.score() > a2.score()) return -1;
			    if (a1.score() < a2.score()) return 1;
			    return 0;
			}
		});

		return rankedArguments;
	}
	
	
	// -------------------------------------------------------------------------
	// PRIVATE METHODES
	// -------------------------------------------------------------------------

	
}
