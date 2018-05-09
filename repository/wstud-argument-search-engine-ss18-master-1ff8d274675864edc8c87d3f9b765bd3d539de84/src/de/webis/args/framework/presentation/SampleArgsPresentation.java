package de.webis.args.framework.presentation;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser.Operator;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;
import org.apache.lucene.search.highlight.NullFragmenter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.jsoup.Jsoup;

import de.webis.args.framework.essentials.Argument;
import de.webis.args.framework.querying.PreparedQuery;

public class SampleArgsPresentation implements IPresiCreator {
	
	// -------------------------------------------------------------------------
	// PROPERTIES
	// -------------------------------------------------------------------------
	
	private static final String PRESI_TITLE_LENGTH = "presi_title_length";
	private static final String PRESI_URL_LENGTH = "presi_url_length";
	private static final String PRESI_SNIPPET_LENGTH = "presi_snippet_length";
	private static final String PRESI_NUM_BEST_FRAGMENTS = "presi_num_best_fragments";
	
	
	// -------------------------------------------------------------------------
	// MEMBERS WITH DEFAULT VALUES
	// -------------------------------------------------------------------------
	private int mTitleLength = 60;	
	private int mURLLength = 70;
	private int mSnippetLength = 200;
	private int mNumFragments = 2;
	
	
	// -------------------------------------------------------------------------
	// INTERFACE IMPLEMENTATION
	// -------------------------------------------------------------------------
	@Override
	public void initializePresi(Properties config) {
		// Load all configurations
		String propTLength = config.getProperty(PRESI_TITLE_LENGTH);
		String propULength = config.getProperty(PRESI_URL_LENGTH);
		String propSLength = config.getProperty(PRESI_SNIPPET_LENGTH);
		String propNFrags = config.getProperty(PRESI_NUM_BEST_FRAGMENTS);
		
		// If the customized values are given, store them in class members
		if (propTLength != null && !propTLength.isEmpty()) {
			mTitleLength = Integer.valueOf(propTLength);
		}
		if (propULength != null && !propULength.isEmpty()) {
			mURLLength = Integer.valueOf(propULength);
		}
		if (propSLength != null && !propSLength.isEmpty()) {
			mSnippetLength = Integer.valueOf(propSLength);
		}
		if (propNFrags != null && !propNFrags.isEmpty()) {
			mNumFragments = Integer.valueOf(propNFrags);
		}
	}
	
	@Override
	public String createContentSnippet(Argument argument, String querystring) 
			throws IOException, InvalidTokenOffsetsException, ParseException {
		String PREMISE = argument.premise();
		String snippet = createSnippet(PREMISE, querystring);
		return snippet;
	}
	
	@Override
	public String createTitleSnippet(Argument argument) 
			throws IOException, InvalidTokenOffsetsException, ParseException {
		String PREMISE = argument.premise();
		String SNIPPET = argument.presiContentSnippet();
		String title = createTitle(SNIPPET, PREMISE);
		return title;
	}
	
	@Override
	public String createURLSnippet(Argument argument) {
		String URL = argument.url();
		String url = createURL(URL);
		return url;
	}
	
	@Override
	public String createPolishedPremise(Argument argument, String querystring) 
			throws IOException, InvalidTokenOffsetsException, ParseException {
		String PREMISE = argument.premise();
		String premise = polishWholePremise(PREMISE, querystring);
		return premise;
	}
	
	@Override
	public String createFinalExplanation(Argument argument) {
//		return argument.explain().toHtml();
		return argument.explain().clean();
	}
	
	
	
	// -------------------------------------------------------------------------
	// PRIVATE METHODES
	// -------------------------------------------------------------------------
	
    /**
     * Process the raw premise field text into shortened snippet 
     * to be shown on the webpage
     * 
     * @param premiseText the unprocessed premise field text
     * @throws InvalidTokenOffsetsException 
     * @throws IOException 
     * @throws ParseException 
     */
    private String createSnippet(String premiseText, String queryString) 
    		throws IOException, InvalidTokenOffsetsException, ParseException 
    {
    	// Removing HTML Tags from the source text
    	premiseText = removeHTMLTags(premiseText);
    	// Highlighting and returning the best fragments
    	String snippet = "";
    	String[] bestFragment = highlightText(premiseText, "Premise", 
    			mNumFragments, "shorten", queryString);
    	int bestFragLength = bestFragment.length;
    	// If best fragment(s) exists, merge them to form the snippet
    	if (bestFragLength > 0) {
    		String lastFragment = bestFragment[bestFragment.length - 1];
        	for(int i = 0; i < bestFragLength - 1; i++) {
        		bestFragment[i] = removeSymbols(bestFragment[i]);
        		snippet += bestFragment[i] + " ... ";
        	}
        	lastFragment = removeSymbols(lastFragment);
        	snippet += lastFragment;
		}
    	// If no best fragment exists, return the premise field
    	else if(bestFragment == null || bestFragLength == 0) {
    		snippet = shortenSnippet(premiseText, mSnippetLength);
    	}
    	// Cut symbols and restrict the length of the text according to configuration
		snippet = removeSymbols(snippet);
		snippet = shortenSnippet(snippet, mSnippetLength);
    	
    	return snippet;
    }
    
    /**
     * Highlight the whole premise and polish it with removing 
     * HTML Tags and highlighting the query-string keywords
     * 
     * @param premiseText the unprocessed premise field text
     * @throws InvalidTokenOffsetsException 
     * @throws IOException 
     * @throws ParseException 
     */
    private String polishWholePremise(String premiseText, String querystring) 
    		throws IOException, InvalidTokenOffsetsException, ParseException 
    {
    	// Removing HTML Tags from the source text
    	premiseText = removeHTMLTags(premiseText);
    	// Highlight the whole text without cutting anything
    	String[] highlighted = highlightText(premiseText, "Premise", 1, "fullLength", querystring);
    	String premise = "";
    	// If no text highlighted, return the original premise and trim symbol
    	if (highlighted.length == 0 || highlighted == null) {
    		premise = removeSymbols(premiseText);
		}
    	else {
    		premise = highlighted[0];
    	}
    	
    	return premise;
	}
    
    /**
     * Create the title for the results from the premise text
     * according to the extracted best snippet. Shows sentence begin.
     * 
     * @param snippet 
     * @param premiseText
     */
    private String createTitle(String snippet, String premiseText) 
    {
    	int sentenceBegin = findSentenceBegin(snippet, premiseText);
    	String title = premiseText.substring(sentenceBegin, premiseText.length()); 
    	title = shortenSnippet(title, mTitleLength);
    	// Make sure that no empty result is returned
    	if (title == null || title.isEmpty()) {
    		title = shortenSnippet(premiseText, mTitleLength);
		}
    	title = removeSymbols(title);
    	title = capFirstLetter(title);
    	
		return title;
	}
    
    /**
     * Process the URL, so that the length will be controlled.
     */
    private String createURL(String url)
    {
    	if (url.length() > mURLLength) {
			url = shortenSnippet(url, mURLLength) + "...";
		}
    	return url;
    }
    
    /**
     * Highlight the given field and return the bestFragments according to the query
     * or return the processed full-length text according to parameters
     * 
     * @param text text field to be highlighted
     * @param fieldName
     * @param numBestFragments number of the best fragments to be returned
     * @param fragmenter "fullLength" to return full text, otherwise getting fragments
     * @return
     * @throws IOException
     * @throws InvalidTokenOffsetsException
     * @throws ParseException 
     */
    private String[] highlightText(String text, String fieldName, int numBestFragments, 
    		String fragmenter, String querystring) 
    		throws IOException, InvalidTokenOffsetsException, ParseException 
    {
    	// Setting query parser for Highlighting
    	String[] fields = {"Conclusion", "Premise", "Context"};
    	Analyzer analyzer = new StandardAnalyzer();
    	
    	MultiFieldQueryParser parser = new MultiFieldQueryParser(fields, analyzer);
        parser.setDefaultOperator(Operator.AND);
        Query multiFieldQuery = parser.parse(querystring);
        QueryScorer scorer = new QueryScorer(multiFieldQuery);
        
    	// Initializing components
    	Highlighter highlighter = new Highlighter(new SimpleHTMLFormatter(), scorer);
    	if (fragmenter.equals("fullLength")) {
    		highlighter.setTextFragmenter(new NullFragmenter());
		} else {
	    	highlighter.setTextFragmenter(new SimpleFragmenter());
		}
        StandardAnalyzer standardAnalyzer = new StandardAnalyzer();
    	TokenStream tokenStream = standardAnalyzer.tokenStream(fieldName, text);
    	// Highlighting
    	String[] bestFragment = highlighter.getBestFragments(tokenStream, text, numBestFragments);
    	// Closing components (avoid resource leak)
    	tokenStream.reset(); 
    	tokenStream.end(); 
    	tokenStream.close(); 
    	standardAnalyzer.close();
    	return bestFragment;
    }

    /**
     * Shorten a snippet to a certain length, trying to preserve full words.
     * Will cut the string hard after the specified amount of characters if no spaces could be
     * found or cutting after words would reduce the size more than 2/3 of the desired length.
     *
     * @param snippet the snippet
     * @param numCharacters number of characters after which to truncate
     * @return the truncated snippet
     */
    private String shortenSnippet(String snippet, final int numCharacters)
    {
        if (snippet.length() > numCharacters) {
            final boolean wordEnded = (snippet.charAt(numCharacters) == ' ');
            snippet = snippet.substring(0, numCharacters);

            // Get rid of incomplete words
            final int pos = snippet.lastIndexOf(' ');
            if (!wordEnded && -1 != pos) {
                // Shorten snippet if it doesn't become too short
                if ((int)(.6 * numCharacters) <= pos) {
                    snippet = snippet.substring(0, pos);
                }
            }
        }
        return snippet.trim();
    }
    
    /**
     * Trim some symbols, if they are at the start of a paragraph.
     *
     * @param snippet the snippet
     * @return the trimmed snippet
     */
    private String removeSymbols(String snippet) 
    {
    	snippet = snippet.startsWith(",") ? snippet.substring(1) : snippet;
    	snippet = snippet.startsWith(".") ? snippet.substring(1) : snippet;
    	snippet = snippet.startsWith(":") ? snippet.substring(1) : snippet;
    	snippet = snippet.startsWith("?") ? snippet.substring(1) : snippet;
    	snippet = snippet.startsWith(")") ? snippet.substring(1) : snippet;
    	snippet = snippet.startsWith("-") ? snippet.substring(1) : snippet;
    	
    	return snippet.trim();
    }
    
    /**
     * Find the begin of the snippet in the source text
     * if the snippet starts in the middle of a sentence
     * 
     * @param snippet
     * @param premise
     * @return
     */
    private int findSentenceBegin(String snippet, String premise) 
    {
    	int sentenceBegin;
    	snippet = removeHTMLTags(snippet);
    	
    	// Position of the snippet
    	int matchPos;
    	if (snippet.length()<11) {
    		matchPos = premise.indexOf(snippet);
		} else {
    		matchPos = premise.indexOf(snippet.substring(0,10));
    	}
    	
    	// If a sentence begins in the first 3 characters of the snippet
    	if (snippet.length()>3) {
    		for (int i = matchPos + 2; i >= matchPos; i--) {
        		char thisChar = premise.charAt(i);
    			if (".".equals(thisChar) || "!".equals(thisChar) || "?".equals(thisChar)) {
    				sentenceBegin = i + 1;
    				return sentenceBegin;
    			}
    		}
		}

    	// Finds sentence-ending symbols before the snippet begins
    	String textBeforeSnip = premise.substring(0, matchPos);
    	int matchDot = textBeforeSnip.lastIndexOf(".");
    	int matchQueMark = textBeforeSnip.lastIndexOf("?");
    	int matchExclaim = textBeforeSnip.lastIndexOf("!");
    	int matchQuote1 = textBeforeSnip.lastIndexOf("”");
    	int[] indexes = {matchDot + 1, matchQueMark + 1, matchExclaim + 1, matchQuote1 + 1};
    	Arrays.sort(indexes);
    	
    	sentenceBegin = indexes[indexes.length - 1];	
    	if(sentenceBegin < 0) {
    		sentenceBegin = 0;
    	}
    	return sentenceBegin;
	}
    
    /**
     * Remove the HTML style in the given text
     * 
     * @param snippet
     * @return
     */
    private String removeHTMLTags(String snippet) 
    {
    	snippet = Jsoup.parse(snippet).text();
		return snippet;
	}
    
    /**
     * Capitalize the first letter of the given text
     * 
     * @param text
     */
    private String capFirstLetter(String text)
    {
    	if (text.length()>0) {
    		text = text.substring(0, 1).toUpperCase() + text.substring(1);
		}
    	return text;
    }

}
