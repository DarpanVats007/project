
/* First created by JCasGen Wed Sep 27 17:32:37 CEST 2017 */
package de.aitools.ie.uima.type.argumentation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.aitools.ie.uima.type.supertype.Metadata_Type;

/** The metadata provided for the ICLE corpus files.
 * Updated by JCasGen Fri Dec 01 18:34:12 CET 2017
 * @generated */
public class MetadataICLE_Type extends Metadata_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetadataICLE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.aitools.ie.uima.type.argumentation.MetadataICLE");
 
  /** @generated */
  final Feature casFeat_file;
  /** @generated */
  final int     casFeatCode_file;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFile(int addr) {
        if (featOkTst && casFeat_file == null)
      jcas.throwFeatMissing("file", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_file);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFile(int addr, String v) {
        if (featOkTst && casFeat_file == null)
      jcas.throwFeatMissing("file", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_file, v);}
    
  
 
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tagged;
  /** @generated */
  final int     casFeatCode_tagged;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTagged(int addr) {
        if (featOkTst && casFeat_tagged == null)
      jcas.throwFeatMissing("tagged", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tagged);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTagged(int addr, String v) {
        if (featOkTst && casFeat_tagged == null)
      jcas.throwFeatMissing("tagged", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_tagged, v);}
    
  
 
  /** @generated */
  final Feature casFeat_textType;
  /** @generated */
  final int     casFeatCode_textType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTextType(int addr) {
        if (featOkTst && casFeat_textType == null)
      jcas.throwFeatMissing("textType", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_textType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTextType(int addr, String v) {
        if (featOkTst && casFeat_textType == null)
      jcas.throwFeatMissing("textType", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_textType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_length;
  /** @generated */
  final int     casFeatCode_length;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getIntValue(addr, casFeatCode_length);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setIntValue(addr, casFeatCode_length, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conditions;
  /** @generated */
  final int     casFeatCode_conditions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConditions(int addr) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_conditions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConditions(int addr, String v) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_conditions, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reftools;
  /** @generated */
  final int     casFeatCode_reftools;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReftools(int addr) {
        if (featOkTst && casFeat_reftools == null)
      jcas.throwFeatMissing("reftools", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reftools);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReftools(int addr, String v) {
        if (featOkTst && casFeat_reftools == null)
      jcas.throwFeatMissing("reftools", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_reftools, v);}
    
  
 
  /** @generated */
  final Feature casFeat_exams;
  /** @generated */
  final int     casFeatCode_exams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExams(int addr) {
        if (featOkTst && casFeat_exams == null)
      jcas.throwFeatMissing("exams", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_exams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExams(int addr, String v) {
        if (featOkTst && casFeat_exams == null)
      jcas.throwFeatMissing("exams", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_exams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_age;
  /** @generated */
  final int     casFeatCode_age;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAge(int addr) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getIntValue(addr, casFeatCode_age);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAge(int addr, int v) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setIntValue(addr, casFeatCode_age, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sex;
  /** @generated */
  final int     casFeatCode_sex;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSex(int addr) {
        if (featOkTst && casFeat_sex == null)
      jcas.throwFeatMissing("sex", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sex);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSex(int addr, String v) {
        if (featOkTst && casFeat_sex == null)
      jcas.throwFeatMissing("sex", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_sex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_country;
  /** @generated */
  final int     casFeatCode_country;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCountry(int addr) {
        if (featOkTst && casFeat_country == null)
      jcas.throwFeatMissing("country", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_country);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountry(int addr, String v) {
        if (featOkTst && casFeat_country == null)
      jcas.throwFeatMissing("country", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_country, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lLanguage;
  /** @generated */
  final int     casFeatCode_lLanguage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLLanguage(int addr) {
        if (featOkTst && casFeat_lLanguage == null)
      jcas.throwFeatMissing("lLanguage", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lLanguage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLLanguage(int addr, String v) {
        if (featOkTst && casFeat_lLanguage == null)
      jcas.throwFeatMissing("lLanguage", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_lLanguage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_homeLang1;
  /** @generated */
  final int     casFeatCode_homeLang1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHomeLang1(int addr) {
        if (featOkTst && casFeat_homeLang1 == null)
      jcas.throwFeatMissing("homeLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_homeLang1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHomeLang1(int addr, String v) {
        if (featOkTst && casFeat_homeLang1 == null)
      jcas.throwFeatMissing("homeLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_homeLang1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_homeLang2;
  /** @generated */
  final int     casFeatCode_homeLang2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHomeLang2(int addr) {
        if (featOkTst && casFeat_homeLang2 == null)
      jcas.throwFeatMissing("homeLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_homeLang2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHomeLang2(int addr, String v) {
        if (featOkTst && casFeat_homeLang2 == null)
      jcas.throwFeatMissing("homeLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_homeLang2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_homeLang3;
  /** @generated */
  final int     casFeatCode_homeLang3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHomeLang3(int addr) {
        if (featOkTst && casFeat_homeLang3 == null)
      jcas.throwFeatMissing("homeLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_homeLang3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHomeLang3(int addr, String v) {
        if (featOkTst && casFeat_homeLang3 == null)
      jcas.throwFeatMissing("homeLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_homeLang3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oLang1;
  /** @generated */
  final int     casFeatCode_oLang1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOLang1(int addr) {
        if (featOkTst && casFeat_oLang1 == null)
      jcas.throwFeatMissing("oLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oLang1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOLang1(int addr, String v) {
        if (featOkTst && casFeat_oLang1 == null)
      jcas.throwFeatMissing("oLang1", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_oLang1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oLang2;
  /** @generated */
  final int     casFeatCode_oLang2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOLang2(int addr) {
        if (featOkTst && casFeat_oLang2 == null)
      jcas.throwFeatMissing("oLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oLang2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOLang2(int addr, String v) {
        if (featOkTst && casFeat_oLang2 == null)
      jcas.throwFeatMissing("oLang2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_oLang2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oLang3;
  /** @generated */
  final int     casFeatCode_oLang3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOLang3(int addr) {
        if (featOkTst && casFeat_oLang3 == null)
      jcas.throwFeatMissing("oLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oLang3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOLang3(int addr, String v) {
        if (featOkTst && casFeat_oLang3 == null)
      jcas.throwFeatMissing("oLang3", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_oLang3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_institutionCode;
  /** @generated */
  final int     casFeatCode_institutionCode;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInstitutionCode(int addr) {
        if (featOkTst && casFeat_institutionCode == null)
      jcas.throwFeatMissing("institutionCode", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_institutionCode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInstitutionCode(int addr, String v) {
        if (featOkTst && casFeat_institutionCode == null)
      jcas.throwFeatMissing("institutionCode", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_institutionCode, v);}
    
  
 
  /** @generated */
  final Feature casFeat_institution;
  /** @generated */
  final int     casFeatCode_institution;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInstitution(int addr) {
        if (featOkTst && casFeat_institution == null)
      jcas.throwFeatMissing("institution", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_institution);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInstitution(int addr, String v) {
        if (featOkTst && casFeat_institution == null)
      jcas.throwFeatMissing("institution", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_institution, v);}
    
  
 
  /** @generated */
  final Feature casFeat_schoolEng;
  /** @generated */
  final int     casFeatCode_schoolEng;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSchoolEng(int addr) {
        if (featOkTst && casFeat_schoolEng == null)
      jcas.throwFeatMissing("schoolEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_schoolEng);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSchoolEng(int addr, String v) {
        if (featOkTst && casFeat_schoolEng == null)
      jcas.throwFeatMissing("schoolEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_schoolEng, v);}
    
  
 
  /** @generated */
  final Feature casFeat_uniEng;
  /** @generated */
  final int     casFeatCode_uniEng;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUniEng(int addr) {
        if (featOkTst && casFeat_uniEng == null)
      jcas.throwFeatMissing("uniEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uniEng);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUniEng(int addr, String v) {
        if (featOkTst && casFeat_uniEng == null)
      jcas.throwFeatMissing("uniEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_uniEng, v);}
    
  
 
  /** @generated */
  final Feature casFeat_monthsEng;
  /** @generated */
  final int     casFeatCode_monthsEng;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMonthsEng(int addr) {
        if (featOkTst && casFeat_monthsEng == null)
      jcas.throwFeatMissing("monthsEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_monthsEng);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMonthsEng(int addr, String v) {
        if (featOkTst && casFeat_monthsEng == null)
      jcas.throwFeatMissing("monthsEng", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_monthsEng, v);}
    
  
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, String v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_comments;
  /** @generated */
  final int     casFeatCode_comments;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComments(int addr) {
        if (featOkTst && casFeat_comments == null)
      jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comments);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComments(int addr, String v) {
        if (featOkTst && casFeat_comments == null)
      jcas.throwFeatMissing("comments", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_comments, v);}
    
  
 
  /** @generated */
  final Feature casFeat_active;
  /** @generated */
  final int     casFeatCode_active;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getActive(int addr) {
        if (featOkTst && casFeat_active == null)
      jcas.throwFeatMissing("active", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getIntValue(addr, casFeatCode_active);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setActive(int addr, int v) {
        if (featOkTst && casFeat_active == null)
      jcas.throwFeatMissing("active", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setIntValue(addr, casFeatCode_active, v);}
    
  
 
  /** @generated */
  final Feature casFeat_interface;
  /** @generated */
  final int     casFeatCode_interface;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInterface(int addr) {
        if (featOkTst && casFeat_interface == null)
      jcas.throwFeatMissing("interface", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getIntValue(addr, casFeatCode_interface);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInterface(int addr, int v) {
        if (featOkTst && casFeat_interface == null)
      jcas.throwFeatMissing("interface", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setIntValue(addr, casFeatCode_interface, v);}
    
  
 
  /** @generated */
  final Feature casFeat_title2;
  /** @generated */
  final int     casFeatCode_title2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle2(int addr) {
        if (featOkTst && casFeat_title2 == null)
      jcas.throwFeatMissing("title2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle2(int addr, String v) {
        if (featOkTst && casFeat_title2 == null)
      jcas.throwFeatMissing("title2", "de.aitools.ie.uima.type.argumentation.MetadataICLE");
    ll_cas.ll_setStringValue(addr, casFeatCode_title2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetadataICLE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_file = jcas.getRequiredFeatureDE(casType, "file", "uima.cas.String", featOkTst);
    casFeatCode_file  = (null == casFeat_file) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_file).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_tagged = jcas.getRequiredFeatureDE(casType, "tagged", "uima.cas.String", featOkTst);
    casFeatCode_tagged  = (null == casFeat_tagged) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tagged).getCode();

 
    casFeat_textType = jcas.getRequiredFeatureDE(casType, "textType", "uima.cas.String", featOkTst);
    casFeatCode_textType  = (null == casFeat_textType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_textType).getCode();

 
    casFeat_length = jcas.getRequiredFeatureDE(casType, "length", "uima.cas.Integer", featOkTst);
    casFeatCode_length  = (null == casFeat_length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_length).getCode();

 
    casFeat_conditions = jcas.getRequiredFeatureDE(casType, "conditions", "uima.cas.String", featOkTst);
    casFeatCode_conditions  = (null == casFeat_conditions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conditions).getCode();

 
    casFeat_reftools = jcas.getRequiredFeatureDE(casType, "reftools", "uima.cas.String", featOkTst);
    casFeatCode_reftools  = (null == casFeat_reftools) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reftools).getCode();

 
    casFeat_exams = jcas.getRequiredFeatureDE(casType, "exams", "uima.cas.String", featOkTst);
    casFeatCode_exams  = (null == casFeat_exams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_exams).getCode();

 
    casFeat_age = jcas.getRequiredFeatureDE(casType, "age", "uima.cas.Integer", featOkTst);
    casFeatCode_age  = (null == casFeat_age) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_age).getCode();

 
    casFeat_sex = jcas.getRequiredFeatureDE(casType, "sex", "uima.cas.String", featOkTst);
    casFeatCode_sex  = (null == casFeat_sex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sex).getCode();

 
    casFeat_country = jcas.getRequiredFeatureDE(casType, "country", "uima.cas.String", featOkTst);
    casFeatCode_country  = (null == casFeat_country) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_country).getCode();

 
    casFeat_lLanguage = jcas.getRequiredFeatureDE(casType, "lLanguage", "uima.cas.String", featOkTst);
    casFeatCode_lLanguage  = (null == casFeat_lLanguage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lLanguage).getCode();

 
    casFeat_homeLang1 = jcas.getRequiredFeatureDE(casType, "homeLang1", "uima.cas.String", featOkTst);
    casFeatCode_homeLang1  = (null == casFeat_homeLang1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_homeLang1).getCode();

 
    casFeat_homeLang2 = jcas.getRequiredFeatureDE(casType, "homeLang2", "uima.cas.String", featOkTst);
    casFeatCode_homeLang2  = (null == casFeat_homeLang2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_homeLang2).getCode();

 
    casFeat_homeLang3 = jcas.getRequiredFeatureDE(casType, "homeLang3", "uima.cas.String", featOkTst);
    casFeatCode_homeLang3  = (null == casFeat_homeLang3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_homeLang3).getCode();

 
    casFeat_oLang1 = jcas.getRequiredFeatureDE(casType, "oLang1", "uima.cas.String", featOkTst);
    casFeatCode_oLang1  = (null == casFeat_oLang1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oLang1).getCode();

 
    casFeat_oLang2 = jcas.getRequiredFeatureDE(casType, "oLang2", "uima.cas.String", featOkTst);
    casFeatCode_oLang2  = (null == casFeat_oLang2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oLang2).getCode();

 
    casFeat_oLang3 = jcas.getRequiredFeatureDE(casType, "oLang3", "uima.cas.String", featOkTst);
    casFeatCode_oLang3  = (null == casFeat_oLang3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oLang3).getCode();

 
    casFeat_institutionCode = jcas.getRequiredFeatureDE(casType, "institutionCode", "uima.cas.String", featOkTst);
    casFeatCode_institutionCode  = (null == casFeat_institutionCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_institutionCode).getCode();

 
    casFeat_institution = jcas.getRequiredFeatureDE(casType, "institution", "uima.cas.String", featOkTst);
    casFeatCode_institution  = (null == casFeat_institution) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_institution).getCode();

 
    casFeat_schoolEng = jcas.getRequiredFeatureDE(casType, "schoolEng", "uima.cas.String", featOkTst);
    casFeatCode_schoolEng  = (null == casFeat_schoolEng) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_schoolEng).getCode();

 
    casFeat_uniEng = jcas.getRequiredFeatureDE(casType, "uniEng", "uima.cas.String", featOkTst);
    casFeatCode_uniEng  = (null == casFeat_uniEng) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uniEng).getCode();

 
    casFeat_monthsEng = jcas.getRequiredFeatureDE(casType, "monthsEng", "uima.cas.String", featOkTst);
    casFeatCode_monthsEng  = (null == casFeat_monthsEng) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_monthsEng).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.String", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_comments = jcas.getRequiredFeatureDE(casType, "comments", "uima.cas.String", featOkTst);
    casFeatCode_comments  = (null == casFeat_comments) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comments).getCode();

 
    casFeat_active = jcas.getRequiredFeatureDE(casType, "active", "uima.cas.Integer", featOkTst);
    casFeatCode_active  = (null == casFeat_active) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_active).getCode();

 
    casFeat_interface = jcas.getRequiredFeatureDE(casType, "interface", "uima.cas.Integer", featOkTst);
    casFeatCode_interface  = (null == casFeat_interface) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_interface).getCode();

 
    casFeat_title2 = jcas.getRequiredFeatureDE(casType, "title2", "uima.cas.String", featOkTst);
    casFeatCode_title2  = (null == casFeat_title2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title2).getCode();

  }
}



    