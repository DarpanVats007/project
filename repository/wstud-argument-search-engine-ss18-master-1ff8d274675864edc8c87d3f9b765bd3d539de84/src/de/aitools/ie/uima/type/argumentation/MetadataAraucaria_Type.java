
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata provided for the Araucaria corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataAraucaria_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataAraucaria.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
 
  /** @generated */
  final Feature casFeat_author;
  /** @generated */
  final int     casFeatCode_author;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    ll_cas.ll_setStringValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_comments;
  /** @generated */
  final int     casFeatCode_comments;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComments(int addr) {
        if (featOkTst && casFeat_comments == null)
      jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comments);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComments(int addr, String v) {
        if (featOkTst && casFeat_comments == null)
      jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataAraucaria");
    ll_cas.ll_setStringValue(addr, casFeatCode_comments, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataAraucaria_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_comments = jcas.getRequiredFeatureDE(casType, "comments", "uima.cas.String", featOkTst);
    casFeatCode_comments  = (null == casFeat_comments) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comments).getCode();

  }
}



    