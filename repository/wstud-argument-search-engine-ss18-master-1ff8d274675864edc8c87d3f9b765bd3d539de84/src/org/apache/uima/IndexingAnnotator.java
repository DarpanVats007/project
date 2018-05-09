package org.apache.uima;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.Discussion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexingAnnotator extends JCasAnnotator_ImplBase {
	
	private Pattern urlPattern = Pattern.compile("URL");

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		String docText = aJCas.getDocumentText();
		Matcher matcher = urlPattern.matcher(docText);
	    int pos = 0;
	    while (matcher.find(pos)) {
	      Discussion annotation = new Discussion(aJCas);
	      annotation.setBegin(matcher.start());
	      annotation.setEnd(matcher.end());
	      annotation.setURL("URL");
	      annotation.addToIndexes();
	      pos = matcher.end();
	    }
	}

}
