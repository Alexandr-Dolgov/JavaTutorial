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

        File f1 = new File("C:\\Data\\Develop\\Students\\30_KirillSokolov\\JavaTutorial\\17file\\src\\t\\t.txt");
        File f2 = new File("tmp.txt");

        // io = input output

        FileReader fr = new FileReader(f1);

        String rus, eng;
        String s = "";
        int c = fr.read();
        int i = 0;
        int commaIndex = 0;
        while (c != -1) {   //когда fr.read() возвращает -1 значит файл закончился
            char ch = (char) c;
            if (ch == ',') {
                commaIndex = i;
            }
            if (ch == '\r') {
                rus = s.substring(0, commaIndex);
                eng = s.substring(commaIndex + 1, i);
                //word = new Word(rus, eng, false)
                //dictionary.addWord(new Word(rus, eng, false))
                s = "";
            }
            s = s + ch;
            c = fr.read(); //считываем код символы
            i++;
        }

        System.out.println("\ntest");

        //привет,hello,eng
    }

}
