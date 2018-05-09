

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Relation;
import org.apache.uima.jcas.cas.FSArray;


import org.apache.uima.jcas.cas.StringArray;


/** An argument, seen here as a relation between an argumentative unit serving as a premise and an argumentative unit serving as a conclusion. The argument may be assigned a certain type. If the represented argument has more than premise in fact, it can be modeled through multiple annotations of this type.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class Argument extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Argument.class);
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
  protected Argument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Argument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Argument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Argument(JCas jcas, int begin, int end) {
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
  //* Feature: premises

  /** getter for premises - gets The premises of the argument
   * @generated
   * @return value of the feature 
   */
  public FSArray getPremises() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_premises == null)
      jcasType.jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises)));}
    
  /** setter for premises - sets The premises of the argument 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPremises(FSArray v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_premises == null)
      jcasType.jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.ll_cas.ll_setRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for premises - gets an indexed value - The premises of the argument
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ArgumentativeDiscourseUnit getPremises(int i) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_premises == null)
      jcasType.jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises), i);
    return (ArgumentativeDiscourseUnit)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises), i)));}

  /** indexed setter for premises - sets an indexed value - The premises of the argument
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPremises(int i, ArgumentativeDiscourseUnit v) { 
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_premises == null)
      jcasType.jcas.throwFeatMissing("premises", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_premises), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: conclusion

  /** getter for conclusion - gets The conclusion of the argument.
   * @generated
   * @return value of the feature 
   */
  public ArgumentativeDiscourseUnit getConclusion() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_conclusion == null)
      jcasType.jcas.throwFeatMissing("conclusion", "de.aitools.ie.uima.type.argumentation.Argument");
    return (ArgumentativeDiscourseUnit)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_conclusion)));}
    
  /** setter for conclusion - sets The conclusion of the argument. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConclusion(ArgumentativeDiscourseUnit v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_conclusion == null)
      jcasType.jcas.throwFeatMissing("conclusion", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.ll_cas.ll_setRefValue(addr, ((Argument_Type)jcasType).casFeatCode_conclusion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: argumentType

  /** getter for argumentType - gets The type of the argument.
   * @generated
   * @return value of the feature 
   */
  public String getArgumentType() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_argumentType == null)
      jcasType.jcas.throwFeatMissing("argumentType", "de.aitools.ie.uima.type.argumentation.Argument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Argument_Type)jcasType).casFeatCode_argumentType);}
    
  /** setter for argumentType - sets The type of the argument. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgumentType(String v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_argumentType == null)
      jcasType.jcas.throwFeatMissing("argumentType", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.ll_cas.ll_setStringValue(addr, ((Argument_Type)jcasType).casFeatCode_argumentType, v);}    
   
    
  //*--------------*
  //* Feature: stances

  /** getter for stances - gets The stances of the premises of the argument.
   * @generated
   * @return value of the feature 
   */
  public StringArray getStances() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_stances == null)
      jcasType.jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances)));}
    
  /** setter for stances - sets The stances of the premises of the argument. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStances(StringArray v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_stances == null)
      jcasType.jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.ll_cas.ll_setRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for stances - gets an indexed value - The stances of the premises of the argument.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getStances(int i) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_stances == null)
      jcasType.jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances), i);}

  /** indexed setter for stances - sets an indexed value - The stances of the premises of the argument.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setStances(int i, String v) { 
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_stances == null)
      jcasType.jcas.throwFeatMissing("stances", "de.aitools.ie.uima.type.argumentation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_stances), i, v);}
  }

    