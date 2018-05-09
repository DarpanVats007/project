

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata provided for the Arg-Microtext corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataArgMicrotext extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataArgMicrotext.class);
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
  protected MetadataArgMicrotext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataArgMicrotext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataArgMicrotext(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataArgMicrotext(JCas jcas, int begin, int end) {
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
  //* Feature: textID

  /** getter for textID - gets The ID of the text.
   * @generated
   * @return value of the feature 
   */
  public String getTextID() {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_textID == null)
      jcasType.jcas.throwFeatMissing("textID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_textID);}
    
  /** setter for textID - sets The ID of the text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTextID(String v) {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_textID == null)
      jcasType.jcas.throwFeatMissing("textID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_textID, v);}    
   
    
  //*--------------*
  //* Feature: topicID

  /** getter for topicID - gets The ID (short name) of the topic.
   * @generated
   * @return value of the feature 
   */
  public String getTopicID() {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_topicID == null)
      jcasType.jcas.throwFeatMissing("topicID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_topicID);}
    
  /** setter for topicID - sets The ID (short name) of the topic. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopicID(String v) {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_topicID == null)
      jcasType.jcas.throwFeatMissing("topicID", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_topicID, v);}    
   
    
  //*--------------*
  //* Feature: stance

  /** getter for stance - gets The stance of the text.
   * @generated
   * @return value of the feature 
   */
  public String getStance() {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_stance == null)
      jcasType.jcas.throwFeatMissing("stance", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_stance);}
    
  /** setter for stance - sets The stance of the text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStance(String v) {
    if (MetadataArgMicrotext_Type.featOkTst && ((MetadataArgMicrotext_Type)jcasType).casFeat_stance == null)
      jcasType.jcas.throwFeatMissing("stance", "de.aitools.ie.uima.type.argumentation.MetadataArgMicrotext");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataArgMicrotext_Type)jcasType).casFeatCode_stance, v);}    
  }

    