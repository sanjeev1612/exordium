import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilefromScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("demo.txt"));
        while (sc.hasNextLine()) {
            String fileValue = sc.nextLine();
            System.out.println("File read from Scanner ====>   " + fileValue);
        }
        sc.close();

    }
}
