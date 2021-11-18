import java.util.*;
import java.io.*;

public class Driver{
    

    public static String[] removeQuotation(String[] strArray) {
        for(int i = 0; i < strArray.length; i++) {
            String newStr = "";
            for(int j = 0; j < strArray[i].length(); j++){
                if(strArray[i].charAt(j) != '"') {
                    newStr += strArray[i].charAt(j);
                }
            }
            strArray[i] = newStr;
        }
        return strArray;
    }
    public static void main(String[] args) {



        // Scanner and try except courtesy of Baeldung and W3School
        try (Scanner scanner = new Scanner(new File("testdata.csv"));) {
            while (scanner.hasNextLine()) {
                String myLine = scanner.nextLine();
                String[] strArray = myLine.split("\",\"");
                removeQuotation(strArray);
                System.out.println(Arrays.toString(strArray));
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}