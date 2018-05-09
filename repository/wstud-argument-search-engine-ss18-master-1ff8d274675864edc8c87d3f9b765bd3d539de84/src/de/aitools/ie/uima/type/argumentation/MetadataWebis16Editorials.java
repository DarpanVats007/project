

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata of a news editorial from the Webis-16-Editorials corpus.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataWebis16Editorials extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataWebis16Editorials.class);
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
  protected MetadataWebis16Editorials() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataWebis16Editorials(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataWebis16Editorials(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataWebis16Editorials(JCas jcas, int begin, int end) {
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
  //* Feature: lastUpdate

  /** getter for lastUpdate - gets The date of the last update of the news editorial
   * @generated
   * @return value of the feature 
   */
  public String getLastUpdate() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_lastUpdate == null)
      jcasType.jcas.throwFeatMissing("lastUpdate", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_lastUpdate);}
    
  /** setter for lastUpdate - sets The date of the last update of the news editorial 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastUpdate(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_lastUpdate == null)
      jcasType.jcas.throwFeatMissing("lastUpdate", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_lastUpdate, v);}    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets The URL of the editorial
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets The URL of the editorial 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_url, v);}    
   
    
  //*--------------*
  //* Feature: portal

  /** getter for portal - gets The short name of the portal from the which editorial was retrieved.
   * @generated
   * @return value of the feature 
   */
  public String getPortal() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_portal == null)
      jcasType.jcas.throwFeatMissing("portal", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_portal);}
    
  /** setter for portal - sets The short name of the portal from the which editorial was retrieved. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPortal(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_portal == null)
      jcasType.jcas.throwFeatMissing("portal", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_portal, v);}    
   
    
  //*--------------*
  //* Feature: authors

  /** getter for authors - gets The authors of the editorial
   * @generated
   * @return value of the feature 
   */
  public String getAuthors() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_authors);}
    
  /** setter for authors - sets The authors of the editorial 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthors(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_authors, v);}    
   
    
  //*--------------*
  //* Feature: articleSum

  /** getter for articleSum - gets The sum of the editorial
   * @generated
   * @return value of the feature 
   */
  public String getArticleSum() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_articleSum == null)
      jcasType.jcas.throwFeatMissing("articleSum", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_articleSum);}
    
  /** setter for articleSum - sets The sum of the editorial 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArticleSum(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_articleSum == null)
      jcasType.jcas.throwFeatMissing("articleSum", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_articleSum, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets The title of the editorial
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets The title of the editorial 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (MetadataWebis16Editorials_Type.featOkTst && ((MetadataWebis16Editorials_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataWebis16Editorials");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataWebis16Editorials_Type)jcasType).casFeatCode_title, v);}    
  }

    