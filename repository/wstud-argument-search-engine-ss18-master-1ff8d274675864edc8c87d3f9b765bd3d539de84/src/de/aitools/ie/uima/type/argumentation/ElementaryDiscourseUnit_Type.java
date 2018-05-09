
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Unit_Type;

/** A basic unit of the discourse of a text. The unit may be assigned a certain type.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class ElementaryDiscourseUnit_Type extends Unit_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ElementaryDiscourseUnit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.ElementaryDiscourseUnit");
 
  /** @generated */
  final Feature casFeat_unitType;
  /** @generated */
  final int     casFeatCode_unitType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnitType(int addr) {
        if (featOkTst && casFeat_unitType == null)
      jcas.throwFeatMissing("unitType", "de.aitools.ie.uima.type.argumentation.ElementaryDiscourseUnit");
    return ll_cas.ll_getStringValue(addr, casFeatCode_unitType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnitType(int addr, String v) {
        if (featOkTst && casFeat_unitType == null)
      jcas.throwFeatMissing("unitType", "de.aitools.ie.uima.type.argumentation.ElementaryDiscourseUnit");
    ll_cas.ll_setStringValue(addr, casFeatCode_unitType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ElementaryDiscourseUnit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unitType = jcas.getRequiredFeatureDE(casType, "unitType", "uima.cas.String", featOkTst);
    casFeatCode_unitType  = (null == casFeat_unitType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unitType).getCode();

  }
}



    