package org.apache.uima.portals;

import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit;

public class Functions {
	
	public static boolean allreadyExists(JCas jcas, ArgumentativeDiscourseUnit adu) {
		FSIterator<Annotation> annotationIter = jcas.getAnnotationIndex(ArgumentativeDiscourseUnit.type).iterator();
		while (annotationIter.hasNext()){
			ArgumentativeDiscourseUnit aduEqual = (ArgumentativeDiscourseUnit) annotationIter.next();
			if(aduEqual.toString().equals(adu.toString())) {
				return true;
			}
		}
		return false;
	}
}
