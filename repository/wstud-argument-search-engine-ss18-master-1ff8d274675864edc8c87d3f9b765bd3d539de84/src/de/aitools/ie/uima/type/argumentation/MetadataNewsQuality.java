

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata of the news articles from the News Quality dataset published in ACL 2016.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataNewsQuality extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataNewsQuality.class);
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
  protected MetadataNewsQuality() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataNewsQuality(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataNewsQuality(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataNewsQuality(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets The ID of the news article given in the dataset.
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (MetadataNewsQuality_Type.featOkTst && ((MetadataNewsQuality_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "de.aitools.ie.uima.type.argumentation.MetadataNewsQuality");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataNewsQuality_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets The ID of the news article given in the dataset. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (MetadataNewsQuality_Type.featOkTst && ((MetadataNewsQuality_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "de.aitools.ie.uima.type.argumentation.MetadataNewsQuality");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataNewsQuality_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets The name of the article given in the dataset
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (MetadataNewsQuality_Type.featOkTst && ((MetadataNewsQuality_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "de.aitools.ie.uima.type.argumentation.MetadataNewsQuality");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataNewsQuality_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets The name of the article given in the dataset 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (MetadataNewsQuality_Type.featOkTst && ((MetadataNewsQuality_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "de.aitools.ie.uima.type.argumentation.MetadataNewsQuality");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataNewsQuality_Type)jcasType).casFeatCode_name, v);}    
  }

    