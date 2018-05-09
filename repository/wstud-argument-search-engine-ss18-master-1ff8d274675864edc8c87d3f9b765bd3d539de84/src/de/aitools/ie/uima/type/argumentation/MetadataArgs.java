

/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata of the arguments used by the args argument search engine.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataArgs extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataArgs.class);
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
  protected MetadataArgs() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataArgs(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataArgs(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataArgs(JCas jcas, int begin, int end) {
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
  //* Feature: title

  /** getter for title - gets The title of the discussion the argument refers to.
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets The title of the discussion the argument refers to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: crawlingDate

  /** getter for crawlingDate - gets The date (including time) on which the argument has been crawled.
   * @generated
   * @return value of the feature 
   */
  public String getCrawlingDate() {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_crawlingDate == null)
      jcasType.jcas.throwFeatMissing("crawlingDate", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_crawlingDate);}
    
  /** setter for crawlingDate - sets The date (including time) on which the argument has been crawled. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCrawlingDate(String v) {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_crawlingDate == null)
      jcasType.jcas.throwFeatMissing("crawlingDate", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_crawlingDate, v);}    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets The URL of the web page from which the argument has been crawled.
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets The URL of the web page from which the argument has been crawled. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (MetadataArgs_Type.featOkTst && ((MetadataArgs_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataArgs");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgs_Type)jcasType).casFeatCode_url, v);}    
  }

    