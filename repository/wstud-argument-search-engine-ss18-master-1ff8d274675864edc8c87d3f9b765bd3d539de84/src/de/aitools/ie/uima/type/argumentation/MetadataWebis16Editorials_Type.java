
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata of a news editorial from the Webis-16-Editorials corpus.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * @generated */
public class MetadataWebis16Editorials_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataWebis16Editorials.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
 
  /** @generated */
  final Feature casFeat_lastUpdate;
  /** @generated */
  final int     casFeatCode_lastUpdate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastUpdate(int addr) {
        if (featOkTst && casFeat_lastUpdate == null)
      jcas.throwFeatMissing("lastUpdate", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastUpdate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastUpdate(int addr, String v) {
        if (featOkTst && casFeat_lastUpdate == null)
      jcas.throwFeatMissing("lastUpdate", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastUpdate, v);}
    
  
 
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
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_url);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrl(int addr, String v) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_url, v);}
    
  
 
  /** @generated */
  final Feature casFeat_portal;
  /** @generated */
  final int     casFeatCode_portal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPortal(int addr) {
        if (featOkTst && casFeat_portal == null)
      jcas.throwFeatMissing("portal", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_portal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPortal(int addr, String v) {
        if (featOkTst && casFeat_portal == null)
      jcas.throwFeatMissing("portal", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_portal, v);}
    
  
 
  /** @generated */
  final Feature casFeat_authors;
  /** @generated */
  final int     casFeatCode_authors;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthors(int addr) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_authors);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthors(int addr, String v) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_authors, v);}
    
  
 
  /** @generated */
  final Feature casFeat_articleSum;
  /** @generated */
  final int     casFeatCode_articleSum;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getArticleSum(int addr) {
        if (featOkTst && casFeat_articleSum == null)
      jcas.throwFeatMissing("articleSum", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_articleSum);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArticleSum(int addr, String v) {
        if (featOkTst && casFeat_articleSum == null)
      jcas.throwFeatMissing("articleSum", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_articleSum, v);}
    
  
 
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
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataWebis16Editorials_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lastUpdate = jcas.getRequiredFeatureDE(casType, "lastUpdate", "uima.cas.String", featOkTst);
    casFeatCode_lastUpdate  = (null == casFeat_lastUpdate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastUpdate).getCode();

 
    casFeat_url = jcas.getRequiredFeatureDE(casType, "url", "uima.cas.String", featOkTst);
    casFeatCode_url  = (null == casFeat_url) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_url).getCode();

 
    casFeat_portal = jcas.getRequiredFeatureDE(casType, "portal", "uima.cas.String", featOkTst);
    casFeatCode_portal  = (null == casFeat_portal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_portal).getCode();

 
    casFeat_authors = jcas.getRequiredFeatureDE(casType, "authors", "uima.cas.String", featOkTst);
    casFeatCode_authors  = (null == casFeat_authors) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_authors).getCode();

 
    casFeat_articleSum = jcas.getRequiredFeatureDE(casType, "articleSum", "uima.cas.String", featOkTst);
    casFeatCode_articleSum  = (null == casFeat_articleSum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_articleSum).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

  }
}



    