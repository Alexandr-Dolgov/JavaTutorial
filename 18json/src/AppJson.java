import com.google.gson.JsonElement;

import java.io.FileReader;

public class AppJson {
    public static void main(String[] args) throws Exception {
        JsonElement el = new com.google.gson.JsonParser().parse(new FileReader("dic-json"));
        System.out.println("end");
    }
}
