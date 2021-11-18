public class Sentence {

    // needs to be in a constructor

    public String text;
    public String author;
    public String timestamp;


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
        return author +" "+ text+" "+ timestamp;
    }
    
}
