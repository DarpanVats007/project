package org.apache.uima.portals;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;

import org.apache.uima.portals.Functions;

import de.aitools.ie.uima.type.argumentation.Argument;
import de.aitools.ie.uima.type.argumentation.ArgumentativeDiscourseUnit;
import de.aitools.ie.uima.type.argumentation.MetadataArgs;

/**
 * Dummy analysis engine that does nothing. Serves for two purposes: (1) It can 
 * be used when an analysis engine is needed only for creating CAS objects or 
 * similar reasons, not for actual analyses. (2) It can be used as a template 
 * when a new analysis engine is created.
 * 
 * @author henning.wachsmuth
 *
 */
public class DebateAE extends JCasAnnotator_ImplBase {
	
	// -------------------------------------------------------------------------
	// CONSTANTS
	// -------------------------------------------------------------------------

	/**
	 * KeyWord for URL
	 */
	public static String URL = "URL";

	/**
	 * KeyWord for CrawlDate
	 */
	public static String CRAWL_DATE = "Crawl date";

	/**
	 * KeyWord for Title
	 */
	public static String TITLE = "Debate";
	
	/**
	 * KeyWord for Conclusion-Pro
	 */
	public static String CONCLUSION_PRO = "Claim For";

	/**
	 * KeyWord for Conclusion-Con
	 */
	public static String CONCLUSION_CON = "Claim Against";
	
	/**
	 * KeyWord for Premise-Pro
	 */
	public static String PREMISE_PRO = "Evidence Pro";

	/**
	 * KeyWord for Premise-Con
	 */
	public static String PREMISE_CON = "Evidence Con";

	/**
	 * KeyWord for Stance
	 */
	public static String STANCE = "";

	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------
	
	@Override
	public void initialize(UimaContext aContext) 
	throws ResourceInitializationException {
		super.initialize(aContext);
		// Load parameter, initialize objects, etc.
	}
	
	
	
	// -------------------------------------------------------------------------
	// PROCESSING
	// -------------------------------------------------------------------------
	
	@Override
	public void process(JCas jcas) {
		String text = jcas.getDocumentText();
		String [] lines = text.split("\n");
		String checkPortal = lines[0].trim();
		
		int metadataBegin = 0;
		int metadataEnd = 0;
		int titleLine = 0;
		int cutOffKeyWordTitle = 0; 
		
		String url = "";
		String crawlDate = "";
		String title = "";
		String stance = "";
		
		if(checkPortal.toLowerCase().contains("www.debate.org") || 
				checkPortal.toLowerCase().contains("http://debate.org")) {
			List<Integer> lineOffsets = new ArrayList<Integer>();
			int offset = 0;
			for (int i=0; i<lines.length; i++){
				lineOffsets.add(offset);
				offset += lines[i].length() + 1;
			}
			for (int i=0; i<lines.length; i++) {
				String[] split = lines[i].trim().split("\\:", 2);
				String keyWord = split[0].trim();
				
				if(keyWord.equals(URL) && !(split[1].isEmpty())) {
					url = split[1].trim();
					metadataBegin = lineOffsets.get(i);
				} else if(keyWord.equals(CRAWL_DATE) && !(split[1].isEmpty())) {
					crawlDate = split[1].trim();
				} else if((keyWord.equals(TITLE) || keyWord.equals("Debate Argument")
						|| keyWord.equals("Debate Topic") || keyWord.equals("Debate Issue") ||
						keyWord.equals("Online Debate")) && !(split[1].isEmpty())) {
					title = split[1].trim();
					int cut = title.indexOf(("| Debate.org"));
					title = title.substring(0, cut).trim();
					if (title.endsWith("?")) {
						System.out.println("Questions should not be added");
						break;
					} else {
						titleLine = i;
						cutOffKeyWordTitle = keyWord.length() + 1;
						
						String[] tempSplitter = split[1].split("\\|");
						title = tempSplitter[0].trim();
						
						metadataEnd = titleLine + lines[i].length();
						MetadataArgs metaData = new MetadataArgs(jcas, metadataBegin, metadataEnd);	
						metaData.setUrl(url);
						metaData.setCrawlingDate(crawlDate);
						metaData.setTitle(title);
						metaData.addToIndexes();
					}
					
				} else if(keyWord.equals(PREMISE_PRO) || keyWord.equals(PREMISE_CON)
						&& !(split[1].isEmpty())) {
					String findStance[] = keyWord.split("\\s+");
					int trimPremise = keyWord.length() + 1;
					
					String conclusion = lines[titleLine];
					int trimConclusion = conclusion.indexOf("| Debate.org");
					
					ArgumentativeDiscourseUnit adu1 = 
							new ArgumentativeDiscourseUnit(jcas, lineOffsets.get(titleLine) + cutOffKeyWordTitle +1, lineOffsets.get(titleLine) + trimConclusion - 1);
					if(!(Functions.allreadyExists(jcas, adu1))) {
						adu1.addToIndexes();
					}
					
					ArgumentativeDiscourseUnit adu2 = 
							new ArgumentativeDiscourseUnit(jcas, lineOffsets.get(i) + trimPremise,lineOffsets.get(i) + lines[i].length());
					adu2.addToIndexes();
					
					StringArray stances = new StringArray(jcas, 1);
					stance = findStance[1].trim();
					stances.set(0, stance);
					
					Argument argument = new Argument(jcas, adu2.getBegin(), adu2.getEnd());
					
					argument.setConclusion(adu1);
					FSArray premises = new FSArray(jcas, 1);
					premises.set(0, adu2);
					argument.setPremises(premises);
					argument.setStances(stances);
					argument.addToIndexes();
				}
					
			}
		}
	}
	
	
	
	// -------------------------------------------------------------------------
	// DESTRUCTION
	// -------------------------------------------------------------------------
	
	@Override
	public void destroy() {
		super.destroy();
		// Destroy anything if necessary
	}
}
