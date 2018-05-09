package de.webis.args.framework.usage;

import de.webis.args.framework.indexing.GenericIndexGenerator;
import de.webis.args.framework.miningAndAssessment.GenericSrcDataGenerator;

public class SampleCompleteIndexProcess {
	
	public static final String ConfigPath = "conf/exampleConfig.properties"; // A sample property file
	
	
	public static void main(String[] args) {
		
		// Mining and Assessment. The creation of database
		GenericSrcDataGenerator databaseGenerator = new GenericSrcDataGenerator(ConfigPath);
		databaseGenerator.generateData();
		
		// Indexing
		GenericIndexGenerator indexGenerator = new GenericIndexGenerator(ConfigPath);
		indexGenerator.generateIndex();
		
	}

}
