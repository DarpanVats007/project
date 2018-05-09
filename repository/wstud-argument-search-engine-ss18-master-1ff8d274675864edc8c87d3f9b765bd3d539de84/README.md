# !IMPORTANT!
The exampleConfig.properties file is only used __WITHIN__ this project for testing.
If you want to deploy our args webclient with your certain config, please change the conf/config.properties in the webclient.


- [SAMPLE/PROTOTYPE](#description)
    - [RETRIEVAL](##retrieval)

# SAMPLE/PROTOTYPE

## RETRIEVAL ##
Our protorype uses Apache Lucene for the retrieval. 

Each query string generated from the last step is turned into Lucene BooleanQuery. The BooleanQuery is a Query that matches documents matching boolean combinations of other queries. Here, it is a combination of a TermQuery that returns arguments whose conclusion contains __ANY__ term of the query string and a MultiFieldQuery that returns arguments which contains __ALL__ terms of the query string in conclusion, premise and context field.