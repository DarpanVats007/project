

/* First created by JCasGen Tue Sep 26 16:51:18 CEST 2017 */
package org.apache.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** All Data given to one Discussion
 * Updated by JCasGen Tue Sep 26 17:32:32 CEST 2017
 * XML source: /home/jonas/Documents/ArgumentSearch/Indexing/desc/indexingDescriptor.xml
 * @generated */
public class Discussion extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Discussion.class);
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
  protected Discussion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Discussion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Discussion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Discussion(JCas jcas, int begin, int end) {
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
  //* Feature: ArgumentList

  /** getter for ArgumentList - gets List of Arguments related to the same Discussion
   * @generated
   * @return value of the feature 
   */
  public StringArray getArgumentList() {
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_ArgumentList == null)
      jcasType.jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList)));}
    
  /** setter for ArgumentList - sets List of Arguments related to the same Discussion 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgumentList(StringArray v) {
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_ArgumentList == null)
      jcasType.jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    jcasType.ll_cas.ll_setRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ArgumentList - gets an indexed value - List of Arguments related to the same Discussion
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getArgumentList(int i) {
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_ArgumentList == null)
      jcasType.jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList), i);}

  /** indexed setter for ArgumentList - sets an indexed value - List of Arguments related to the same Discussion
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setArgumentList(int i, String v) { 
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_ArgumentList == null)
      jcasType.jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Discussion_Type)jcasType).casFeatCode_ArgumentList), i, v);}
   
    
  //*--------------*
  //* Feature: URL

  /** getter for URL - gets Contains the URL of the Discussion
   * @generated
   * @return value of the feature 
   */
  public String getURL() {
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_URL == null)
      jcasType.jcas.throwFeatMissing("URL", "org.apache.uima.Discussion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Discussion_Type)jcasType).casFeatCode_URL);}
    
  /** setter for URL - sets Contains the URL of the Discussion 
   * @generated
   * @param v value to set into the feature 
   */
  public void setURL(String v) {
    if (Discussion_Type.featOkTst && ((Discussion_Type)jcasType).casFeat_URL == null)
      jcasType.jcas.throwFeatMissing("URL", "org.apache.uima.Discussion");
    jcasType.ll_cas.ll_setStringValue(addr, ((Discussion_Type)jcasType).casFeatCode_URL, v);}    
  }

    