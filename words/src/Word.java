
public class Word {

    private String russian;
    private String english;
    boolean onRussian;
    private int quantityDisplay = 0;

    public Word(String rus, String eng, boolean onRus) {
        russian = rus;
        english = eng;
        onRussian = onRus;
    }

    public void displayRus() {
        System.out.println(russian);
        quantityDisplay++;
    }

    public int getQuantityDisplay() {
        return quantityDisplay;
    }

//    public void displayEng() {
//        System.out.println(english);
//        quantityDisplay++;
//    }

    public void println() {
        System.out.println(russian + " " + quantityDisplay);
    }
}
