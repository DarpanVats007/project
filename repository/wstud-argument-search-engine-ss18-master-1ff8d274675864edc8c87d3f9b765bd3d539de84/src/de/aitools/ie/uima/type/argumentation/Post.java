

/* First created by JCasGen Mon Oct 02 15:51:21 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Unit;


/** One post in a discussion.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class Post extends Unit {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Post.class);
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
  protected Post() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Post(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Post(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Post(JCas jcas, int begin, int end) {
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
  //* Feature: postType

  /** getter for postType - gets The type of post.
   * @generated
   * @return value of the feature 
   */
  public String getPostType() {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_postType == null)
      jcasType.jcas.throwFeatMissing("postType", "de.aitools.ie.uima.type.argumentation.Post");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Post_Type)jcasType).casFeatCode_postType);}
    
  /** setter for postType - sets The type of post. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPostType(String v) {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_postType == null)
      jcasType.jcas.throwFeatMissing("postType", "de.aitools.ie.uima.type.argumentation.Post");
    jcasType.ll_cas.ll_setStringValue(addr, ((Post_Type)jcasType).casFeatCode_postType, v);}    
   
    
  //*--------------*
  //* Feature: author

  /** getter for author - gets The author of the post.
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.Post");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Post_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets The author of the post. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "de.aitools.ie.uima.type.argumentation.Post");
    jcasType.ll_cas.ll_setStringValue(addr, ((Post_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: postID

  /** getter for postID - gets The ID of the post.
   * @generated
   * @return value of the feature 
   */
  public String getPostID() {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_postID == null)
      jcasType.jcas.throwFeatMissing("postID", "de.aitools.ie.uima.type.argumentation.Post");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Post_Type)jcasType).casFeatCode_postID);}
    
  /** setter for postID - sets The ID of the post. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPostID(String v) {
    if (Post_Type.featOkTst && ((Post_Type)jcasType).casFeat_postID == null)
      jcasType.jcas.throwFeatMissing("postID", "de.aitools.ie.uima.type.argumentation.Post");
    jcasType.ll_cas.ll_setStringValue(addr, ((Post_Type)jcasType).casFeatCode_postID, v);}    
  }

    