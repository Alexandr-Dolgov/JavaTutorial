
public class Word {

    private String russian;
    private String english;
    boolean onRussian;
    private int quantityDisplay = 0;

    public Word(String rus, String eng, boolean onRus) {//конструктор вызывается только один раз при зоздании класса
        // называется так же как класс и ничего не возвращает
        //задает начальное значение атрибута english
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
        //if (onRussian) {
//            System.out.println(english + " " + quantityDisplay);
        //}
//        else System.out.println(russian + " " + quantityDisplay);

    }
}
