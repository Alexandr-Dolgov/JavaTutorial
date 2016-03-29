import java.io.File;
import java.io.FileReader;

public class AppFile {

    public static void main(String[] args) throws Exception {
        /*
        for (char c = 0xA000; c < 0xB000; c++) {
            int i = (int) c;
            System.out.println(i);
            System.out.println(c);
        }
        */

        File f = new File("tmp.txt");

        FileReader fr = new FileReader(f);

        int i = fr.read();
        char c = (char) i;
        i = fr.read();

        c = (char) fr.read();
        System.out.println(c);

        System.out.println("test");
    }

}
