public class App {

    public static void main(String[] args) {
        Word[] words = initialization();

        int[] a = {1,2,3};

    }

    static Word[] initialization() {
        Word[] words = {
                new Word("мир", "world", true),
                new Word("привет", "hello", false)
        };
        return words;
    }

}
