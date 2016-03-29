package gui;

public class Word {

    private String russian;
    private String english;
    boolean onRussian;
    private int quantityDisplay = 0;
    private int incrementQuantityDisplay = 0;

    public Word(String rus, String eng, boolean onRus) {
        russian = rus;
        english = eng;
        onRussian = onRus;
    }

    public void displayWords() {
        System.out.println((onRussian) ? russian : english);
        quantityDisplay++;
    }

    public int getQuantityDisplay() {
        return quantityDisplay;
    }

    public void println() {
        System.out.println((onRussian) ? russian : english + " " + quantityDisplay);
    }

    @Override
    public String toString() {
        return (onRussian) ? russian : english + " " + quantityDisplay;
    }

    public String getRussian() {
        return russian;
    }

    public String getEnglish() {
        return english;
    }

    public void incrementQuantityDisplay() {
        incrementQuantityDisplay++;
    }

    public int getIncrementQuantityDisplay() {
        return incrementQuantityDisplay;
    }
}
