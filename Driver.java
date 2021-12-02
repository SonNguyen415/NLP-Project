import java.util.*;
import java.io.*;



public class Driver{

    static ArrayList<Sentence> sentenceList = new ArrayList<Sentence>();
    
    public static void main(String[] args) {

        

        // Scanner and try except courtesy of Baeldung and W3School
        // read through the csv file and add new sentences to an array list 
        try (Scanner scanner = new Scanner(new File("testdata.csv"));) {
            while (scanner.hasNextLine()) {
                String myLine = scanner.nextLine();
                Sentence newSentence = Sentence.convertLine(myLine);
                sentenceList.add(newSentence);
                System.out.println(newSentence);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}