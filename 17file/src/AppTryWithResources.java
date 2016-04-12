import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppTryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("tmp.txt"))) {
            String s = br.readLine();
            while (s != null) {
                //здесь разбираем s на части, из которых составляем то что нам нужно

                s = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("my message");
    }
}
