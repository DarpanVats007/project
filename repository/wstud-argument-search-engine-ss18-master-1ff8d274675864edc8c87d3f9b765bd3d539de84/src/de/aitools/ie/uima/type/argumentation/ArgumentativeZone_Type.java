
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Unit_Type;

/** The argumentative zone annotation type
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class ArgumentativeZone_Type extends Unit_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ArgumentativeZone.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.ArgumentativeZone");
 
  /** @generated */
  final Feature casFeat_zone;
  /** @generated */
  final int     casFeatCode_zone;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getZone(int addr) {
        if (featOkTst && casFeat_zone == null)
      jcas.throwFeatMissing("zone", "de.aitools.ie.uima.type.argumentation.ArgumentativeZone");
    return ll_cas.ll_getStringValue(addr, casFeatCode_zone);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setZone(int addr, String v) {
        if (featOkTst && casFeat_zone == null)
      jcas.throwFeatMissing("zone", "de.aitools.ie.uima.type.argumentation.ArgumentativeZone");
    ll_cas.ll_setStringValue(addr, casFeatCode_zone, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ArgumentativeZone_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_zone = jcas.getRequiredFeatureDE(casType, "zone", "uima.cas.String", featOkTst);
    casFeatCode_zone  = (null == casFeat_zone) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_zone).getCode();

  }
}



    