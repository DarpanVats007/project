

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata provided for the Argument Annotated Essays corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataAAE extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataAAE.class);
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
  protected MetadataAAE() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataAAE(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataAAE(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataAAE(JCas jcas, int begin, int end) {
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
  //* Feature: filename

  /** getter for filename - gets The name of the original corpus essay file.
   * @generated
   * @return value of the feature 
   */
  public String getFilename() {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_filename == null)
      jcasType.jcas.throwFeatMissing("filename", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_filename);}
    
  /** setter for filename - sets The name of the original corpus essay file. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFilename(String v) {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_filename == null)
      jcasType.jcas.throwFeatMissing("filename", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_filename, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets The URL of the source of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The URL of the source of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: topic

  /** getter for topic - gets The topic of the essay
   * @generated
   * @return value of the feature 
   */
  public String getTopic() {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_topic);}
    
  /** setter for topic - sets The topic of the essay 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_topic, v);}    
   
    
  //*--------------*
  //* Feature: twoSided

  /** getter for twoSided - gets Whether the essay discusses both stances on a topic or only the one one ("myside bias").
   * @generated
   * @return value of the feature 
   */
  public String getTwoSided() {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_twoSided == null)
      jcasType.jcas.throwFeatMissing("twoSided", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_twoSided);}
    
  /** setter for twoSided - sets Whether the essay discusses both stances on a topic or only the one one ("myside bias"). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTwoSided(String v) {
    if (MetadataAAE_Type.featOkTst && ((MetadataAAE_Type)jcasType).casFeat_twoSided == null)
      jcasType.jcas.throwFeatMissing("twoSided", "de.aitools.ie.uima.type.argumentation.MetadataAAE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAAE_Type)jcasType).casFeatCode_twoSided, v);}    
  }

    