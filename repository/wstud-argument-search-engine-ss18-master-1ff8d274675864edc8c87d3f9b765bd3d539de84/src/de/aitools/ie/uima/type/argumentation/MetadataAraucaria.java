

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata provided for the Araucaria corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataAraucaria extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataAraucaria.class);
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
  protected MetadataAraucaria() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataAraucaria(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataAraucaria(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataAraucaria(JCas jcas, int begin, int end) {
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

  /** getter for author - gets The name of the author.
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets The name of the author. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: date

  /** getter for date - gets The date the text was created (annotated).
   * @generated
   * @return value of the feature 
   */
  public String getDate() {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets The date the text was created (annotated). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_date, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets Description of the source the text was taken from.
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Description of the source the text was taken from. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: comments

  /** getter for comments - gets Comments
   * @generated
   * @return value of the feature 
   */
  public String getComments() {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_comments == null)
      jcasType.jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_comments);}
    
  /** setter for comments - sets Comments 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComments(String v) {
    if (MetadataAraucaria_Type.featOkTst && ((MetadataAraucaria_Type)jcasType).casFeat_comments == null)
      jcasType.jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataAraucaria_Type)jcasType).casFeatCode_comments, v);}    
  }

    