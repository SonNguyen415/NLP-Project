<<<<<<< HEAD

=======
import java.util.*;
>>>>>>> 3cb02104edda21e276c2684cf79eea05b43bda69

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
        ArrayList<String> wordList = new ArrayList<String>();
        String[] wordArray=  this.text.split(" ");
        for(int i = 0; i < wordArray.length; i++) {
            wordList.add(wordArray[i]);
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
