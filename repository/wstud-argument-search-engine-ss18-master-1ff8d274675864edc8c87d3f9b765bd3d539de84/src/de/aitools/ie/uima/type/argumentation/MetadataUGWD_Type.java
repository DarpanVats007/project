
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The metadata of the texts in the user-generated web discourse corpus.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataUGWD_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataUGWD.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataUGWD");
 
  /** @generated */
  final Feature casFeat_author;
  /** @generated */
  final int     casFeatCode_author;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_docType;
  /** @generated */
  final int     casFeatCode_docType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocType(int addr) {
        if (featOkTst && casFeat_docType == null)
      jcas.throwFeatMissing("docType", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_docType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocType(int addr, String v) {
        if (featOkTst && casFeat_docType == null)
      jcas.throwFeatMissing("docType", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_docType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origURL;
  /** @generated */
  final int     casFeatCode_origURL;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOrigURL(int addr) {
        if (featOkTst && casFeat_origURL == null)
      jcas.throwFeatMissing("origURL", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_origURL);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigURL(int addr, String v) {
        if (featOkTst && casFeat_origURL == null)
      jcas.throwFeatMissing("origURL", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_origURL, v);}
    
  
 
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
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopic(int addr, String v) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_topic, v);}
    
  
 
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
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_thumbsUp;
  /** @generated */
  final int     casFeatCode_thumbsUp;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getThumbsUp(int addr) {
        if (featOkTst && casFeat_thumbsUp == null)
      jcas.throwFeatMissing("thumbsUp", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getIntValue(addr, casFeatCode_thumbsUp);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setThumbsUp(int addr, int v) {
        if (featOkTst && casFeat_thumbsUp == null)
      jcas.throwFeatMissing("thumbsUp", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setIntValue(addr, casFeatCode_thumbsUp, v);}
    
  
 
  /** @generated */
  final Feature casFeat_thumbsDown;
  /** @generated */
  final int     casFeatCode_thumbsDown;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getThumbsDown(int addr) {
        if (featOkTst && casFeat_thumbsDown == null)
      jcas.throwFeatMissing("thumbsDown", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getIntValue(addr, casFeatCode_thumbsDown);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setThumbsDown(int addr, int v) {
        if (featOkTst && casFeat_thumbsDown == null)
      jcas.throwFeatMissing("thumbsDown", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setIntValue(addr, casFeatCode_thumbsDown, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origID;
  /** @generated */
  final int     casFeatCode_origID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrigID(int addr) {
        if (featOkTst && casFeat_origID == null)
      jcas.throwFeatMissing("origID", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getIntValue(addr, casFeatCode_origID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigID(int addr, int v) {
        if (featOkTst && casFeat_origID == null)
      jcas.throwFeatMissing("origID", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setIntValue(addr, casFeatCode_origID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_note);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNote(int addr, String v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_note, v);}
    
  
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    ll_cas.ll_setStringValue(addr, casFeatCode_date, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataUGWD_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_docType = jcas.getRequiredFeatureDE(casType, "docType", "uima.cas.String", featOkTst);
    casFeatCode_docType  = (null == casFeat_docType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docType).getCode();

 
    casFeat_origURL = jcas.getRequiredFeatureDE(casType, "origURL", "uima.cas.String", featOkTst);
    casFeatCode_origURL  = (null == casFeat_origURL) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origURL).getCode();

 
    casFeat_topic = jcas.getRequiredFeatureDE(casType, "topic", "uima.cas.String", featOkTst);
    casFeatCode_topic  = (null == casFeat_topic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topic).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_thumbsUp = jcas.getRequiredFeatureDE(casType, "thumbsUp", "uima.cas.Integer", featOkTst);
    casFeatCode_thumbsUp  = (null == casFeat_thumbsUp) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_thumbsUp).getCode();

 
    casFeat_thumbsDown = jcas.getRequiredFeatureDE(casType, "thumbsDown", "uima.cas.Integer", featOkTst);
    casFeatCode_thumbsDown  = (null == casFeat_thumbsDown) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_thumbsDown).getCode();

 
    casFeat_origID = jcas.getRequiredFeatureDE(casType, "origID", "uima.cas.Integer", featOkTst);
    casFeatCode_origID  = (null == casFeat_origID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origID).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.String", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

  }
}



    