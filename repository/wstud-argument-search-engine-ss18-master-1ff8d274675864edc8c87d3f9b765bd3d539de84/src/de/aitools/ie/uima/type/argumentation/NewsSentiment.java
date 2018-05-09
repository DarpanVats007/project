

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;


/** The sentence sentiment annotations given in the dataset.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class NewsSentiment extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NewsSentiment.class);
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
  protected NewsSentiment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NewsSentiment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NewsSentiment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NewsSentiment(JCas jcas, int begin, int end) {
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
  //* Feature: subjectivity

  /** getter for subjectivity - gets The subjectivity score
   * @generated
   * @return value of the feature 
   */
  public double getSubjectivity() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_subjectivity == null)
      jcasType.jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_subjectivity);}
    
  /** setter for subjectivity - sets The subjectivity score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubjectivity(double v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_subjectivity == null)
      jcasType.jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_subjectivity, v);}    
   
    
  //*--------------*
  //* Feature: positivity

  /** getter for positivity - gets The positivity score
   * @generated
   * @return value of the feature 
   */
  public double getPositivity() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_positivity == null)
      jcasType.jcas.throwFeatMissing("positivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_positivity);}
    
  /** setter for positivity - sets The positivity score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPositivity(double v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_positivity == null)
      jcasType.jcas.throwFeatMissing("positivity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_positivity, v);}    
   
    
  //*--------------*
  //* Feature: negativity

  /** getter for negativity - gets The negativity score
   * @generated
   * @return value of the feature 
   */
  public double getNegativity() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_negativity == null)
      jcasType.jcas.throwFeatMissing("negativity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_negativity);}
    
  /** setter for negativity - sets The negativity score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegativity(double v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_negativity == null)
      jcasType.jcas.throwFeatMissing("negativity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_negativity, v);}    
   
    
  //*--------------*
  //* Feature: issue

  /** getter for issue - gets The issue flag, "I" for ignore sentence and "S" for sentence splitting issue.
   * @generated
   * @return value of the feature 
   */
  public String getIssue() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_issue == null)
      jcasType.jcas.throwFeatMissing("issue", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_issue);}
    
  /** setter for issue - sets The issue flag, "I" for ignore sentence and "S" for sentence splitting issue. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIssue(String v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_issue == null)
      jcasType.jcas.throwFeatMissing("issue", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setStringValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_issue, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence score of the annotator
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence score of the annotator 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets The polaritv value from {positive, neutral, negative}. This value is not in the original news quality corpus, but it is derived as follows: 

If positivity (negativity) is above 0 and negativity (positivity) is 0, then the polarity is positive (negative). Else, it is neutral.
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets The polaritv value from {positive, neutral, negative}. This value is not in the original news quality corpus, but it is derived as follows: 

If positivity (negativity) is above 0 and negativity (positivity) is 0, then the polarity is positive (negative). Else, it is neutral. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    if (NewsSentiment_Type.featOkTst && ((NewsSentiment_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsSentiment");
    jcasType.ll_cas.ll_setStringValue(addr, ((NewsSentiment_Type)jcasType).casFeatCode_polarity, v);}    
  }

    