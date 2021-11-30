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
        return "author:" + author +" "+ "text:"+ text+" "+ "timestamp:"+ timestamp;

        
    }
     
    
    public static Sentence convertLine(String line){
        // we need to remove the peroid and process the date.
        // we can use the replaceall() api to remomve the peroids.

        

        String[] strArray = line.split("\",\"");

        String a = strArray[strArray.length - 2];
        String t = strArray[strArray.length - 1];
        t = t.replaceAll(",", "");
        t = t.replaceAll("\\.", "");
        t = t.replaceAll("'", "");
        t = t.replaceAll(":", "");
        t = t.replaceAll("@", "");
        t = t.replaceAll("\\)", "");
        t = t.replaceAll("\"", "");

        String stamp = strArray[2];
        String [] sArray = stamp.split(" ");
        stamp = sArray[1] +" "+ sArray[2] +" "+sArray[sArray.length-1];
    
        Sentence var_name = new Sentence(t, a, stamp);
        System.out.println(var_name.toString());

        return var_name;
        
        
    }
    
}
