

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The metadata of the texts in the user-generated web discourse corpus.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataUGWD extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataUGWD.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MetadataUGWD() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataUGWD(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataUGWD(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataUGWD(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: author

  /** getter for author - gets The name of the author
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets The name of the author 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: docType

  /** getter for docType - gets The document type
   * @generated
   * @return value of the feature 
   */
  public String getDocType() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_docType == null)
      jcasType.jcas.throwFeatMissing("docType", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_docType);}
    
  /** setter for docType - sets The document type 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocType(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_docType == null)
      jcasType.jcas.throwFeatMissing("docType", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_docType, v);}    
   
    
  //*--------------*
  //* Feature: origURL

  /** getter for origURL - gets The original URL
   * @generated
   * @return value of the feature 
   */
  public String getOrigURL() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_origURL == null)
      jcasType.jcas.throwFeatMissing("origURL", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_origURL);}
    
  /** setter for origURL - sets The original URL 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigURL(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_origURL == null)
      jcasType.jcas.throwFeatMissing("origURL", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_origURL, v);}    
   
    
  //*--------------*
  //* Feature: topic

  /** getter for topic - gets The topic
   * @generated
   * @return value of the feature 
   */
  public String getTopic() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_topic);}
    
  /** setter for topic - sets The topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_topic, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets The title
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets The title 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: thumbsUp

  /** getter for thumbsUp - gets The number of thumbs-up votes
   * @generated
   * @return value of the feature 
   */
  public int getThumbsUp() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_thumbsUp == null)
      jcasType.jcas.throwFeatMissing("thumbsUp", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_thumbsUp);}
    
  /** setter for thumbsUp - sets The number of thumbs-up votes 
   * @generated
   * @param v value to set into the feature 
   */
  public void setThumbsUp(int v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_thumbsUp == null)
      jcasType.jcas.throwFeatMissing("thumbsUp", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_thumbsUp, v);}    
   
    
  //*--------------*
  //* Feature: thumbsDown

  /** getter for thumbsDown - gets The number of thumbs-down votes
   * @generated
   * @return value of the feature 
   */
  public int getThumbsDown() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_thumbsDown == null)
      jcasType.jcas.throwFeatMissing("thumbsDown", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_thumbsDown);}
    
  /** setter for thumbsDown - sets The number of thumbs-down votes 
   * @generated
   * @param v value to set into the feature 
   */
  public void setThumbsDown(int v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_thumbsDown == null)
      jcasType.jcas.throwFeatMissing("thumbsDown", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_thumbsDown, v);}    
   
    
  //*--------------*
  //* Feature: origID

  /** getter for origID - gets The original ID
   * @generated
   * @return value of the feature 
   */
  public int getOrigID() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_origID == null)
      jcasType.jcas.throwFeatMissing("origID", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_origID);}
    
  /** setter for origID - sets The original ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigID(int v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_origID == null)
      jcasType.jcas.throwFeatMissing("origID", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_origID, v);}    
   
    
  //*--------------*
  //* Feature: note

  /** getter for note - gets Notes
   * @generated
   * @return value of the feature 
   */
  public String getNote() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_note);}
    
  /** setter for note - sets Notes 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNote(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_note, v);}    
   
    
  //*--------------*
  //* Feature: date

  /** getter for date - gets The date
   * @generated
   * @return value of the feature 
   */
  public String getDate() {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets The date 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    if (MetadataUGWD_Type.featOkTst && ((MetadataUGWD_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataUGWD");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataUGWD_Type)jcasType).casFeatCode_date, v);}    
  }

    