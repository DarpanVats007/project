
/* First created by JCasGen Tue Sep 26 16:51:18 CEST 2017 */
package org.apache.uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** All Data given to one Discussion
 * Updated by JCasGen Tue Sep 26 17:32:32 CEST 2017
 * @generated */
public class Discussion_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Discussion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.Discussion");
 
  /** @generated */
  final Feature casFeat_ArgumentList;
  /** @generated */
  final int     casFeatCode_ArgumentList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getArgumentList(int addr) {
        if (featOkTst && casFeat_ArgumentList == null)
      jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArgumentList(int addr, int v) {
        if (featOkTst && casFeat_ArgumentList == null)
      jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    ll_cas.ll_setRefValue(addr, casFeatCode_ArgumentList, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getArgumentList(int addr, int i) {
        if (featOkTst && casFeat_ArgumentList == null)
      jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setArgumentList(int addr, int i, String v) {
        if (featOkTst && casFeat_ArgumentList == null)
      jcas.throwFeatMissing("ArgumentList", "org.apache.uima.Discussion");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ArgumentList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_URL;
  /** @generated */
  final int     casFeatCode_URL;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getURL(int addr) {
        if (featOkTst && casFeat_URL == null)
      jcas.throwFeatMissing("URL", "org.apache.uima.Discussion");
    return ll_cas.ll_getStringValue(addr, casFeatCode_URL);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setURL(int addr, String v) {
        if (featOkTst && casFeat_URL == null)
      jcas.throwFeatMissing("URL", "org.apache.uima.Discussion");
    ll_cas.ll_setStringValue(addr, casFeatCode_URL, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Discussion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ArgumentList = jcas.getRequiredFeatureDE(casType, "ArgumentList", "uima.cas.StringArray", featOkTst);
    casFeatCode_ArgumentList  = (null == casFeat_ArgumentList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ArgumentList).getCode();

 
    casFeat_URL = jcas.getRequiredFeatureDE(casType, "URL", "uima.cas.String", featOkTst);
    casFeatCode_URL  = (null == casFeat_URL) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_URL).getCode();

  }
}



    