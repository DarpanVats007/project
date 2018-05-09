package de.webis.args.framework.miningAndAssessment;

import java.io.File;
import java.util.Properties;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CollectionReader;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceSpecifier;
import org.apache.uima.util.XMLInputSource;

import de.aitools.ie.uima.type.core.Sentence;
import de.aitools.ie.uima.type.core.SourceDocumentInformation;
import de.aitools.ie.uima.type.core.Token;

public class SampleUIMACollectionProcessor implements IMinerCreator{

	// -------------------------------------------------------------------------
	// Properies
	// -------------------------------------------------------------------------

	/**
	 * The path of root directory of the training files to be processed.
	 */
	private static final String COLLECTION_ROOT_DIR = 
			"mining_collection_root";

	/**
	 * The path of the XMI file of the collection reader to be used to iterate
	 * over all files to be processed.
	 */
	private static final String COLLECTION_READER_PATH = 
			"mining_collection_reader_path";
			
	/**
	 * The path of the XMI file of the analysis engine to be used to process
	 * the files.
	 */
	private static final String ANALYSIS_ENGINE_PATH = 
			"mining_analysis_engine_path";
	
	private static final String ANALYSIS_ENGINE_ASSESSMENT_PATH = 
			"assessment_analysis_engine_path";
	private static final String OUTPUT_PATH =
			"assessment_output_file_path";
	

	// -------------------------------------------------------------------------
	// Members
	// -------------------------------------------------------------------------
	
	private String mCollectionRootDir;
	private String mCollectionReaderPath;
	private String mAnalysisEnginePath;
	private String mAnalysisEngineAssessmentPath;
	private String mOutputPath;
	
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------	

	@Override
	public void initializeMining(Properties config) {
		// Read properties
		mCollectionRootDir = config.getProperty(COLLECTION_ROOT_DIR);
		mCollectionReaderPath = config.getProperty(COLLECTION_READER_PATH);
		mAnalysisEnginePath = config.getProperty(ANALYSIS_ENGINE_PATH);
		mAnalysisEngineAssessmentPath = config.getProperty(ANALYSIS_ENGINE_ASSESSMENT_PATH);
		mOutputPath = config.getProperty(OUTPUT_PATH);
	}

	@Override
	public void generateFiles() {
		// Initialize UIMA engines
		CollectionReader cr = this.createCollectionReader(
				mCollectionReaderPath, mCollectionRootDir);
		AnalysisEngine ae = this.createAnalysisEngine(mAnalysisEnginePath);
		AnalysisEngine aeAssesment = this.createAnalysisEngine(mAnalysisEngineAssessmentPath);
		
		// Iterate with collection reader over collection and process each text
		// with analysis engine
		System.out.println("Processing collection...");
  		try{
  			// Create CAS object only once to avoid memory overhead
  			CAS aCAS = ae.newCAS();
  			int discussionID = 0;
  			
  			// Stepwise process each text managed by the collection reader
  			while (cr.hasNext()){  
  				// Store current text in JCas object
  				cr.getNext(aCAS);
  				JCas jcas = aCAS.getJCas();
  				
  				// Get input file name without suffix
  				SourceDocumentInformation sdi = (SourceDocumentInformation)
  						aCAS.getJCas().getAnnotationIndex(
  							SourceDocumentInformation.type).iterator().next();
  				File inputFile = new File(sdi.getUri());
  				String path = inputFile.getAbsolutePath();
  				
  				// Add annotations to text with aggregate analysis engine
  				// (internally calling all employed primitive analysis engines)	
				
				ae.process(jcas); 
				aeAssesment.process(jcas);
				
				discussionID++;
				System.out.println("----------------Reading new file----------------");
				JsonFileWriter.readJCas(jcas, discussionID, mOutputPath);	
  			}
  		} catch (Exception ex){
  			ex.printStackTrace();
  		}
		System.out.println("\nfinished\n");
		
		// Destroy UIMA engines
		cr.destroy();
		ae.destroy();
	}
	
	
	// -------------------------------------------------------------------------
	// INITIALIZATION
	// -------------------------------------------------------------------------

	/**
	 * Returns the collection reader in the file with the given path to be used 
	 * to iterate over the input directory with the given path. 
	 * 
	 * @param crPath The path of the collection reader
	 * @param inputDir The path of the input directory
	 * @return The collection reader.
	 */
	private CollectionReader createCollectionReader(String crPath, 
			String inputDir){
		System.out.print("Initializing \"" + crPath + "\"...");
		long count = System.currentTimeMillis();
		CollectionReader cr = null;
		try{
			// Create collection reader from XML descriptor
			XMLInputSource xmlInputSource = new XMLInputSource(crPath);
			ResourceSpecifier specifier = 
				UIMAFramework.getXMLParser().parseResourceSpecifier(
						xmlInputSource);
			cr = UIMAFramework.produceCollectionReader(specifier);
			
			// Change parameter values and, therefore, reconfigure reader
			cr.setConfigParameterValue("InputDirectory", inputDir);
			cr.setConfigParameterValue("IncludeSubdirectories", true);
			cr.reconfigure();
		} catch (Exception ex){
			ex.printStackTrace();
		}
		count = System.currentTimeMillis() - count;
		System.out.println("\nfinished in " + (count/1000.0) + "s\n");
		return cr;
	}

	/**
	 * Creates and returns the analysis engine that refers to the specified
	 * descriptor file path.
	 * 
	 * @param aePath The path of descriptor file the analysis engine
	 * @return The analysis engine
	 */
	private AnalysisEngine createAnalysisEngine(String aePath){
		System.out.print("Initializing \"" + aePath + "\"...");
		long count = System.currentTimeMillis();
		AnalysisEngine ae = null;
		try{
			// Create analysis engine from XML descriptor
			XMLInputSource xmlInputSource = new XMLInputSource(aePath);
			ResourceSpecifier specifier = 
				UIMAFramework.getXMLParser().parseResourceSpecifier(
						xmlInputSource);
			ae = UIMAFramework.produceAnalysisEngine(specifier);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		count = System.currentTimeMillis() - count;
		System.out.println("\nfinished in " + (count/1000.0) + "s\n");
		return ae;
	}
}
