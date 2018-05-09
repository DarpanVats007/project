

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata provided for the Dagstuhl 15512 ArgQuality corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataArgQuality extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataArgQuality.class);
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
  protected MetadataArgQuality() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataArgQuality(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataArgQuality(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataArgQuality(JCas jcas, int begin, int end) {
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
  //* Feature: perspective

  /** getter for perspective - gets The perspective of the argument
   * @generated
   * @return value of the feature 
   */
  public String getPerspective() {
    if (MetadataArgQuality_Type.featOkTst && ((MetadataArgQuality_Type)jcasType).casFeat_perspective == null)
      jcasType.jcas.throwFeatMissing("perspective", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgQuality_Type)jcasType).casFeatCode_perspective);}
    
  /** setter for perspective - sets The perspective of the argument 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPerspective(String v) {
    if (MetadataArgQuality_Type.featOkTst && ((MetadataArgQuality_Type)jcasType).casFeat_perspective == null)
      jcasType.jcas.throwFeatMissing("perspective", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgQuality_Type)jcasType).casFeatCode_perspective, v);}    
   
    
  //*--------------*
  //* Feature: topic

  /** getter for topic - gets The topic of the argument
   * @generated
   * @return value of the feature 
   */
  public String getTopic() {
    if (MetadataArgQuality_Type.featOkTst && ((MetadataArgQuality_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgQuality_Type)jcasType).casFeatCode_topic);}
    
  /** setter for topic - sets The topic of the argument 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    if (MetadataArgQuality_Type.featOkTst && ((MetadataArgQuality_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataArgQuality");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgQuality_Type)jcasType).casFeatCode_topic, v);}    
  }

    