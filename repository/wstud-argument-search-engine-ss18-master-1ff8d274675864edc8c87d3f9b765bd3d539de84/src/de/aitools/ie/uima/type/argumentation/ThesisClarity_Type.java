
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Classification_Type;

/** Text-level classification of the thesis clarity of an essay, as defined in (Persing and Ng, ACL 2013).
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * @generated */
public class ThesisClarity_Type extends Classification_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ThesisClarity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.ThesisClarity");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fold;
  /** @generated */
  final int     casFeatCode_fold;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFold(int addr) {
        if (featOkTst && casFeat_fold == null)
      jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fold);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFold(int addr, int v) {
        if (featOkTst && casFeat_fold == null)
      jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    ll_cas.ll_setIntValue(addr, casFeatCode_fold, v);}
    
  
 
  /** @generated */
  final Feature casFeat_errors;
  /** @generated */
  final int     casFeatCode_errors;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getErrors(int addr) {
        if (featOkTst && casFeat_errors == null)
      jcas.throwFeatMissing("errors", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_errors);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setErrors(int addr, String v) {
        if (featOkTst && casFeat_errors == null)
      jcas.throwFeatMissing("errors", "de.aitools.ie.uima.type.argumentation.ThesisClarity");
    ll_cas.ll_setStringValue(addr, casFeatCode_errors, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ThesisClarity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_fold = jcas.getRequiredFeatureDE(casType, "fold", "uima.cas.Integer", featOkTst);
    casFeatCode_fold  = (null == casFeat_fold) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fold).getCode();

 
    casFeat_errors = jcas.getRequiredFeatureDE(casType, "errors", "uima.cas.String", featOkTst);
    casFeatCode_errors  = (null == casFeat_errors) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_errors).getCode();

  }
}



    