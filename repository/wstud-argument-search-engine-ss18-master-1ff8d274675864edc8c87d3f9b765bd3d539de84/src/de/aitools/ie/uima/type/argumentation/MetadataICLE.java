

/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.aitools.ie.uima.type.supertype.Metadata;


/** The metadata provided for the ICLE corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * XML source: /media/jiani/D/UIMADebatePortalAnalysis/Indexing/desc/type-systems/ArgumentationTypeSystem.xml
 * @generated */
public class MetadataICLE extends Metadata {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetadataICLE.class);
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
  protected MetadataICLE() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetadataICLE(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetadataICLE(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetadataICLE(JCas jcas, int begin, int end) {
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
  //* Feature: file

  /** getter for file - gets The file name.
   * @generated
   * @return value of the feature 
   */
  public String getFile() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_file == null)
      jcasType.jcas.throwFeatMissing("file", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_file);}
    
  /** setter for file - sets The file name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFile(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_file == null)
      jcasType.jcas.throwFeatMissing("file", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_file, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets The title of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets The title of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: tagged

  /** getter for tagged - gets Whether tagged ("Yes") or not ("No").
   * @generated
   * @return value of the feature 
   */
  public String getTagged() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_tagged == null)
      jcasType.jcas.throwFeatMissing("tagged", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_tagged);}
    
  /** setter for tagged - sets Whether tagged ("Yes") or not ("No"). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTagged(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_tagged == null)
      jcasType.jcas.throwFeatMissing("tagged", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_tagged, v);}    
   
    
  //*--------------*
  //* Feature: textType

  /** getter for textType - gets The text type of the essay. (table column "type" in original corpus)
   * @generated
   * @return value of the feature 
   */
  public String getTextType() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_textType == null)
      jcasType.jcas.throwFeatMissing("textType", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_textType);}
    
  /** setter for textType - sets The text type of the essay. (table column "type" in original corpus) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTextType(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_textType == null)
      jcasType.jcas.throwFeatMissing("textType", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_textType, v);}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets The length of the essay, counted in words.
   * @generated
   * @return value of the feature 
   */
  public int getLength() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets The length of the essay, counted in words. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLength(int v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_length, v);}    
   
    
  //*--------------*
  //* Feature: conditions

  /** getter for conditions - gets Whether timed ("Timed") or not ("No Timing"). Maybe other values possible in principle
   * @generated
   * @return value of the feature 
   */
  public String getConditions() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_conditions);}
    
  /** setter for conditions - sets Whether timed ("Timed") or not ("No Timing"). Maybe other values possible in principle 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditions(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_conditions, v);}    
   
    
  //*--------------*
  //* Feature: reftools

  /** getter for reftools - gets ???
   * @generated
   * @return value of the feature 
   */
  public String getReftools() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_reftools == null)
      jcasType.jcas.throwFeatMissing("reftools", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_reftools);}
    
  /** setter for reftools - sets ??? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReftools(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_reftools == null)
      jcasType.jcas.throwFeatMissing("reftools", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_reftools, v);}    
   
    
  //*--------------*
  //* Feature: exams

  /** getter for exams - gets Whether exam ("Yes") or not ("No").
   * @generated
   * @return value of the feature 
   */
  public String getExams() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_exams == null)
      jcasType.jcas.throwFeatMissing("exams", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_exams);}
    
  /** setter for exams - sets Whether exam ("Yes") or not ("No"). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setExams(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_exams == null)
      jcasType.jcas.throwFeatMissing("exams", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_exams, v);}    
   
    
  //*--------------*
  //* Feature: age

  /** getter for age - gets The age of the writer of the essay in years.
   * @generated
   * @return value of the feature 
   */
  public int getAge() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_age);}
    
  /** setter for age - sets The age of the writer of the essay in years. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAge(int v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_age, v);}    
   
    
  //*--------------*
  //* Feature: sex

  /** getter for sex - gets The sex of the writer.
   * @generated
   * @return value of the feature 
   */
  public String getSex() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_sex == null)
      jcasType.jcas.throwFeatMissing("sex", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_sex);}
    
  /** setter for sex - sets The sex of the writer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSex(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_sex == null)
      jcasType.jcas.throwFeatMissing("sex", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_sex, v);}    
   
    
  //*--------------*
  //* Feature: country

  /** getter for country - gets The name of the country the writer of the essay comes from.
   * @generated
   * @return value of the feature 
   */
  public String getCountry() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_country);}
    
  /** setter for country - sets The name of the country the writer of the essay comes from. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_country, v);}    
   
    
  //*--------------*
  //* Feature: lLanguage

  /** getter for lLanguage - gets Maybe the learned language of the writer?
   * @generated
   * @return value of the feature 
   */
  public String getLLanguage() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_lLanguage == null)
      jcasType.jcas.throwFeatMissing("lLanguage", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_lLanguage);}
    
  /** setter for lLanguage - sets Maybe the learned language of the writer? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLLanguage(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_lLanguage == null)
      jcasType.jcas.throwFeatMissing("lLanguage", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_lLanguage, v);}    
   
    
  //*--------------*
  //* Feature: homeLang1

  /** getter for homeLang1 - gets The first home language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getHomeLang1() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang1 == null)
      jcasType.jcas.throwFeatMissing("homeLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang1);}
    
  /** setter for homeLang1 - sets The first home language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHomeLang1(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang1 == null)
      jcasType.jcas.throwFeatMissing("homeLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang1, v);}    
   
    
  //*--------------*
  //* Feature: homeLang2

  /** getter for homeLang2 - gets The second home language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getHomeLang2() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang2 == null)
      jcasType.jcas.throwFeatMissing("homeLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang2);}
    
  /** setter for homeLang2 - sets The second home language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHomeLang2(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang2 == null)
      jcasType.jcas.throwFeatMissing("homeLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang2, v);}    
   
    
  //*--------------*
  //* Feature: homeLang3

  /** getter for homeLang3 - gets The third home language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getHomeLang3() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang3 == null)
      jcasType.jcas.throwFeatMissing("homeLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang3);}
    
  /** setter for homeLang3 - sets The third home language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHomeLang3(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_homeLang3 == null)
      jcasType.jcas.throwFeatMissing("homeLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_homeLang3, v);}    
   
    
  //*--------------*
  //* Feature: oLang1

  /** getter for oLang1 - gets The first other language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getOLang1() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang1 == null)
      jcasType.jcas.throwFeatMissing("oLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang1);}
    
  /** setter for oLang1 - sets The first other language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOLang1(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang1 == null)
      jcasType.jcas.throwFeatMissing("oLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang1, v);}    
   
    
  //*--------------*
  //* Feature: oLang2

  /** getter for oLang2 - gets The second other language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getOLang2() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang2 == null)
      jcasType.jcas.throwFeatMissing("oLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang2);}
    
  /** setter for oLang2 - sets The second other language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOLang2(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang2 == null)
      jcasType.jcas.throwFeatMissing("oLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang2, v);}    
   
    
  //*--------------*
  //* Feature: oLang3

  /** getter for oLang3 - gets The third other language of the writer of the essay.
   * @generated
   * @return value of the feature 
   */
  public String getOLang3() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang3 == null)
      jcasType.jcas.throwFeatMissing("oLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang3);}
    
  /** setter for oLang3 - sets The third other language of the writer of the essay. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOLang3(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_oLang3 == null)
      jcasType.jcas.throwFeatMissing("oLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_oLang3, v);}    
   
    
  //*--------------*
  //* Feature: institutionCode

  /** getter for institutionCode - gets The code of the institution where the essay was written. (instit in original ICLE database)
   * @generated
   * @return value of the feature 
   */
  public String getInstitutionCode() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_institutionCode == null)
      jcasType.jcas.throwFeatMissing("institutionCode", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_institutionCode);}
    
  /** setter for institutionCode - sets The code of the institution where the essay was written. (instit in original ICLE database) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInstitutionCode(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_institutionCode == null)
      jcasType.jcas.throwFeatMissing("institutionCode", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_institutionCode, v);}    
   
    
  //*--------------*
  //* Feature: institution

  /** getter for institution - gets The name of the institution where the essay was written. (instit2 in original ICLE database)
   * @generated
   * @return value of the feature 
   */
  public String getInstitution() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_institution == null)
      jcasType.jcas.throwFeatMissing("institution", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_institution);}
    
  /** setter for institution - sets The name of the institution where the essay was written. (instit2 in original ICLE database) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInstitution(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_institution == null)
      jcasType.jcas.throwFeatMissing("institution", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_institution, v);}    
   
    
  //*--------------*
  //* Feature: schoolEng

  /** getter for schoolEng - gets Maybe, how many years English was learned at school.
   * @generated
   * @return value of the feature 
   */
  public String getSchoolEng() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_schoolEng == null)
      jcasType.jcas.throwFeatMissing("schoolEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_schoolEng);}
    
  /** setter for schoolEng - sets Maybe, how many years English was learned at school. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSchoolEng(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_schoolEng == null)
      jcasType.jcas.throwFeatMissing("schoolEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_schoolEng, v);}    
   
    
  //*--------------*
  //* Feature: uniEng

  /** getter for uniEng - gets Maybe, how many years English was learned at the university.
   * @generated
   * @return value of the feature 
   */
  public String getUniEng() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_uniEng == null)
      jcasType.jcas.throwFeatMissing("uniEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_uniEng);}
    
  /** setter for uniEng - sets Maybe, how many years English was learned at the university. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUniEng(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_uniEng == null)
      jcasType.jcas.throwFeatMissing("uniEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_uniEng, v);}    
   
    
  //*--------------*
  //* Feature: monthsEng

  /** getter for monthsEng - gets Maybe, how many months English was learned.
   * @generated
   * @return value of the feature 
   */
  public String getMonthsEng() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_monthsEng == null)
      jcasType.jcas.throwFeatMissing("monthsEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_monthsEng);}
    
  /** setter for monthsEng - sets Maybe, how many months English was learned. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMonthsEng(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_monthsEng == null)
      jcasType.jcas.throwFeatMissing("monthsEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_monthsEng, v);}    
   
    
  //*--------------*
  //* Feature: date

  /** getter for date - gets The date the essay was written, given in the form "mm/dd/yyyy hh:mm:ss".
   * @generated
   * @return value of the feature 
   */
  public String getDate() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets The date the essay was written, given in the form "mm/dd/yyyy hh:mm:ss". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_date, v);}    
   
    
  //*--------------*
  //* Feature: status

  /** getter for status - gets Whether complete or incomplete. Maybe, other values are possible in principle.
   * @generated
   * @return value of the feature 
   */
  public String getStatus() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_status);}
    
  /** setter for status - sets Whether complete or incomplete. Maybe, other values are possible in principle. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_status, v);}    
   
    
  //*--------------*
  //* Feature: comments

  /** getter for comments - gets Any comment.
   * @generated
   * @return value of the feature 
   */
  public String getComments() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_comments == null)
      jcasType.jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_comments);}
    
  /** setter for comments - sets Any comment. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComments(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_comments == null)
      jcasType.jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_comments, v);}    
   
    
  //*--------------*
  //* Feature: active

  /** getter for active - gets Whether active (1) or not (0).
   * @generated
   * @return value of the feature 
   */
  public int getActive() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_active == null)
      jcasType.jcas.throwFeatMissing("active", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_active);}
    
  /** setter for active - sets Whether active (1) or not (0). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setActive(int v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_active == null)
      jcasType.jcas.throwFeatMissing("active", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_active, v);}    
   
    
  //*--------------*
  //* Feature: interface

  /** getter for interface - gets ??? (always 1 in original corpus)
   * @generated
   * @return value of the feature 
   */
  public int getInterface() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_interface == null)
      jcasType.jcas.throwFeatMissing("interface", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_interface);}
    
  /** setter for interface - sets ??? (always 1 in original corpus) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInterface(int v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_interface == null)
      jcasType.jcas.throwFeatMissing("interface", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_interface, v);}    
   
    
  //*--------------*
  //* Feature: title2

  /** getter for title2 - gets Seems to be the same as the title.
   * @generated
   * @return value of the feature 
   */
  public String getTitle2() {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_title2 == null)
      jcasType.jcas.throwFeatMissing("title2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_title2);}
    
  /** setter for title2 - sets Seems to be the same as the title. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle2(String v) {
    if (MetadataICLE_Type.featOkTst && ((MetadataICLE_Type)jcasType).casFeat_title2 == null)
      jcasType.jcas.throwFeatMissing("title2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetadataICLE_Type)jcasType).casFeatCode_title2, v);}    
  }

    