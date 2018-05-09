

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Unit;


/** A basic unit of an argumentative text. May also cover non-argumenative parts within such a text. The unit may be assigned a certain type.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class ArgumentativeDiscourseUnit extends Unit {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgumentativeDiscourseUnit.class);
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
  protected ArgumentativeDiscourseUnit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ArgumentativeDiscourseUnit(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgumentativeDiscourseUnit(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ArgumentativeDiscourseUnit(JCas jcas, int begin, int end) {
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
  //* Feature: unitType

  /** getter for unitType - gets The type of the unit.
   * @generated
   * @return value of the feature 
   */
  public String getUnitType() {
    if (ArgumentativeDiscourseUnit_Type.featOkTst && ((ArgumentativeDiscourseUnit_Type)jcasType).casFeat_unitType == null)
      jcasType.jcas.throwFeatMissing("unitType", "de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentativeDiscourseUnit_Type)jcasType).casFeatCode_unitType);}
    
  /** setter for unitType - sets The type of the unit. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnitType(String v) {
    if (ArgumentativeDiscourseUnit_Type.featOkTst && ((ArgumentativeDiscourseUnit_Type)jcasType).casFeat_unitType == null)
      jcasType.jcas.throwFeatMissing("unitType", "de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentativeDiscourseUnit_Type)jcasType).casFeatCode_unitType, v);}    
  }

    