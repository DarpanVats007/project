
/* First created by JCasGen Wed Sep 27 16:56:43 CEST 2017 */
package de.aitools.ie.uima.type.supertype;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** The supertype of all terms, which can be understood as some kind of (non-named, non-numeric) entity.
 * Updated by JCasGen Fri Dec 01 18:34:22 CET 2017
 * @generated */
public class Term_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Term.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.supertype.Term");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Term_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    