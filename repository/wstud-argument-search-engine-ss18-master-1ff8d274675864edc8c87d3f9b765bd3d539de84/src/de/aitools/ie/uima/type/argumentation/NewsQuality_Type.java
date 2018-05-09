
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Classification_Type;

/** All quality scores assigned to a news article, each in the range from 1 to 5
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * @generated */
public class NewsQuality_Type extends Classification_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NewsQuality.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.NewsQuality");
 
  /** @generated */
  final Feature casFeat_fluency;
  /** @generated */
  final int     casFeatCode_fluency;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFluency(int addr) {
        if (featOkTst && casFeat_fluency == null)
      jcas.throwFeatMissing("fluency", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_fluency);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFluency(int addr, double v) {
        if (featOkTst && casFeat_fluency == null)
      jcas.throwFeatMissing("fluency", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_fluency, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conciseness;
  /** @generated */
  final int     casFeatCode_conciseness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConciseness(int addr) {
        if (featOkTst && casFeat_conciseness == null)
      jcas.throwFeatMissing("conciseness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_conciseness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConciseness(int addr, double v) {
        if (featOkTst && casFeat_conciseness == null)
      jcas.throwFeatMissing("conciseness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_conciseness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_descriptiveness;
  /** @generated */
  final int     casFeatCode_descriptiveness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDescriptiveness(int addr) {
        if (featOkTst && casFeat_descriptiveness == null)
      jcas.throwFeatMissing("descriptiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_descriptiveness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescriptiveness(int addr, double v) {
        if (featOkTst && casFeat_descriptiveness == null)
      jcas.throwFeatMissing("descriptiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_descriptiveness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_novelty;
  /** @generated */
  final int     casFeatCode_novelty;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNovelty(int addr) {
        if (featOkTst && casFeat_novelty == null)
      jcas.throwFeatMissing("novelty", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_novelty);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNovelty(int addr, double v) {
        if (featOkTst && casFeat_novelty == null)
      jcas.throwFeatMissing("novelty", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_novelty, v);}
    
  
 
  /** @generated */
  final Feature casFeat_completeness;
  /** @generated */
  final int     casFeatCode_completeness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getCompleteness(int addr) {
        if (featOkTst && casFeat_completeness == null)
      jcas.throwFeatMissing("completeness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_completeness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCompleteness(int addr, double v) {
        if (featOkTst && casFeat_completeness == null)
      jcas.throwFeatMissing("completeness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_completeness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_referencing;
  /** @generated */
  final int     casFeatCode_referencing;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getReferencing(int addr) {
        if (featOkTst && casFeat_referencing == null)
      jcas.throwFeatMissing("referencing", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_referencing);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferencing(int addr, double v) {
        if (featOkTst && casFeat_referencing == null)
      jcas.throwFeatMissing("referencing", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_referencing, v);}
    
  
 
  /** @generated */
  final Feature casFeat_formality;
  /** @generated */
  final int     casFeatCode_formality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFormality(int addr) {
        if (featOkTst && casFeat_formality == null)
      jcas.throwFeatMissing("formality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_formality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFormality(int addr, double v) {
        if (featOkTst && casFeat_formality == null)
      jcas.throwFeatMissing("formality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_formality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_richness;
  /** @generated */
  final int     casFeatCode_richness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRichness(int addr) {
        if (featOkTst && casFeat_richness == null)
      jcas.throwFeatMissing("richness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_richness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRichness(int addr, double v) {
        if (featOkTst && casFeat_richness == null)
      jcas.throwFeatMissing("richness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_richness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_attractiveness;
  /** @generated */
  final int     casFeatCode_attractiveness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAttractiveness(int addr) {
        if (featOkTst && casFeat_attractiveness == null)
      jcas.throwFeatMissing("attractiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_attractiveness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttractiveness(int addr, double v) {
        if (featOkTst && casFeat_attractiveness == null)
      jcas.throwFeatMissing("attractiveness", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_attractiveness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_technicality;
  /** @generated */
  final int     casFeatCode_technicality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTechnicality(int addr) {
        if (featOkTst && casFeat_technicality == null)
      jcas.throwFeatMissing("technicality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_technicality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTechnicality(int addr, double v) {
        if (featOkTst && casFeat_technicality == null)
      jcas.throwFeatMissing("technicality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_technicality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_popularity;
  /** @generated */
  final int     casFeatCode_popularity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPopularity(int addr) {
        if (featOkTst && casFeat_popularity == null)
      jcas.throwFeatMissing("popularity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_popularity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPopularity(int addr, double v) {
        if (featOkTst && casFeat_popularity == null)
      jcas.throwFeatMissing("popularity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_popularity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subjectivity;
  /** @generated */
  final int     casFeatCode_subjectivity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSubjectivity(int addr) {
        if (featOkTst && casFeat_subjectivity == null)
      jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_subjectivity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubjectivity(int addr, double v) {
        if (featOkTst && casFeat_subjectivity == null)
      jcas.throwFeatMissing("subjectivity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_subjectivity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_positiveEmotion;
  /** @generated */
  final int     casFeatCode_positiveEmotion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPositiveEmotion(int addr) {
        if (featOkTst && casFeat_positiveEmotion == null)
      jcas.throwFeatMissing("positiveEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_positiveEmotion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPositiveEmotion(int addr, double v) {
        if (featOkTst && casFeat_positiveEmotion == null)
      jcas.throwFeatMissing("positiveEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_positiveEmotion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_negativeEmotion;
  /** @generated */
  final int     casFeatCode_negativeEmotion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNegativeEmotion(int addr) {
        if (featOkTst && casFeat_negativeEmotion == null)
      jcas.throwFeatMissing("negativeEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_negativeEmotion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegativeEmotion(int addr, double v) {
        if (featOkTst && casFeat_negativeEmotion == null)
      jcas.throwFeatMissing("negativeEmotion", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_negativeEmotion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_quality;
  /** @generated */
  final int     casFeatCode_quality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getQuality(int addr) {
        if (featOkTst && casFeat_quality == null)
      jcas.throwFeatMissing("quality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_quality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuality(int addr, double v) {
        if (featOkTst && casFeat_quality == null)
      jcas.throwFeatMissing("quality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_quality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentimentality;
  /** @generated */
  final int     casFeatCode_sentimentality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSentimentality(int addr) {
        if (featOkTst && casFeat_sentimentality == null)
      jcas.throwFeatMissing("sentimentality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_sentimentality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentimentality(int addr, double v) {
        if (featOkTst && casFeat_sentimentality == null)
      jcas.throwFeatMissing("sentimentality", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_sentimentality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_polarity;
  /** @generated */
  final int     casFeatCode_polarity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPolarity(int addr) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, double v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "de.aitools.ie.uima.type.argumentation.NewsQuality");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_polarity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NewsQuality_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fluency = jcas.getRequiredFeatureDE(casType, "fluency", "uima.cas.Double", featOkTst);
    casFeatCode_fluency  = (null == casFeat_fluency) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fluency).getCode();

 
    casFeat_conciseness = jcas.getRequiredFeatureDE(casType, "conciseness", "uima.cas.Double", featOkTst);
    casFeatCode_conciseness  = (null == casFeat_conciseness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conciseness).getCode();

 
    casFeat_descriptiveness = jcas.getRequiredFeatureDE(casType, "descriptiveness", "uima.cas.Double", featOkTst);
    casFeatCode_descriptiveness  = (null == casFeat_descriptiveness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_descriptiveness).getCode();

 
    casFeat_novelty = jcas.getRequiredFeatureDE(casType, "novelty", "uima.cas.Double", featOkTst);
    casFeatCode_novelty  = (null == casFeat_novelty) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_novelty).getCode();

 
    casFeat_completeness = jcas.getRequiredFeatureDE(casType, "completeness", "uima.cas.Double", featOkTst);
    casFeatCode_completeness  = (null == casFeat_completeness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_completeness).getCode();

 
    casFeat_referencing = jcas.getRequiredFeatureDE(casType, "referencing", "uima.cas.Double", featOkTst);
    casFeatCode_referencing  = (null == casFeat_referencing) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_referencing).getCode();

 
    casFeat_formality = jcas.getRequiredFeatureDE(casType, "formality", "uima.cas.Double", featOkTst);
    casFeatCode_formality  = (null == casFeat_formality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_formality).getCode();

 
    casFeat_richness = jcas.getRequiredFeatureDE(casType, "richness", "uima.cas.Double", featOkTst);
    casFeatCode_richness  = (null == casFeat_richness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_richness).getCode();

 
    casFeat_attractiveness = jcas.getRequiredFeatureDE(casType, "attractiveness", "uima.cas.Double", featOkTst);
    casFeatCode_attractiveness  = (null == casFeat_attractiveness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attractiveness).getCode();

 
    casFeat_technicality = jcas.getRequiredFeatureDE(casType, "technicality", "uima.cas.Double", featOkTst);
    casFeatCode_technicality  = (null == casFeat_technicality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_technicality).getCode();

 
    casFeat_popularity = jcas.getRequiredFeatureDE(casType, "popularity", "uima.cas.Double", featOkTst);
    casFeatCode_popularity  = (null == casFeat_popularity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_popularity).getCode();

 
    casFeat_subjectivity = jcas.getRequiredFeatureDE(casType, "subjectivity", "uima.cas.Double", featOkTst);
    casFeatCode_subjectivity  = (null == casFeat_subjectivity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subjectivity).getCode();

 
    casFeat_positiveEmotion = jcas.getRequiredFeatureDE(casType, "positiveEmotion", "uima.cas.Double", featOkTst);
    casFeatCode_positiveEmotion  = (null == casFeat_positiveEmotion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_positiveEmotion).getCode();

 
    casFeat_negativeEmotion = jcas.getRequiredFeatureDE(casType, "negativeEmotion", "uima.cas.Double", featOkTst);
    casFeatCode_negativeEmotion  = (null == casFeat_negativeEmotion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negativeEmotion).getCode();

 
    casFeat_quality = jcas.getRequiredFeatureDE(casType, "quality", "uima.cas.Double", featOkTst);
    casFeatCode_quality  = (null == casFeat_quality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_quality).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_sentimentality = jcas.getRequiredFeatureDE(casType, "sentimentality", "uima.cas.Double", featOkTst);
    casFeatCode_sentimentality  = (null == casFeat_sentimentality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentimentality).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.Double", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

  }
}



    