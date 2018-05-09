
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata provided for the Arg-Microtext corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataArgMicrotext_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataArgMicrotext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
 
  /** @generated */
  final Feature casFeat_textID;
  /** @generated */
  final int     casFeatCode_textID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTextID(int addr) {
        if (featOkTst && casFeat_textID == null)
      jcas.throwFeatMissing("textID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_textID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTextID(int addr, String v) {
        if (featOkTst && casFeat_textID == null)
      jcas.throwFeatMissing("textID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    ll_cas.ll_setStringValue(addr, casFeatCode_textID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_topicID;
  /** @generated */
  final int     casFeatCode_topicID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTopicID(int addr) {
        if (featOkTst && casFeat_topicID == null)
      jcas.throwFeatMissing("topicID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topicID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopicID(int addr, String v) {
        if (featOkTst && casFeat_topicID == null)
      jcas.throwFeatMissing("topicID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    ll_cas.ll_setStringValue(addr, casFeatCode_topicID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_stance;
  /** @generated */
  final int     casFeatCode_stance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStance(int addr) {
        if (featOkTst && casFeat_stance == null)
      jcas.throwFeatMissing("stance", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_stance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStance(int addr, String v) {
        if (featOkTst && casFeat_stance == null)
      jcas.throwFeatMissing("stance", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    ll_cas.ll_setStringValue(addr, casFeatCode_stance, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataArgMicrotext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_textID = jcas.getRequiredFeatureDE(casType, "textID", "uima.cas.String", featOkTst);
    casFeatCode_textID  = (null == casFeat_textID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_textID).getCode();

 
    casFeat_topicID = jcas.getRequiredFeatureDE(casType, "topicID", "uima.cas.String", featOkTst);
    casFeatCode_topicID  = (null == casFeat_topicID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topicID).getCode();

 
    casFeat_stance = jcas.getRequiredFeatureDE(casType, "stance", "uima.cas.String", featOkTst);
    casFeatCode_stance  = (null == casFeat_stance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_stance).getCode();

  }
}



    