
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Classification_Type;

/** The sentence sentiment annotations given in the dataset.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * @generated */
public class NewsSentiment_Type extends Classification_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NewsSentiment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.NewsSentiment");
 
  /** @generated */
  final Feature casFeat_subjectivity;
  /** @generated */
  final int     casFeatCode_subjectivity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSubjectivity(int addr) {
        if (featOkTst && casFeat_subjectivity == null)
      jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_subjectivity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubjectivity(int addr, double v) {
        if (featOkTst && casFeat_subjectivity == null)
      jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_subjectivity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_positivity;
  /** @generated */
  final int     casFeatCode_positivity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPositivity(int addr) {
        if (featOkTst && casFeat_positivity == null)
      jcas.throwFeatMissing("positivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_positivity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPositivity(int addr, double v) {
        if (featOkTst && casFeat_positivity == null)
      jcas.throwFeatMissing("positivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_positivity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_negativity;
  /** @generated */
  final int     casFeatCode_negativity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNegativity(int addr) {
        if (featOkTst && casFeat_negativity == null)
      jcas.throwFeatMissing("negativity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_negativity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegativity(int addr, double v) {
        if (featOkTst && casFeat_negativity == null)
      jcas.throwFeatMissing("negativity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_negativity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_issue;
  /** @generated */
  final int     casFeatCode_issue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIssue(int addr) {
        if (featOkTst && casFeat_issue == null)
      jcas.throwFeatMissing("issue", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getStringValue(addr, casFeatCode_issue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIssue(int addr, String v) {
        if (featOkTst && casFeat_issue == null)
      jcas.throwFeatMissing("issue", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setStringValue(addr, casFeatCode_issue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_polarity;
  /** @generated */
  final int     casFeatCode_polarity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPolarity(int addr) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return ll_cas.ll_getStringValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, String v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    ll_cas.ll_setStringValue(addr, casFeatCode_polarity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NewsSentiment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_subjectivity = jcas.getRequiredFeatureDE(casType, "subjectivity", "uima.cas.Double", featOkTst);
    casFeatCode_subjectivity  = (null == casFeat_subjectivity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subjectivity).getCode();

 
    casFeat_positivity = jcas.getRequiredFeatureDE(casType, "positivity", "uima.cas.Double", featOkTst);
    casFeatCode_positivity  = (null == casFeat_positivity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_positivity).getCode();

 
    casFeat_negativity = jcas.getRequiredFeatureDE(casType, "negativity", "uima.cas.Double", featOkTst);
    casFeatCode_negativity  = (null == casFeat_negativity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negativity).getCode();

 
    casFeat_issue = jcas.getRequiredFeatureDE(casType, "issue", "uima.cas.String", featOkTst);
    casFeatCode_issue  = (null == casFeat_issue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_issue).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.String", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

  }
}



    