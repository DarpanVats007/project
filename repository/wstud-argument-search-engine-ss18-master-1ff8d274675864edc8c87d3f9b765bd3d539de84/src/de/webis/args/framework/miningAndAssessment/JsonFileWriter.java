package de.webis.args.framework.miningAndAssessment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.aitools.ie.uima.type.argumentation.Argument;
import de.aitools.ie.uima.type.argumentation.MetadataArgs;

public class JsonFileWriter {
		
	
	/**
	 * Temporary String for URL.
	 */
	protected static String url = "";

	/**
	 * Temporary String for Crawldate.
	 */
	protected static String crawldate = "";

	/**
	 * Temporary String for Title.
	 */
	protected static String title = "";
	
	/**
	 * Temporary String for Context.
	 */
	protected static String context = "";
	
	/**
	 * Temporary String for Conclusion.
	 */
	protected static String conclusion = "";

	/**
	 * Temporary String for Premise.
	 */
	protected static String premise = "";

	/**
	 * Temporary String for Stance.
	 */
	protected static String stance = "";
	
	/**
	 * Temporary Int for DiscussionID.
	 */
	protected static int discussionID = 0;
	
	/**
	 * Temporary Int for ArgumentID.
	 */
	protected static int argumentID = 0;
	
	// init all needed JSONObjects/-Arrays
	protected static JSONObject masterObj;
	protected static JSONObject metaObj;
	protected static JSONObject argumentObj;
	protected static JSONArray premiseSPos;
	protected static JSONArray premiseEPos;
	protected static JSONArray objList;
	
	static String tempDis = "";
	
	/*
	 * read all JCAS discussion Objects and get Elements out of it
	 */
	public static void readJCas(JCas jcas, int discussionNr, String targetFilePath) 
			throws JSONException, IOException {
			
		discussionID 	= discussionNr;
		argumentID 		= 0;
		masterObj 		= new JSONObject();
		metaObj 		= new JSONObject();
		argumentObj 	= new JSONObject();
		premiseSPos 	= new JSONArray();
		premiseEPos 	= new JSONArray();
		objList 		= new JSONArray();
		
		// Go over all Argument Annotations and extract information
		FSIterator<Annotation> argumentIter = jcas.getAnnotationIndex(Argument.type).iterator();
		while (argumentIter.hasNext()){
			Argument argument = (Argument) argumentIter.next();
			argumentObj = new JSONObject();
			conclusion = argument.getConclusion().getCoveredText();
			premise = argument.getPremises(0).getCoveredText();
			stance = argument.getStances(0);
			
			argumentObj.put("Conclusion", conclusion.trim());
			JSONArray tempPremise = new JSONArray();
			tempPremise.put(premise.trim());
			argumentObj.put("Premise", tempPremise);
			JSONArray tempStance = new JSONArray();
			tempStance.put(stance);
			argumentObj.put("PremiseStance", tempStance);
			argumentObj.put("ConclusionStartPos", argument.getConclusion().getBegin());
			argumentObj.put("ConclusionEndPos", argument.getConclusion().getEnd());
			
			JSONArray tempPos = new JSONArray();
			tempPos.put(argument.getPremises(0).getBegin());
			argumentObj.put("PremiseStartPos", tempPos);
			tempPos  = new JSONArray();
			tempPos.put(argument.getPremises(0).getEnd());
			argumentObj.put("PremiseEndPos", tempPos);
			
			// Calculate ArgumentID, previousID and nextID
			argumentID++;
			String tempArgID = "" + argumentID;
			while(tempArgID.length() < 8) {
				tempArgID = 0 + tempArgID;
			}
			argumentObj.put("ArgumentID", tempArgID);
			
			int tempID = argumentID - 1;
			tempArgID = "" + tempID;
			while(tempArgID.length() < 8) {
				tempArgID = 0 + tempArgID;
			}
			argumentObj.put("prevID", tempArgID);
			argumentObj.put("nextID", "00000000");
				
			if(objList.length() >= 1) {
				JSONObject temp = objList.getJSONObject(argumentID-2).getJSONObject("Argument");		
				String tempArg = "" + argumentID;
				while(tempArg.length() < 8) {
					tempArg = 0 + tempArg;
				}
				temp.put("nextID", tempArg);
			}
			JSONObject tempObj = new JSONObject().put("Argument", argumentObj);
			objList.put(tempObj);
		}
		try {
		addAdditionalInformation(jcas);
		} catch(NoSuchElementException e) {
			System.out.println("test");
		}
			
		masterObj.put("ArgumentList",objList);
		masterObj.put("MetaData", metaObj);
		
		//fileID = Debateportal + Discussion ID.
		String fileID = "discussion-" + tempDis;
		
		if(jcas.getAnnotationIndex(Argument.type).size() < 1) {
			System.out.println("No Arguments in File" + fileID);
		} else {
			writeJSONFiles(masterObj, fileID, targetFilePath);
		}

	}
	
	/*
	 * Add Additional Information (URL, Crawldate, Title, Context, etc.) 
	 */
	static void addAdditionalInformation(JCas jcas) throws JSONException {
		
		FSIterator<Annotation> metadataIter = jcas.getAnnotationIndex(MetadataArgs.type).iterator();
		MetadataArgs metaData = (MetadataArgs) metadataIter.next();
		url = metaData.getUrl();
		crawldate = metaData.getCrawlingDate();
		title = metaData.getTitle();
		context = jcas.getDocumentText();
		metaObj.put("URL", url);
		metaObj.put("Title", title);
		metaObj.put("CrawlDate", crawldate);
		metaObj.put("Context", context);
		
		tempDis = "" + discussionID;
		while(tempDis.length() < 8) {
			tempDis = 0 + tempDis;
		}
		metaObj.put("DiscussionID", tempDis);
	}
	
	/*
	 * Write final JSON Files to hard set location targetFilePath
	 */
	static void writeJSONFiles(JSONObject obj, String fileID, String targetFilePath) throws IOException {
		
		targetFilePath += fileID + ".json";
		FileWriter file = new FileWriter(targetFilePath);
		file.write(obj.toString());
		file.flush();
		file.close();
		
		System.out.println("Discussion-File " + fileID + " created.");
	}

}
