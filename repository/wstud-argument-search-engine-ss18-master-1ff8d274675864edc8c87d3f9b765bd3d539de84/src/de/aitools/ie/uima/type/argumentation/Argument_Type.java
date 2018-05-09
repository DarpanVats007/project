
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Relation_Type;

/** An argument, seen here as a relation between an argumentative unit serving as a premise and an argumentative unit serving as a conclusion. The argument may be assigned a certain type. If the represented argument has more than premise in fact, it can be modeled through multiple annotations of this type.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class Argument_Type extends Relation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Argument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.Argument");
 
  /** @generated */
  final Feature casFeat_premises;
  /** @generated */
  final int     casFeatCode_premises;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPremises(int addr) {
        if (featOkTst && casFeat_premises == null)
      jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_premises);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPremises(int addr, int v) {
        if (featOkTst && casFeat_premises == null)
      jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_premises, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getPremises(int addr, int i) {
        if (featOkTst && casFeat_premises == null)
      jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPremises(int addr, int i, int v) {
        if (featOkTst && casFeat_premises == null)
      jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_premises), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_conclusion;
  /** @generated */
  final int     casFeatCode_conclusion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConclusion(int addr) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "de.aitools.ie.uima.type.argumentation.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_conclusion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConclusion(int addr, int v) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "de.aitools.ie.uima.type.argumentation.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_conclusion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_argumentType;
  /** @generated */
  final int     casFeatCode_argumentType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getArgumentType(int addr) {
        if (featOkTst && casFeat_argumentType == null)
      jcas.throwFeatMissing("argumentType", "de.aitools.ie.uima.type.argumentation.Argument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_argumentType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArgumentType(int addr, String v) {
        if (featOkTst && casFeat_argumentType == null)
      jcas.throwFeatMissing("argumentType", "de.aitools.ie.uima.type.argumentation.Argument");
    ll_cas.ll_setStringValue(addr, casFeatCode_argumentType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_stances;
  /** @generated */
  final int     casFeatCode_stances;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStances(int addr) {
        if (featOkTst && casFeat_stances == null)
      jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_stances);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStances(int addr, int v) {
        if (featOkTst && casFeat_stances == null)
      jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_stances, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getStances(int addr, int i) {
        if (featOkTst && casFeat_stances == null)
      jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setStances(int addr, int i, String v) {
        if (featOkTst && casFeat_stances == null)
      jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_stances), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Argument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_premises = jcas.getRequiredFeatureDE(casType, "premises", "uima.cas.FSArray", featOkTst);
    casFeatCode_premises  = (null == casFeat_premises) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_premises).getCode();

 
    casFeat_conclusion = jcas.getRequiredFeatureDE(casType, "conclusion", "de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit", featOkTst);
    casFeatCode_conclusion  = (null == casFeat_conclusion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conclusion).getCode();

 
    casFeat_argumentType = jcas.getRequiredFeatureDE(casType, "argumentType", "uima.cas.String", featOkTst);
    casFeatCode_argumentType  = (null == casFeat_argumentType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_argumentType).getCode();

 
    casFeat_stances = jcas.getRequiredFeatureDE(casType, "stances", "uima.cas.StringArray", featOkTst);
    casFeatCode_stances  = (null == casFeat_stances) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_stances).getCode();

  }
}



    