

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;


/** All quality scores assigned to a news article, each in the range from 1 to 5
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class NewsQuality extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NewsQuality.class);
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
  protected NewsQuality() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NewsQuality(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NewsQuality(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NewsQuality(JCas jcas, int begin, int end) {
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
  //* Feature: fluency

  /** getter for fluency - gets The fluency score
   * @generated
   * @return value of the feature 
   */
  public double getFluency() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_fluency == null)
      jcasType.jcas.throwFeatMissing("fluency", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_fluency);}
    
  /** setter for fluency - sets The fluency score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFluency(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_fluency == null)
      jcasType.jcas.throwFeatMissing("fluency", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_fluency, v);}    
   
    
  //*--------------*
  //* Feature: conciseness

  /** getter for conciseness - gets The conciseness score
   * @generated
   * @return value of the feature 
   */
  public double getConciseness() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_conciseness == null)
      jcasType.jcas.throwFeatMissing("conciseness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_conciseness);}
    
  /** setter for conciseness - sets The conciseness score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConciseness(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_conciseness == null)
      jcasType.jcas.throwFeatMissing("conciseness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_conciseness, v);}    
   
    
  //*--------------*
  //* Feature: descriptiveness

  /** getter for descriptiveness - gets The descriptiveness score
   * @generated
   * @return value of the feature 
   */
  public double getDescriptiveness() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_descriptiveness == null)
      jcasType.jcas.throwFeatMissing("descriptiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_descriptiveness);}
    
  /** setter for descriptiveness - sets The descriptiveness score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescriptiveness(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_descriptiveness == null)
      jcasType.jcas.throwFeatMissing("descriptiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_descriptiveness, v);}    
   
    
  //*--------------*
  //* Feature: novelty

  /** getter for novelty - gets The novelty score
   * @generated
   * @return value of the feature 
   */
  public double getNovelty() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_novelty == null)
      jcasType.jcas.throwFeatMissing("novelty", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_novelty);}
    
  /** setter for novelty - sets The novelty score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNovelty(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_novelty == null)
      jcasType.jcas.throwFeatMissing("novelty", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_novelty, v);}    
   
    
  //*--------------*
  //* Feature: completeness

  /** getter for completeness - gets The completeness score
   * @generated
   * @return value of the feature 
   */
  public double getCompleteness() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_completeness == null)
      jcasType.jcas.throwFeatMissing("completeness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_completeness);}
    
  /** setter for completeness - sets The completeness score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCompleteness(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_completeness == null)
      jcasType.jcas.throwFeatMissing("completeness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_completeness, v);}    
   
    
  //*--------------*
  //* Feature: referencing

  /** getter for referencing - gets The referencing score
   * @generated
   * @return value of the feature 
   */
  public double getReferencing() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_referencing == null)
      jcasType.jcas.throwFeatMissing("referencing", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_referencing);}
    
  /** setter for referencing - sets The referencing score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferencing(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_referencing == null)
      jcasType.jcas.throwFeatMissing("referencing", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_referencing, v);}    
   
    
  //*--------------*
  //* Feature: formality

  /** getter for formality - gets The formality score
   * @generated
   * @return value of the feature 
   */
  public double getFormality() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_formality == null)
      jcasType.jcas.throwFeatMissing("formality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_formality);}
    
  /** setter for formality - sets The formality score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormality(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_formality == null)
      jcasType.jcas.throwFeatMissing("formality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_formality, v);}    
   
    
  //*--------------*
  //* Feature: richness

  /** getter for richness - gets The richness score
   * @generated
   * @return value of the feature 
   */
  public double getRichness() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_richness == null)
      jcasType.jcas.throwFeatMissing("richness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_richness);}
    
  /** setter for richness - sets The richness score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRichness(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_richness == null)
      jcasType.jcas.throwFeatMissing("richness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_richness, v);}    
   
    
  //*--------------*
  //* Feature: attractiveness

  /** getter for attractiveness - gets The attractiveness score
   * @generated
   * @return value of the feature 
   */
  public double getAttractiveness() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_attractiveness == null)
      jcasType.jcas.throwFeatMissing("attractiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_attractiveness);}
    
  /** setter for attractiveness - sets The attractiveness score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttractiveness(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_attractiveness == null)
      jcasType.jcas.throwFeatMissing("attractiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_attractiveness, v);}    
   
    
  //*--------------*
  //* Feature: technicality

  /** getter for technicality - gets The technicality score
   * @generated
   * @return value of the feature 
   */
  public double getTechnicality() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_technicality == null)
      jcasType.jcas.throwFeatMissing("technicality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_technicality);}
    
  /** setter for technicality - sets The technicality score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTechnicality(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_technicality == null)
      jcasType.jcas.throwFeatMissing("technicality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_technicality, v);}    
   
    
  //*--------------*
  //* Feature: popularity

  /** getter for popularity - gets The popularity score
   * @generated
   * @return value of the feature 
   */
  public double getPopularity() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_popularity == null)
      jcasType.jcas.throwFeatMissing("popularity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_popularity);}
    
  /** setter for popularity - sets The popularity score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPopularity(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_popularity == null)
      jcasType.jcas.throwFeatMissing("popularity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_popularity, v);}    
   
    
  //*--------------*
  //* Feature: subjectivity

  /** getter for subjectivity - gets The subjectivity score
   * @generated
   * @return value of the feature 
   */
  public double getSubjectivity() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_subjectivity == null)
      jcasType.jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_subjectivity);}
    
  /** setter for subjectivity - sets The subjectivity score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubjectivity(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_subjectivity == null)
      jcasType.jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_subjectivity, v);}    
   
    
  //*--------------*
  //* Feature: positiveEmotion

  /** getter for positiveEmotion - gets The positive emotion score
   * @generated
   * @return value of the feature 
   */
  public double getPositiveEmotion() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_positiveEmotion == null)
      jcasType.jcas.throwFeatMissing("positiveEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_positiveEmotion);}
    
  /** setter for positiveEmotion - sets The positive emotion score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPositiveEmotion(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_positiveEmotion == null)
      jcasType.jcas.throwFeatMissing("positiveEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_positiveEmotion, v);}    
   
    
  //*--------------*
  //* Feature: negativeEmotion

  /** getter for negativeEmotion - gets The negative emotion score
   * @generated
   * @return value of the feature 
   */
  public double getNegativeEmotion() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_negativeEmotion == null)
      jcasType.jcas.throwFeatMissing("negativeEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_negativeEmotion);}
    
  /** setter for negativeEmotion - sets The negative emotion score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegativeEmotion(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_negativeEmotion == null)
      jcasType.jcas.throwFeatMissing("negativeEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_negativeEmotion, v);}    
   
    
  //*--------------*
  //* Feature: quality

  /** getter for quality - gets The overall quality score
   * @generated
   * @return value of the feature 
   */
  public double getQuality() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_quality == null)
      jcasType.jcas.throwFeatMissing("quality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_quality);}
    
  /** setter for quality - sets The overall quality score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuality(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_quality == null)
      jcasType.jcas.throwFeatMissing("quality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_quality, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence score of the annotator
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence score of the annotator 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: sentimentality

  /** getter for sentimentality - gets The sentimentality score. Computed as  = abs(positiveEmotion) + abs(negativeEmotion) - 2 (which the authors clarified after asking them).
   * @generated
   * @return value of the feature 
   */
  public double getSentimentality() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_sentimentality == null)
      jcasType.jcas.throwFeatMissing("sentimentality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_sentimentality);}
    
  /** setter for sentimentality - sets The sentimentality score. Computed as  = abs(positiveEmotion) + abs(negativeEmotion) - 2 (which the authors clarified after asking them). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentimentality(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_sentimentality == null)
      jcasType.jcas.throwFeatMissing("sentimentality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_sentimentality, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets The polarity score. Computed as  = positiveEmotion - negativeEmotion (which the authors clarified after asking them).
   * @generated
   * @return value of the feature 
   */
  public double getPolarity() {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets The polarity score. Computed as  = positiveEmotion - negativeEmotion (which the authors clarified after asking them). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(double v) {
    if (NewsQuality_Type.featOkTst && ((NewsQuality_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NewsQuality_Type)jcasType).casFeatCode_polarity, v);}    
  }

    