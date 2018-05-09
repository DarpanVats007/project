package org.apache.uima.portals;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;

import de.aitools.ie.uima.type.argumentation.Argument;
import de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit;

/**
 * Dummy analysis engine that does nothing. Serves for two purposes: (1) It can 
 * be used when an analysis engine is needed only for creating CAS objects or 
 * similar reasons, not for actual analyses. (2) It can be used as a template 
 * when a new analysis engine is created.
 * 
 * @author henning.wachsmuth
 *
 */
public class DummyAnalysisEngine extends JCasAnnotator_ImplBase {

	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	@Override
	public void initialize(UimaContext aContext) 
	throws ResourceInitializationException {
		super.initialize(aContext);
		// Load parameter, initialize objects, etc.
	}
	
	
	
	// -------------------------------------------------------------------------
	// PROCESSING
	// -------------------------------------------------------------------------
	
	@Override
	public void process(JCas jcas) {
		String text = jcas.getDocumentText();
		String [] lines = text.split("\n");
		
		List<Integer> lineOffsets = new ArrayList<Integer>();
		int offset = 0;
		for (int i=0; i<lines.length; i++){
			lineOffsets.add(offset);
			offset += lines[i].length();
		}
		
		ArgumentativeDiscourseUnit adu1 = new ArgumentativeDiscourseUnit(jcas, 0, 80);
		adu1.addToIndexes(jcas);
		
		ArgumentativeDiscourseUnit adu2 = new ArgumentativeDiscourseUnit(jcas, 80, 82);
		adu2.addToIndexes(jcas);
		String adu2Stance = "con";
		
		Argument argument = new Argument(jcas, adu1.getBegin(), adu2.getEnd());
		argument.setConclusion(adu1);
		FSArray premises = new FSArray(jcas, 1);
		premises.set(0, adu2);
		argument.setPremises(premises); 
		StringArray stances = new StringArray(jcas, 1);
		stances.set(0, adu2Stance);
		argument.setStances(stances); 
		argument.addToIndexes(jcas);

		// Process the text and its annotations in the given JCas object
	}
	
	
	
	// -------------------------------------------------------------------------
	// DESTRUCTION
	// -------------------------------------------------------------------------
	
	@Override
	public void destroy() {
		super.destroy();
		// Destroy anything if necessary
	}
}
