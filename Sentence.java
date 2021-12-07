import java.util.ArrayList;

public class Sentence {


    // needs to be in a constructor
    
    private String text;
    private String author;
    private String timestamp;
    

    public Sentence(String text, String author, String timestamp){
        this.text = text;
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String toString(){
        return "author: " + author +" "+ "text: "+ text+" "+ "timestamp: "+ timestamp;
    }
     




    public ArrayList<String> splitSentence() {
         //from https://www.ranks.nl/stopwords
        String[] stopwords = {"a", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "aren't", 
        "as", "at", "be", "because", "been", "before", "being", "below", "between", "both", "but", "by", "can't", "cannot", "could", 
        "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down", "during", "each", "few", "for", "from", "further", 
        "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll", "he's", "her", "here", "here's", "hers", 
        "herself", "him", "himself", "his", "how", "how's", "i", "i'd", "i'll", "i'm", "i've", "if", "in", "into", "is", "isn't", "it", 
        "it's", "its", "itself", "let's", "me", "more", "most", "mustn't", "my", "myself", "no", "nor", "not", "of", "off", "on", "once", 
        "only", "or", "other", "ought", "our", "ours ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll", "she's", 
        "should", "shouldn't", "so", "some", "such", "than", "that", "that's", "the", "their", "theirs", "them", "themselves", "then", "there", 
        "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", "under", "until", "up", 
        "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were", "weren't", "what", "what's", "when", "when's", "where", 
        "where's", "which", "while", "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't", "you", "you'd", "you'll", 
        "you're", "you've", "your", "yours", "yourself", "yourselves"};

        ArrayList<String> wordList = new ArrayList<String>();
        String[] wordArray=  this.text.split(" ");
        for(int i = 0; i < wordArray.length; i++) {
            boolean isStopWord = false;
            String word = wordArray[i];
            for(int j = 0; j < stopwords.length; j++) {
                if(word.equals(stopwords[j])) {
                    isStopWord = true;
                    break;
                }
            }
            if(isStopWord == false) {
                wordList.add(word);
            }
        }
        return wordList;
    }



    
    public static Sentence convertLine(String line){
        // we need to remove the peroid and process the date.
        // we can use the replaceall() api to remomve the peroids.

        String[] strArray = line.split("\",\"");

        // remove all punctuation
        String author = strArray[strArray.length - 2];
        String text = strArray[strArray.length - 1];
        text = text.replaceAll(",", "");
        text = text.replaceAll("\\.", "");
        text = text.replaceAll("'", "");
        text = text.replaceAll(":", "");
        text = text.replaceAll("@", "");
        text = text.replaceAll("\\)", "");
        text = text.replaceAll("\"", "");

        // process the date
        String stamp = strArray[2];
        String [] sArray = stamp.split(" ");
        stamp = sArray[1] +" "+ sArray[2] +" "+sArray[sArray.length-1];
    
        // create new object
        Sentence newSentence = new Sentence(text, author, stamp);

        return newSentence;

    }

   
    
}
