
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata provided for the Dagstuhl 15512 ArgQuality corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataArgQuality_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataArgQuality.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
 
  /** @generated */
  final Feature casFeat_perspective;
  /** @generated */
  final int     casFeatCode_perspective;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPerspective(int addr) {
        if (featOkTst && casFeat_perspective == null)
      jcas.throwFeatMissing("perspective", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    return ll_cas.ll_getStringValue(addr, casFeatCode_perspective);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPerspective(int addr, String v) {
        if (featOkTst && casFeat_perspective == null)
      jcas.throwFeatMissing("perspective", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    ll_cas.ll_setStringValue(addr, casFeatCode_perspective, v);}
    
  
 
  /** @generated */
  final Feature casFeat_topic;
  /** @generated */
  final int     casFeatCode_topic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTopic(int addr) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopic(int addr, String v) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    ll_cas.ll_setStringValue(addr, casFeatCode_topic, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataArgQuality_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_perspective = jcas.getRequiredFeatureDE(casType, "perspective", "uima.cas.String", featOkTst);
    casFeatCode_perspective  = (null == casFeat_perspective) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_perspective).getCode();

 
    casFeat_topic = jcas.getRequiredFeatureDE(casType, "topic", "uima.cas.String", featOkTst);
    casFeatCode_topic  = (null == casFeat_topic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topic).getCode();

  }
}



    