import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("tmp.txt"))) {
            String s = scanner.next();



            System.out.println(s);
            s = scanner.next();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("my message");
    }
}
