public class ExtractTest {

public static void main(String[] args){
    String testinput = "\"4\",\"7\",\"Mon May 11 03:21:41 UTC 2009\",\"kindle2\",\"yamarama\",\"@mikefish  Fair, enough. But i have the Kindle2 and I think it's perfect  :)\"";
    String result = "mikefish  Fair enough But i have the Kindle2 and I think its perfect  ";
    Sentence s = Sentence.convertLine(testinput);
    System.out.println(s.getText());
    System.out.println(s.getText().equals(result));


    String result2 = "May 11 2009";
    System.out.println(s.getTimestamp());
    System.out.println(s.getTimestamp().equals(result2));
}

}
