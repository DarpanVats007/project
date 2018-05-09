

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;
import org.apache.uima.jcas.cas.DoubleArray;


/** The global acceptability quality assessment of an argument or argumentation.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class GlobalAcceptability extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GlobalAcceptability.class);
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
  protected GlobalAcceptability() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GlobalAcceptability(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GlobalAcceptability(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GlobalAcceptability(JCas jcas, int begin, int end) {
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
  //* Feature: majority

  /** getter for majority - gets The majority score over all annotators.
   * @generated
   * @return value of the feature 
   */
  public double getMajority() {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_majority == null)
      jcasType.jcas.throwFeatMissing("majority", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_majority);}
    
  /** setter for majority - sets The majority score over all annotators. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMajority(double v) {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_majority == null)
      jcasType.jcas.throwFeatMissing("majority", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_majority, v);}    
   
    
  //*--------------*
  //* Feature: mean

  /** getter for mean - gets The mean score over all annotators.
   * @generated
   * @return value of the feature 
   */
  public double getMean() {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_mean == null)
      jcasType.jcas.throwFeatMissing("mean", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_mean);}
    
  /** setter for mean - sets The mean score over all annotators. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMean(double v) {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_mean == null)
      jcasType.jcas.throwFeatMissing("mean", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_mean, v);}    
   
    
  //*--------------*
  //* Feature: allScores

  /** getter for allScores - gets The list of scores of all annators
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getAllScores() {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores)));}
    
  /** setter for allScores - sets The list of scores of all annators 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAllScores(DoubleArray v) {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    jcasType.ll_cas.ll_setRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for allScores - gets an indexed value - The list of scores of all annators
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getAllScores(int i) {
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores), i);}

  /** indexed setter for allScores - sets an indexed value - The list of scores of all annators
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAllScores(int i, double v) { 
    if (GlobalAcceptability_Type.featOkTst && ((GlobalAcceptability_Type)jcasType).casFeat_allScores == null)
      jcasType.jcas.throwFeatMissing("allScores", "de.aitools.ie.uima.type.argumentation.GlobalAcceptability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GlobalAcceptability_Type)jcasType).casFeatCode_allScores), i, v);}
  }

    