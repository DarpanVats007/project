

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Unit;


/** The argumentative zone annotation type
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class ArgumentativeZone extends Unit {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgumentativeZone.class);
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
  protected ArgumentativeZone() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ArgumentativeZone(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgumentativeZone(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ArgumentativeZone(JCas jcas, int begin, int end) {
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
  //* Feature: zone

  /** getter for zone - gets The zone type
   * @generated
   * @return value of the feature 
   */
  public String getZone() {
    if (ArgumentativeZone_Type.featOkTst && ((ArgumentativeZone_Type)jcasType).casFeat_zone == null)
      jcasType.jcas.throwFeatMissing("zone", "de.aitools.ie.uima.type.argumentation.ArgumentativeZone");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentativeZone_Type)jcasType).casFeatCode_zone);}
    
  /** setter for zone - sets The zone type 
   * @generated
   * @param v value to set into the feature 
   */
  public void setZone(String v) {
    if (ArgumentativeZone_Type.featOkTst && ((ArgumentativeZone_Type)jcasType).casFeat_zone == null)
      jcasType.jcas.throwFeatMissing("zone", "de.aitools.ie.uima.type.argumentation.ArgumentativeZone");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentativeZone_Type)jcasType).casFeatCode_zone, v);}    
  }

    