

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;


/** Text-level classification of the organization of an essay, as defined in (Persing and Ng, EMNLP 2010).
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class Organization extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Organization.class);
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
  protected Organization() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Organization(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Organization(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Organization(JCas jcas, int begin, int end) {
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

  /** getter for score - gets The organization score from the scale [1.0, 4.0].
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.Organization");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Organization_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The organization score from the scale [1.0, 4.0]. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "de.aitools.ie.uima.type.argumentation.Organization");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Organization_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: fold

  /** getter for fold - gets The number of the fold within the cross-validation of Persing and Ng (where available).
   * @generated
   * @return value of the feature 
   */
  public int getFold() {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_fold == null)
      jcasType.jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.Organization");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Organization_Type)jcasType).casFeatCode_fold);}
    
  /** setter for fold - sets The number of the fold within the cross-validation of Persing and Ng (where available). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFold(int v) {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_fold == null)
      jcasType.jcas.throwFeatMissing("fold", "de.aitools.ie.uima.type.argumentation.Organization");
    jcasType.ll_cas.ll_setIntValue(addr, ((Organization_Type)jcasType).casFeatCode_fold, v);}    
   
    
  //*--------------*
  //* Feature: allScores

  /** getter for allScores - gets List of all organization scores assigned to an essay, separated by comma. The reason for this feature is that some essays have been annotated multiple times for (Persing and Ng, 2010). The first of these is the one set as the (main) organization score.
   * @generated
   * @return value of the feature 
   */
  public String getAllScores() {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Organization");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Organization_Type)jcasType).casFeatCode_allScores);}
    
  /** setter for allScores - sets List of all organization scores assigned to an essay, separated by comma. The reason for this feature is that some essays have been annotated multiple times for (Persing and Ng, 2010). The first of these is the one set as the (main) organization score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAllScores(String v) {
    if (Organization_Type.featOkTst && ((Organization_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.Organization");
    jcasType.ll_cas.ll_setStringValue(addr, ((Organization_Type)jcasType).casFeatCode_allScores, v);}    
  }

    