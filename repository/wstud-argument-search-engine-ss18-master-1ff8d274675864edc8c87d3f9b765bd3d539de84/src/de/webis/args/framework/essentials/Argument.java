package de.webis.args.framework.essentials;

/**
 * This is a class of the argument unit.
 * @author jiani
 *
 */
public class Argument {
	
	// -------------------------------------------------------------------------
	// FIELDS
	// -------------------------------------------------------------------------
	
	static final String CONTEXT = "Context";
	static final String DISCUSSION_ID = "DiscussionID";
	static final String TITLE = "Title";
	static final String CRAWLDATE = "CrawlDate";
	static final String URL = "URL";
	static final String ARGUMENT = "Argument";
	static final String ARG_ID = "ArgumentID";
	static final String PREV_ID = "prevID";
	static final String NEXT_ID = "nextID";
	static final String CONCLUSION = "Conclusion";
	static final String CONCLUSION_START_POS = "ConclusionStartPos";
	static final String CONCLUSION_END_POS = "ConclusionEndPos";
	static final String PREMISE = "Premise";
	static final String PREMISE_START_POS = "PremiseStartPos";
	static final String PREMISE_END_POS = "PremiseEndPos";
	static final String PREMISE_STANCE = "PremiseStance";
	
	
	// -------------------------------------------------------------------------
	// MEMBERS
	// -------------------------------------------------------------------------
	
	private String mContext = "";
	private String mDiscussionID = "";
	private String mTitle = "";
	private String mCrawlDate = "";
	private String mUrl = "";
	private String mArgument = "";
	private String mArgID = "";
	private String mPrevID = "";
	private String mNextID = "";
	private String mConclusion = "";
	private int mConcStartPos = -1;
	private int mConcEndPos = -1;
	private String mPremise = "";
	private int mPremiStartPos = -1;
	private int mPremiEndPos = -1;
	private boolean mPremiStance = true;
	private String mComputedStance = "";
	private float mLuceneScore;
	private float mComputedScore;
	private Explanation mLuceneExplanation;
	private String mPresiTitleSnippet = "";
	private String mPresiContentSnippet = "";
	private String mPresiURLSnippet = "";
	private String mPresiPolishedPremise = "";
	private String mPresiFinalExplanation = "";
	
	
	// -------------------------------------------------------------------------
	// GETTERS
	// -------------------------------------------------------------------------
	
	public String context() {
		return mContext;
	}
	
	public String discID() {
		return mDiscussionID;
	}
	
	public String titel() {
		return mTitle;
	}
	
	public String crawDate() {
		return mCrawlDate;
	}
	
	public String url() {
		return mUrl;
	}
	
	public String argument() {
		return mArgument;
	}
	
	public String argID() {
		return mArgID;
	}
	
	public String prevID() {
		return mPrevID;
	}
	
	public String nextID() {
		return mNextID;
	}
	
	public String conclusion() {
		return mConclusion;
	}
	
	public int concStartPos() {
		return mConcStartPos;
	}
	
	public int concEndPos() {
		return mConcEndPos;
	}
	
	public String premise() {
		return mPremise;
	}
	
	public int premiStartPos() {
		return mPremiStartPos;
	}
	
	public int premiEndPos() {
		return mPremiEndPos;
	}
	
	public boolean premiStance() {
		return mPremiStance;
	}
	
	public String computedStance() {
		return mComputedStance;
	}
	
	public float luceneScore() {
		return mLuceneScore;
	}
	
	public float score() {
		return mComputedScore;
	}
	
	public Explanation explain() {
		return mLuceneExplanation;
	}
	
	public String presiTitleSnippet() {
		return mPresiTitleSnippet;
	}

	public String presiContentSnippet() {
		return mPresiContentSnippet;
	}

	public String presiURLSnippet() {
		return mPresiURLSnippet;
	}
	
	public String presiPolishedPremise() {
		return mPresiPolishedPremise;
	}

	public String presiFinalExplanation() {
		return mPresiFinalExplanation;
	}

	
	// -------------------------------------------------------------------------
	// SETTERS
	// -------------------------------------------------------------------------
	
	//TODO: change name of the method!!!
	public void setAllFields(String context,
					   String discID,
					   String title,
					   String date,
					   String url,
					   String argument,
					   String argId,
					   String prevId,
					   String nextId,
					   String conc,
					   int concStartPos,
					   int concEndPos,
					   String premise,
					   int premiStartPos,
					   int premiEndPos,
					   boolean premiStance,
					   float score) {
		mContext = context;
		mDiscussionID = discID;
		mTitle = title;
		mCrawlDate = date;
		mUrl = url;
		mArgument = argument;
	    mArgID = argId;
	    mPrevID = prevId;
	    mNextID = nextId;
	    mConclusion = conc;
	    mConcStartPos = concStartPos;
	    mConcEndPos = concEndPos;
	    mPremise = premise;
	    mPremiStartPos = premiStartPos;
	    mPremiEndPos = premiEndPos;
	    mPremiStance = premiStance;
	    mLuceneScore = score;
	}
	
	public void setContext(String context) {
		mContext = context;
	}
	
	public void setDiscID(String discID) {
		mDiscussionID = discID;
	}
	
	public void setTitle(String title) {
		mTitle = title;
	}
	
	public void setCrawDate(String date) {
		mCrawlDate = date;
	}
	
	public void setUrl(String url) {
		mUrl = url;
	}
	
	public void setArgument(String argument) {
		mArgument = argument;
	}
	
	public void setArgID(String id) {
		mArgID = id;
	}
	
	public void setPrevID(String id) {
		mPrevID = id;
	}
	
	public void setNextID(String id) {
		mNextID = id;
	}
	
	public void setConclusion(String conclusion) {
		mConclusion = conclusion;
	}
	
	public void setConcStartPos(int pos) {
		mConcStartPos = pos;
	}
	
	public void setConcEndPos(int pos) {
		mConcEndPos = pos;
	}
	
	public void setPremise(String premise) {
		mPremise = premise;
	}
	
	public void setPremiStartPos(int pos) {
		mPremiStartPos = pos;
	}
	
	public void setPremiEndPos(int pos) {
		mPremiEndPos = pos;
	}
	
	public void setPremiStance(boolean stance) {
		mPremiStance = stance;
	}
	
	public void setComputedStance(String b) {
		mComputedStance = b;
	}
	
	public void setLuceneScore(float score) {
		mLuceneScore = score;
	}
	
	public void setScore(float score) {
		mComputedScore = score;
	}
	
	public void setExplanation(org.apache.lucene.search.Explanation explain) {
		mLuceneExplanation = new Explanation(explain);
	}
	
	public void setPresiTitleSnippet(String titleSnippet) {
		mPresiTitleSnippet = titleSnippet;
	}

	public void setPresiContentSnippet(String contentSnippet) {
		mPresiContentSnippet = contentSnippet;
	}

	public void setPresiURLSnippet(String urlSnippet) {
		mPresiURLSnippet = urlSnippet;
	}
	
	public void setPresiPolishedPremise(String polishedPremise) {
		mPresiPolishedPremise = polishedPremise;
	}
	
	public void setPresiFinalExplanation(String finalExplanation) {
		mPresiFinalExplanation = finalExplanation;
	}
	
	public void setAllPresiComponents(String titleSnip, String contSnip, 
			String urlSnip, String premise, String finalExpl) {
		mPresiTitleSnippet = titleSnip;
		mPresiContentSnippet = contSnip;
		mPresiURLSnippet = urlSnip;
		mPresiPolishedPremise = premise;
		mPresiFinalExplanation = finalExpl;
	}

}
