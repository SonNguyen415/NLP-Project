import java.util.*;

// import javax.print.attribute.HashPrintJobAttributeSet;

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
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }

        HashMap<String ,Integer> wordctr = new HashMap<String ,Integer>();

        int ctr =1;

        for(int i = 0; i< sentenceList.size(); i++){
           Sentence sen = sentenceList.get(i); // to retrieve a sentence from the list
           ArrayList<String> words = sen.splitSentence();
           for(int j = 0; j < words.size(); j++){
               String word = words.get(j);
               if(wordctr.containsKey(word)){
                   wordctr.replace(word, ctr, ctr++);
               }else{
                   wordctr.put(word, ctr);
               }
           }   
        }




        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordctr.entrySet())
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        int maxValueLen = maxEntry.getValue().toString().length();
        ArrayList <String> results = new ArrayList<String>();
        for (Map.Entry set : wordctr.entrySet()){
            String value = set.getValue().toString();
            while(value.length() < maxValueLen)
                value = " " + value;
            results.add(value + " of " + set.getKey());
        }
        Collections.sort(results);
        Collections.reverse(results);
        for (int i = 0; i < 100; i++) {
            System.out.println(results.get(i));
        }
        System.out.println("Finished");
    }
}