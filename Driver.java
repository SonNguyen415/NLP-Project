import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver{
    

    public static void main(String[] args) {

        // Code section courtesy of Baeldung and W3School
        try (Scanner scanner = new Scanner(new File("testdata.csv"));) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}