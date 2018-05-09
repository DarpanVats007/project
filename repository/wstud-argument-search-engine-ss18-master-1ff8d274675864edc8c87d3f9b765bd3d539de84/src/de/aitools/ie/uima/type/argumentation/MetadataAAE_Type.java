
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata provided for the Argument Annotated Essays corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataAAE_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataAAE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataAAE");
 
  /** @generated */
  final Feature casFeat_filename;
  /** @generated */
  final int     casFeatCode_filename;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFilename(int addr) {
        if (featOkTst && casFeat_filename == null)
      jcas.throwFeatMissing("filename", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_filename);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFilename(int addr, String v) {
        if (featOkTst && casFeat_filename == null)
      jcas.throwFeatMissing("filename", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    ll_cas.ll_setStringValue(addr, casFeatCode_filename, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
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
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopic(int addr, String v) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    ll_cas.ll_setStringValue(addr, casFeatCode_topic, v);}
    
  
 
  /** @generated */
  final Feature casFeat_twoSided;
  /** @generated */
  final int     casFeatCode_twoSided;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTwoSided(int addr) {
        if (featOkTst && casFeat_twoSided == null)
      jcas.throwFeatMissing("twoSided", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_twoSided);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTwoSided(int addr, String v) {
        if (featOkTst && casFeat_twoSided == null)
      jcas.throwFeatMissing("twoSided", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    ll_cas.ll_setStringValue(addr, casFeatCode_twoSided, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataAAE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_filename = jcas.getRequiredFeatureDE(casType, "filename", "uima.cas.String", featOkTst);
    casFeatCode_filename  = (null == casFeat_filename) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_filename).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_topic = jcas.getRequiredFeatureDE(casType, "topic", "uima.cas.String", featOkTst);
    casFeatCode_topic  = (null == casFeat_topic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topic).getCode();

 
    casFeat_twoSided = jcas.getRequiredFeatureDE(casType, "twoSided", "uima.cas.String", featOkTst);
    casFeatCode_twoSided  = (null == casFeat_twoSided) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_twoSided).getCode();

  }
}



    