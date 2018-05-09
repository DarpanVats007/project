
/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata of the arguments used by the args argument search engine.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataArgs_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataArgs.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataArgs");
 
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
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_crawlingDate;
  /** @generated */
  final int     casFeatCode_crawlingDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCrawlingDate(int addr) {
        if (featOkTst && casFeat_crawlingDate == null)
      jcas.throwFeatMissing("crawlingDate", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return ll_cas.ll_getStringValue(addr, casFeatCode_crawlingDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCrawlingDate(int addr, String v) {
        if (featOkTst && casFeat_crawlingDate == null)
      jcas.throwFeatMissing("crawlingDate", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    ll_cas.ll_setStringValue(addr, casFeatCode_crawlingDate, v);}
    
  
 
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
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return ll_cas.ll_getStringValue(addr, casFeatCode_url);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrl(int addr, String v) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    ll_cas.ll_setStringValue(addr, casFeatCode_url, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataArgs_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_crawlingDate = jcas.getRequiredFeatureDE(casType, "crawlingDate", "uima.cas.String", featOkTst);
    casFeatCode_crawlingDate  = (null == casFeat_crawlingDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_crawlingDate).getCode();

 
    casFeat_url = jcas.getRequiredFeatureDE(casType, "url", "uima.cas.String", featOkTst);
    casFeatCode_url  = (null == casFeat_url) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_url).getCode();

  }
}



    