package de.webis.args.framework.essentials;

/*
 *  /!\ A copy of Lucene Explanation class,
 *  New constructor added to transfer a lucene Explanation into this
 *  Explanation.
 *  Visibility of members changed.
 */


/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Expert: Describes the score computation for document and query. */
public class Explanation {
	
	
	/**
	 * Global Map for explanation Storage
	 */
	Map<String, String> expl = new HashMap();


  /**
   * Create a new explanation for a match.
   * @param value       the contribution to the score of the document
   * @param description how {@code value} was computed
   * @param details     sub explanations that contributed to this explanation
   */
  public static Explanation match(float value, String description, Collection<Explanation> details) {
    return new Explanation(true, value, description, details);
  }

  /**
   * Create a new explanation for a match.
   * @param value       the contribution to the score of the document
   * @param description how {@code value} was computed
   * @param details     sub explanations that contributed to this explanation
   */
  public static Explanation match(float value, String description, Explanation... details) {
    return new Explanation(true, value, description, Arrays.asList(details));
  }

  /**
   * Create a new explanation for a document which does not match.
   */
  public static Explanation noMatch(String description, Collection<Explanation> details) {
    return new Explanation(false, 0f, description, details);
  }

  /**
   * Create a new explanation for a document which does not match.
   */
  public static Explanation noMatch(String description, Explanation... details) {
    return new Explanation(false, 0f, description, Arrays.asList(details));
  }

  private final boolean match;                          // whether the document matched
  private final float value;                            // the value of this node
  private final String description;                     // what it represents
  private final List<Explanation> details;              // sub-explanations

  /** Create a new explanation  */
  private Explanation(boolean match, float value, String description, Collection<Explanation> details) {
    this.match = match;
    this.value = value;
    this.description = Objects.requireNonNull(description);
    this.details = Collections.unmodifiableList(new ArrayList<>(details));
    for (Explanation detail : details) {
      Objects.requireNonNull(detail);
    }
  }

  /** New implemented constructor from args  */
  public Explanation(boolean match, float value, String descrip, 
		  org.apache.lucene.search.Explanation[] det) {
    this.match = match;
    this.value = value;
    this.description = Objects.requireNonNull(descrip);
    this.details = new ArrayList<Explanation>();
    for (int i = 0 ; i < det.length; i++) {
      Explanation subExplanation = new Explanation(
    		  det[i].isMatch(), 
    		  det[i].getValue(), 
    		  det[i].getDescription(), 
    		  det[i].getDetails());
      this.details.add(subExplanation);
    }
  }
  
  /** New implemented constructor from args  */
  public Explanation(org.apache.lucene.search.Explanation explanation) {
    this.match = explanation.isMatch();
    this.value = explanation.getValue();
    this.description = Objects.requireNonNull(explanation.getDescription());
    this.details = new ArrayList<Explanation>();
    org.apache.lucene.search.Explanation[] lucDetails = explanation.getDetails();
    for (int i = 0 ; i < explanation.getDetails().length; i++) {
      Explanation argsExp = new Explanation(explanation.getDetails()[i]);
      this.details.add(argsExp);
    }
  }

/**
   * Indicates whether or not this Explanation models a match.
   */
  public boolean isMatch() {
    return match;
  }
  
  /** The value assigned to this explanation node. */
  public float getValue() { return value; }

  /** A description of this explanation node. */
  public String getDescription() { return description; }

  private String getSummary() {
    return getDescription() + " = " + getValue();
  }
  
  /** Add HTML tag <b> */
  private String makeBold(String target) {
	  return "<b>" + target + "</b>";
  }

  
  /** The sub-nodes of this explanation node. */
  public Explanation[] getDetails() {
    return details.toArray(new Explanation[0]);
  }

  /** Render an explanation as text. */
  @Override
  public String toString() {
    return toString(0);
  }

  private String toString(int depth) {
    StringBuilder buffer = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      buffer.append("  ");
    }
    buffer.append(getSummary());
    buffer.append("\n");

    Explanation[] details = getDetails();
    for (int i = 0 ; i < details.length; i++) {
      buffer.append(details[i].toString(depth+1));
    }

    return buffer.toString();
  }

  /** Render an explanation as HTML. */
  @Deprecated
  public String toHtml() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("<ul>\n");

    buffer.append("<li>");
    buffer.append(getSummary());
    buffer.append("<br />\n");

    Explanation[] details = getDetails();
    for (int i = 0 ; i < details.length; i++) {
      buffer.append(details[i].toHtml());
    }

    buffer.append("</li>\n");
    buffer.append("</ul>\n");

    return buffer.toString();
  }
  
  public ArrayList<String> sortKeys() {
	  
	  ArrayList<String> sortedKeys = new ArrayList<String>();
	  String searchKey = "1";
	  boolean searchMap = true;
	  
	  while(searchMap) {
		  if(expl.containsKey(searchKey) && !sortedKeys.contains(searchKey)) {
			  sortedKeys.add(searchKey);
			  searchKey += "1";
		  } else if(searchKey.length() > 1) {
			  char lastCharOfKey = searchKey.charAt(searchKey.length() - 2);
			  searchKey = searchKey.substring(0, searchKey.length() - 2);
			  lastCharOfKey += 1;
			  searchKey += lastCharOfKey;
		  } else {
			  break;
		  }		  
	  }
	  return sortedKeys;	  
  }
  
  public ArrayList<String> reworkValues(ArrayList<String> sortedKeys) {
	  
	  ArrayList<String> relevantKeys = new ArrayList<String>();
	  String value;
	  double valueDouble;
	  String name;
	  for(int i = sortedKeys.size() - 1; i >= 0; --i) {
		  String content = expl.get(sortedKeys.get(i));
		  
		  if(content.contains(",") && !content.contains("score") && !content.contains("weight")) {
			  value = content.substring(content.indexOf(" = ") + 3, content.length());
			  valueDouble = Double.parseDouble(value);
			  valueDouble = roundValue(valueDouble, 2);			  
			  name = content.substring(0, content.indexOf(","));
			  content = name + " " + valueDouble;
			  expl.replace(sortedKeys.get(i), content);
			  relevantKeys.add(sortedKeys.get(i));
		  } else if(content.contains("boost")) {
			  value = content.substring(content.indexOf(" = ") + 3, content.length());
			  valueDouble = Double.parseDouble(value);
			  valueDouble = roundValue(valueDouble, 2);			  
			  name = content.substring(0, content.indexOf(" = "));
			  content = name + " " + valueDouble;
			  expl.replace(sortedKeys.get(i), content);
			  relevantKeys.add(sortedKeys.get(i));
		  } else if(content.contains("weight(")) {
			  value = content.substring(content.indexOf(" = ") + 3, content.length());
			  valueDouble = Double.parseDouble(value);
			  valueDouble = roundValue(valueDouble, 2);			  
			  name = content.substring(content.indexOf("(")+1, content.indexOf(":"));
			  String query = content.substring(content.indexOf(":") +1, content.indexOf(" "));
			  String similarity = content.substring(content.indexOf("[")+1, content.indexOf("]"));
			  content = similarity + " " + query + " " + name + " " + valueDouble;
			  expl.replace(sortedKeys.get(i), content);
			  relevantKeys.add(sortedKeys.get(i));
		  } else if(content.contains("sum of:")) {
			  value = content.substring(content.indexOf(" = ") + 3, content.length());
			  valueDouble = Double.parseDouble(value);
			  valueDouble = roundValue(valueDouble, 2);
			  content = " " + valueDouble;
			  expl.replace(sortedKeys.get(i), content);
			  relevantKeys.add(sortedKeys.get(i));
		  }
	  }
	  return relevantKeys;
  }
  
  public void reworkStructure(ArrayList<String> reworkedKeys) {
	  
	  ArrayList<String> keysToRemove = new ArrayList<String>();
	  
	  int maxKeyLength = reworkedKeys.get(1).length();
	  String temp = "";
	  String current = "";
	  String currentKey = "";
	  String lookupKey = "";
	  String tempKey = "";
	  boolean firstTime = true;
	  
	  for(int i = reworkedKeys.size() - 1; i >= 0; --i) {
		  currentKey = reworkedKeys.get(i);
		  lookupKey = currentKey + "1";
		  	  
		  if(!reworkedKeys.contains(lookupKey) && lookupKey.length() <= maxKeyLength) {
			  current = expl.get(currentKey);
			  temp = current.substring(0, current.indexOf(" ")).trim();
			  current = current.substring(temp.trim().length()).trim();
			  if(firstTime) {
				  String first = expl.get("1").trim();
				  first = "" + temp + " " + first;
				  firstTime = false;
				  expl.replace("1", first.trim());
			  }
			  temp = current.substring(0, current.indexOf(" ")).trim();
			  expl.replace(currentKey, current.substring(temp.length()).trim());
			  tempKey = lookupKey.substring(0, lookupKey.length() - 2);
			  current = expl.get(tempKey).trim();
			  
			  if(!current.contains(temp)) {
				  if(current.contains(" ")) {
					  current = current.replace(" ", (" " + temp + " "));
				  } else {
					  current = temp + " " + current; 
				  }
			  } else {
				  current = temp + current.substring(current.indexOf(" "));
			  }
			  if(!tempKey.equals("1")) {
				  expl.replace(tempKey, current.trim()); 
			  }
				  
			  
			  int j = 1;
			  tempKey = lookupKey + j;
			  temp = "";
			  current = expl.get(currentKey);
			  while(reworkedKeys.contains(tempKey)) {
				  if(temp.equals("")) {
					  temp = expl.get(tempKey);
				  } else {
					  temp = temp + ", " + expl.get(tempKey);
				  }
				  keysToRemove.add(tempKey);
				  j++;
				  tempKey = tempKey.substring(0, tempKey.length() - 1);	  
				  tempKey += j;
			  }			  
			  current = current + " (" + temp + ")";
			  expl.replace(currentKey, current.trim());  
		  }
	  }
	  
	  for(int l = 0; l < reworkedKeys.size(); l++) {
		  current = expl.get(reworkedKeys.get(l)).trim();
		  String[] elements = current.split(" ");
		  currentKey = reworkedKeys.get(l);
		  		  
		  if(elements.length <= 1) {
			  int c = 1;
			  tempKey = currentKey + c;
			  temp = "";
			  while(reworkedKeys.contains(tempKey)) {				  
				  String tmp = expl.get(tempKey).trim();
				  String[] el = tmp.split(" ");
				  tmp = el[0];
				  temp += tmp + " "; 
				  
				  c++;
				  tempKey = tempKey.substring(0, tempKey.length() - 1);	  
				  tempKey += c;
			  }
			  current = temp + current;
			  expl.replace(currentKey, current);
		  }
	  }
	  
	  
	  for(int k = 0; k < keysToRemove.size(); k++) {
		  if(reworkedKeys.contains(keysToRemove.get(k))){
			  reworkedKeys.remove(keysToRemove.get(k));
		  }
	  }
  }
  
  public String createOutput(ArrayList<String> reworkedKeys) {
	  String finalDescription = "";
	  String current = "";
	  
	  for(int i = reworkedKeys.size() - 1; i >= 0; --i) {
		  int keyLength = reworkedKeys.get(i).length();
		  while(keyLength > 1) {
			  finalDescription += "&emsp;&emsp; ";
			  keyLength = keyLength - 1;
		  }
		  current = expl.get(reworkedKeys.get(i));
		  String[] elements = current.split(" ");
		  if(!current.contains("(") || elements.length < 2) {
			  String temp = "";
			  for(int j = 0; j < elements.length - 1; j++) {
				  temp += " " + makeBold(elements[j]);
			  }
			  if(i == reworkedKeys.size()-1) {
				  temp = "<font color=#112080>" + temp + "</font>";
			  }
			  temp += " " + elements[elements.length - 1];
			  
			  current = temp;
		  }
		  finalDescription += current + " </br> \n ";
		  
	  }
	  return finalDescription;
  }
    
  public String clean() {
	  clean(0, "1");
	  ArrayList<String> sortedKeys = sortKeys();
	  ArrayList<String> reworkedKeys = reworkValues(sortedKeys);
	  
	  reworkStructure(reworkedKeys); 
	  
	  String finalString = createOutput(reworkedKeys);
	  	  
	  return finalString;
  }
  
  public Map<String, String> clean(int depth, String key) {
	  Explanation[] details = getDetails();
	  	  
	  expl.put(key, getSummary());
	  
	  for(int i = 0; i < details.length; ++i) {
		  expl.putAll(details[i].clean(depth + 1, key + (i + 1)));
	  }  
	  return expl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Explanation that = (Explanation) o;
    return match == that.match &&
        Float.compare(that.value, value) == 0 &&
        Objects.equals(description, that.description) &&
        Objects.equals(details, that.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, value, description, details);
  }
  
  /**
	* Rounds the given value to a number with the given number of decimal 
	* places.
	* 
	* @param value The value
	* @param decimalPlaces The number of decimal places
	* @return The rounded value
	*/
	private double roundValue(double value, int decimalPlaces){
		double rounder = 1.0;
		for (int i=0; i<decimalPlaces; i++)
			rounder *= 10.0;
		return Math.round(value*rounder)/rounder;
	}


}
