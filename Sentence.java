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
        String[] strArray = line.split("\",\"");

        String a = strArray[4];
        String t = strArray[5];
        String stamp = strArray[2];
       
        Sentence var_name = new Sentence(t, a, stamp);
        System.out.println(var_name.toString());

        return var_name;
        

    }
    
}
