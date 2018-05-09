

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Classification;


/** The discourse function of a single paragraph.
 * Updated by JCasGen Fri Dec 01 18:34:13 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class ParagraphDiscourseFunction extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ParagraphDiscourseFunction.class);
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
  protected ParagraphDiscourseFunction() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ParagraphDiscourseFunction(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ParagraphDiscourseFunction(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ParagraphDiscourseFunction(JCas jcas, int begin, int end) {
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
  //* Feature: label

  /** getter for label - gets The label that represents the discourse function.
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (ParagraphDiscourseFunction_Type.featOkTst && ((ParagraphDiscourseFunction_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "de.aitools.ie.uima.type.argumentation.ParagraphDiscourseFunction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ParagraphDiscourseFunction_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets The label that represents the discourse function. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (ParagraphDiscourseFunction_Type.featOkTst && ((ParagraphDiscourseFunction_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "de.aitools.ie.uima.type.argumentation.ParagraphDiscourseFunction");
    jcasType.ll_cas.ll_setStringValue(addr, ((ParagraphDiscourseFunction_Type)jcasType).casFeatCode_label, v);}    
  }

    