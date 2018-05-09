
/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The metadata of the texts in the Change My View Modes corpus.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataCMVModes_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataCMVModes.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
 
  /** @generated */
  final Feature casFeat_url;
  /** @generated */
  final int     casFeatCode_url;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUrl(int addr) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return ll_cas.ll_getStringValue(addr, casFeatCode_url);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrl(int addr, String v) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    ll_cas.ll_setStringValue(addr, casFeatCode_url, v);}
    
  
 
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_delta;
  /** @generated */
  final int     casFeatCode_delta;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getDelta(int addr) {
        if (featOkTst && casFeat_delta == null)
      jcas.throwFeatMissing("delta", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_delta);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDelta(int addr, boolean v) {
        if (featOkTst && casFeat_delta == null)
      jcas.throwFeatMissing("delta", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_delta, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataCMVModes_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_url = jcas.getRequiredFeatureDE(casType, "url", "uima.cas.String", featOkTst);
    casFeatCode_url  = (null == casFeat_url) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_url).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_delta = jcas.getRequiredFeatureDE(casType, "delta", "uima.cas.Boolean", featOkTst);
    casFeatCode_delta  = (null == casFeat_delta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_delta).getCode();

  }
}



    