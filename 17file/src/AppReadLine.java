import java.io.*;

public class AppReadLine {
    public static void main(String[] args) {
        File f = new File("tmp.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s = br.readLine();
            System.out.println(s);
            s = br.readLine();
            System.out.println(s);
            s = br.readLine();
            System.out.println(s);
            s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ignore) {
            }
        }
        System.out.println("my message");
    }

}
