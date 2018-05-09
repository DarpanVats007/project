/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * A collection reader that reads the single texts from the Debateportal files in a given directory. It can be
 * configured with the following parameters:
 * <ul>
 * <li><code>InputDirectory</code> - path to directory containing files</li>
 * <li><code>Encoding</code> (optional) - character encoding of the input files</li>
 * </ul>
 * 
 */
public class UIMADebatePortalReader extends CollectionReader_ImplBase {
	
	
	private static final String DIVISOR2 = 
			"==================================================================================";

	private static final String DIVISOR = 
			"=======================================================================================";

	
  /**
   * Name of configuration parameter that must be set to the path of a directory containing input
   * files.
   */
  public static final String PARAM_FILE_PATH = "InputDirectory";

  /**
   * Name of configuration parameter that contains the character encoding used by the input files.
   * If not specified, the default system encoding will be used.
   */
  public static final String PARAM_ENCODING = "Encoding";
  
  /**
   * Parameter that specifies the path of the directory with the texts to be
   * processed.
   */
  public static final String PARAM_INPUTDIR = "InputDirectory";
  
  /**
   * Parameter that specifies whether subdirectories of the specified 
   * directory shall also be processed.
   */
  public static final String PARAM_SUBDIRS = "IncludeSubdirectories";
  
  /**
   * The Debateportal text file reader
   */
  private BufferedReader debatePortalFileReader;

  /**
   * The encoding of the file
   */
  private String encoding;

  /**
   * The current index of reading
   */
  private int currentIndex;
  
  /**
   * The current line of the Debateportal text file
   */
  private String currentLine;
  

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  public void initialize() throws ResourceInitializationException {
	  
//	  String dir = ((String) getConfigParameterValue(PARAM_INPUTDIR)).trim();
////		dir = ClassLoader.getSystemResource(dir).getPath();
//		File directory = new File(dir);
//	    // if input directory does not exist, throw exception
//	    if (!directory.exists() || !directory.isDirectory()) {
//	      throw new ResourceInitializationException(
//	    		  ResourceConfigurationException.DIRECTORY_NOT_FOUND,
//	              new Object[] {PARAM_INPUTDIR, this.getMetaData().getName(), 
//	    				  directory.getPath() });
//	    }
//
//		// Now add all files
//		boolean includeSubdir = 
//				(Boolean) getConfigParameterValue(PARAM_SUBDIRS);
//		
//		try {
//			this.mFiles = this.addFilesRecursively(directory, includeSubdir);
//			System.out.println(getNumberOfDocuments());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(directory);
//		
//		// Now sort files
//		boolean sort = (Boolean) getConfigParameterValue(PARAM_SORT);
//		if (sort){
//			this.mFiles = this.sortFilesByAbsolutePath(this.mFiles);
//		}
//
//		// Set current number of read documents and the encoding
//		this.mCurrentIndex = 0;
//		String encoding = (String) getConfigParameterValue(PARAM_ENCODING);
//		if (encoding != null){
//			this.mEncoding = encoding;
//		}
	  
	    encoding = (String) getConfigParameterValue(PARAM_ENCODING);
	    currentIndex = 0;
	    currentLine = null;
	    
		  String dir = ((String) getConfigParameterValue(PARAM_INPUTDIR)).trim();

		  File directory = new File(dir);
		  System.out.println(directory);
		  // if input directory does not exist, throw exception
		  if (!directory.exists() || !directory.isDirectory()) {
			  throw new ResourceInitializationException(
    		  ResourceConfigurationException.DIRECTORY_NOT_FOUND,
    		  new Object[] {PARAM_INPUTDIR, this.getMetaData().getName(), 
    				  directory.getPath() });
		  }
		  
		 //Now add all files
		  boolean includeSubdir = 
				  (Boolean) getConfigParameterValue(PARAM_SUBDIRS);
	    
	    
	    
	    String filePath = (String) getConfigParameterValue(PARAM_FILE_PATH);
	    // if file does not exist, throw exception
	    if (!new File(filePath).exists()) {
	        throw new ResourceInitializationException(ResourceConfigurationException.DIRECTORY_NOT_FOUND,
	                new Object[] { PARAM_FILE_PATH, this.getMetaData().getName(), filePath});
	      }

	    try{
	    	debatePortalFileReader = new BufferedReader(
	    			new InputStreamReader(new FileInputStream(filePath), encoding));
	    }
	    catch (IOException ioe){
	    	debatePortalFileReader = null;
	    	ioe.printStackTrace();
	    }
    

  }

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  
  //ADAPT! ------------------------
  public boolean hasNext() {
	  if (currentLine != null)
		  return true;
	  try{
		 currentLine = debatePortalFileReader.readLine();
		 //currentIndex++; Changes needed?
		 return currentLine != null;
	  }
	  catch (IOException ioe){
		  ioe.printStackTrace();
		  return false;
	  }
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
	  String discussion = "";
	  boolean inDiscussion = false;
	  while ((currentLine = debatePortalFileReader.readLine()) != null) {
		  if(currentLine.equals(DIVISOR) || currentLine.equals(DIVISOR2)) {
			  inDiscussion ^= true;
		  } else if (inDiscussion) {
			  discussion = discussion + currentLine + "\n";
		  } else if (!inDiscussion) {
			  aCAS.reset();
			  aCAS.setDocumentText(discussion);
		  }
	  }
//		  charIndex++;
//	  String text = currentLine.substring(charIndex+1);
//	  text = text.replace("\t", "\n");
	  
//	  System.out.println("\n" + text);
	  
      // put document in CAS
//    aCAS.reset();
//    aCAS.setDocumentText(discussion);
    // Line has been fetched, so reset storage
    //currentLine = null;
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
	  debatePortalFileReader.close();
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(currentIndex, 5000000, Progress.ENTITIES) };
  }
}