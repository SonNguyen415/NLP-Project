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
        String [] part1 = line.split(",", 4);
        String [] part2 = line.split(",", 5);
        String [] part3 = line.split(",", 2);

        String a = part1[4];
        String t = part2[5];
        String stamp = part3[2];

        Sentence var_name = new Sentence(t, a, stamp);

        return var_name;
        

    }
    
}
