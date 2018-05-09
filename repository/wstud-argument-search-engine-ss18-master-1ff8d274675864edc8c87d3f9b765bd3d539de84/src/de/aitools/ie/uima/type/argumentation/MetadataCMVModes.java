

/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The metadata of the texts in the Change My View Modes corpus.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataCMVModes extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataCMVModes.class);
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
  protected MetadataCMVModes() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataCMVModes(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataCMVModes(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataCMVModes(JCas jcas, int begin, int end) {
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
  //* Feature: url

  /** getter for url - gets The URL of the CMV thread.
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets The URL of the CMV thread. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_url, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets The title
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets The title 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: delta

  /** getter for delta - gets Whether the thread received a delta or not.
   * @generated
   * @return value of the feature 
   */
  public boolean getDelta() {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_delta == null)
      jcasType.jcas.throwFeatMissing("delta", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_delta);}
    
  /** setter for delta - sets Whether the thread received a delta or not. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDelta(boolean v) {
    if (MetadataCMVModes_Type.featOkTst && ((MetadataCMVModes_Type)jcasType).casFeat_delta == null)
      jcasType.jcas.throwFeatMissing("delta", "de.aitools.ie.uima.type.argumentation.MetadataCMVModes");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((MetadataCMVModes_Type)jcasType).casFeatCode_delta, v);}    
  }

    