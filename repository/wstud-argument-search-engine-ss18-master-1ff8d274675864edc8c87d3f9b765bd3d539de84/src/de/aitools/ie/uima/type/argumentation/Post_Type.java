
/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Unit_Type;

/** One post in a discussion.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * @generated */
public class Post_Type extends Unit_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Post.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.Post");
 
  /** @generated */
  final Feature casFeat_postType;
  /** @generated */
  final int     casFeatCode_postType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPostType(int addr) {
        if (featOkTst && casFeat_postType == null)
      jcas.throwFeatMissing("postType", "de.aitools.ie.uima.type.argumentation.Post");
    return ll_cas.ll_getStringValue(addr, casFeatCode_postType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPostType(int addr, String v) {
        if (featOkTst && casFeat_postType == null)
      jcas.throwFeatMissing("postType", "de.aitools.ie.uima.type.argumentation.Post");
    ll_cas.ll_setStringValue(addr, casFeatCode_postType, v);}
    
  
 
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
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.Post");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.Post");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_postID;
  /** @generated */
  final int     casFeatCode_postID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPostID(int addr) {
        if (featOkTst && casFeat_postID == null)
      jcas.throwFeatMissing("postID", "de.aitools.ie.uima.type.argumentation.Post");
    return ll_cas.ll_getStringValue(addr, casFeatCode_postID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPostID(int addr, String v) {
        if (featOkTst && casFeat_postID == null)
      jcas.throwFeatMissing("postID", "de.aitools.ie.uima.type.argumentation.Post");
    ll_cas.ll_setStringValue(addr, casFeatCode_postID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Post_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_postType = jcas.getRequiredFeatureDE(casType, "postType", "uima.cas.String", featOkTst);
    casFeatCode_postType  = (null == casFeat_postType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_postType).getCode();

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_postID = jcas.getRequiredFeatureDE(casType, "postID", "uima.cas.String", featOkTst);
    casFeatCode_postID  = (null == casFeat_postID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_postID).getCode();

  }
}



    