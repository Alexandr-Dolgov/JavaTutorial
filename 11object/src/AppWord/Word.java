package AppWord;

public class Word {

    private String word;
    private int quantityDisplays = 0;

    public Word(String word) {
        this.word = word;
    }

    public void display() {
        System.out.println(word);
        quantityDisplays++;
    }

    public int getQuantityDisplays() {//возвращает количество показов
        return quantityDisplays;
    }

    public void println() {
        System.out.println(word + " " + quantityDisplays);
    }

}
