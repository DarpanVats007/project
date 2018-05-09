
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Classification_Type;

/** The appropriateness quality assessment of an argument or argumentation.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class Appropriateness_Type extends Classification_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Appropriateness.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.Appropriateness");
 
  /** @generated */
  final Feature casFeat_majority;
  /** @generated */
  final int     casFeatCode_majority;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getMajority(int addr) {
        if (featOkTst && casFeat_majority == null)
      jcas.throwFeatMissing("majority", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_majority);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMajority(int addr, double v) {
        if (featOkTst && casFeat_majority == null)
      jcas.throwFeatMissing("majority", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_majority, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mean;
  /** @generated */
  final int     casFeatCode_mean;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getMean(int addr) {
        if (featOkTst && casFeat_mean == null)
      jcas.throwFeatMissing("mean", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_mean);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMean(int addr, double v) {
        if (featOkTst && casFeat_mean == null)
      jcas.throwFeatMissing("mean", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_mean, v);}
    
  
 
  /** @generated */
  final Feature casFeat_allScores;
  /** @generated */
  final int     casFeatCode_allScores;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAllScores(int addr) {
        if (featOkTst && casFeat_allScores == null)
      jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    return ll_cas.ll_getRefValue(addr, casFeatCode_allScores);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAllScores(int addr, int v) {
        if (featOkTst && casFeat_allScores == null)
      jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    ll_cas.ll_setRefValue(addr, casFeatCode_allScores, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getAllScores(int addr, int i) {
        if (featOkTst && casFeat_allScores == null)
      jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAllScores(int addr, int i, double v) {
        if (featOkTst && casFeat_allScores == null)
      jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Appropriateness");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_allScores), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Appropriateness_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_majority = jcas.getRequiredFeatureDE(casType, "majority", "uima.cas.Double", featOkTst);
    casFeatCode_majority  = (null == casFeat_majority) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_majority).getCode();

 
    casFeat_mean = jcas.getRequiredFeatureDE(casType, "mean", "uima.cas.Double", featOkTst);
    casFeatCode_mean  = (null == casFeat_mean) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mean).getCode();

 
    casFeat_allScores = jcas.getRequiredFeatureDE(casType, "allScores", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_allScores  = (null == casFeat_allScores) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_allScores).getCode();

  }
}



    