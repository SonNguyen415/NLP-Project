import java.util.Scanner;
import java.io.File;


public class Driver{
    

    public static void main(String[] args) {

        // Code section courtesy of Baeldung 
        try (Scanner scanner = new Scanner(new File("testdata.csv"));) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(Exception fileNotFoundException) {
            System.out.println("File not found");
        }
    }

}