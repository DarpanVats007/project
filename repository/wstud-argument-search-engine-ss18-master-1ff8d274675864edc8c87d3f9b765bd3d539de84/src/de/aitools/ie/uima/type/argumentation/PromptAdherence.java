

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;


/** Text-level classification of the prompt adherence of an essay, as defined in (Persing and Ng, ACL 2014).
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class PromptAdherence extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PromptAdherence.class);
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
  protected PromptAdherence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PromptAdherence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PromptAdherence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PromptAdherence(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets The prompt adherence score from the scale [1.0, 4.0].
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The prompt adherence score from the scale [1.0, 4.0]. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: fold

  /** getter for fold - gets The number of the fold within the cross-validation of Persing and Ng (where available).
   * @generated
   * @return value of the feature 
   */
  public int getFold() {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_fold == null)
      jcasType.jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_fold);}
    
  /** setter for fold - sets The number of the fold within the cross-validation of Persing and Ng (where available). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFold(int v) {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_fold == null)
      jcasType.jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    jcasType.ll_cas.ll_setIntValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_fold, v);}    
   
    
  //*--------------*
  //* Feature: errors1

  /** getter for errors1 - gets List of prompt adherence error types with respect to the first component of the respective prompt. The error types are separated by commas.
   * @generated
   * @return value of the feature 
   */
  public String getErrors1() {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors1 == null)
      jcasType.jcas.throwFeatMissing("errors1", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors1);}
    
  /** setter for errors1 - sets List of prompt adherence error types with respect to the first component of the respective prompt. The error types are separated by commas. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setErrors1(String v) {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors1 == null)
      jcasType.jcas.throwFeatMissing("errors1", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    jcasType.ll_cas.ll_setStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors1, v);}    
   
    
  //*--------------*
  //* Feature: errors2

  /** getter for errors2 - gets List of prompt adherence error types with respect to the second component of the respective prompt. The error types are separated by commas.
   * @generated
   * @return value of the feature 
   */
  public String getErrors2() {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors2 == null)
      jcasType.jcas.throwFeatMissing("errors2", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors2);}
    
  /** setter for errors2 - sets List of prompt adherence error types with respect to the second component of the respective prompt. The error types are separated by commas. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setErrors2(String v) {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors2 == null)
      jcasType.jcas.throwFeatMissing("errors2", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    jcasType.ll_cas.ll_setStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors2, v);}    
   
    
  //*--------------*
  //* Feature: errors3

  /** getter for errors3 - gets List of prompt adherence error types with respect to the third component of the respective prompt. The error types are separated by commas.
   * @generated
   * @return value of the feature 
   */
  public String getErrors3() {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors3 == null)
      jcasType.jcas.throwFeatMissing("errors3", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors3);}
    
  /** setter for errors3 - sets List of prompt adherence error types with respect to the third component of the respective prompt. The error types are separated by commas. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setErrors3(String v) {
    if (PromptAdherence_Type.featOkTst && ((PromptAdherence_Type)jcasType).casFeat_errors3 == null)
      jcasType.jcas.throwFeatMissing("errors3", "de.aitools.ie.uima.type.argumentation.PromptAdherence");
    jcasType.ll_cas.ll_setStringValue(addr, ((PromptAdherence_Type)jcasType).casFeatCode_errors3, v);}    
  }

    