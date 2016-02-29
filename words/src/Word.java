public class Word {

    private String russian;
    private String english;
    boolean onRussian;
    private String word;
    private int quantityDisplay;

//    public Word(String english){
//        this.english = english;
//    }

    public Word(String rus, String eng, boolean onRus) {
        russian = rus;
        english = eng;
        onRussian = onRus;
    }

    public void displayEn() {
        System.out.println(english);
        quantityDisplay++;
    }

    public void displayRus() {
        System.out.println(russian);


    }

    public void println() {
        System.out.println(english + " " + quantityDisplay);}//// TODO: 29.02.2016 статистика ru


}
