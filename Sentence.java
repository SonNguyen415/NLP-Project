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

    // public Sentence convertLine(String line){
    //     String [] part1 = line.split(",", 4);
    //     String [] part2 = line.split(",", 5);
    //     String [] part3 = line.split(",", 2);
    //     author = part1[4];
    //     text = part2[5];
    //     timestamp = part3[2];
        
    // }
    
}
