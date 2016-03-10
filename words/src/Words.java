import java.util.ArrayList;
import java.util.Random;

public class Words {
    private Word[] words;
    private int index;

    public Words(boolean onRussian) {
        words = new Word[]{
                new Word("мир", "world", onRussian),
                new Word("привет", "hello", onRussian),
                new Word("кто", "who", onRussian),
                new Word("что", "what", onRussian),
                new Word("мед", "honey", onRussian)};
    }

    public void displayNext() {
        index = (index == words.length - 1) ? 0 : index + 1;
        words[index].displayWords();
    }

    public void displayPrev() {
        index = (index == 0) ? words.length - 1 : index - 1;
        words[index].displayWords();
    }

    public void displayRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        words[randomIndex].displayWords();
    }

    public void displayRandomNotPopular() {
        int lenght = quantityNotPopularWords();
        Word[] notPopularWords = new Word[lenght];
        int minQuantityDisplays = minQuantityDisplays();
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].getQuantityDisplay() == minQuantityDisplays) {
                notPopularWords[j] = words[i];
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(notPopularWords.length);
        notPopularWords[randomIndex].displayWords();
    }

    private int quantityNotPopularWords() {
        int quantity = 0;
        int minQuantityDisplays = minQuantityDisplays();
        for (int i = 0; i < words.length; i++) {
            if (words[i].getQuantityDisplay() == minQuantityDisplays) {
                quantity++;
            }
        }
        return quantity;
    }

    private int minQuantityDisplays() {
        int minQuantityDisplays = words[0].getQuantityDisplay();
        for (int i = 1; i < words.length; i++) {
            if (words[i].getQuantityDisplay() < minQuantityDisplays) {
                minQuantityDisplays = words[i].getQuantityDisplay();
            }
        }
        return minQuantityDisplays;
    }

    public void print() {
        for (int i = 0; i < words.length; i++) {
            System.out.print(i + ": ");
            words[i].println();
        }
    }
    public void addition(){//увеличение массива
        ArrayList<String> addWord = new ArrayList<String>();
        addWord.add(0,"путь");
        System.out.println(addWord.get(1));
        addWord.set(0,"путь");


    }

}
