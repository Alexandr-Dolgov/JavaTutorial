package AppWord;

import java.util.Random;

public class Words {

    private Word[] words;
    private int index;

    public Words() {
        words = new Word[]{
                new Word("привет"),
                new Word("пока"),
                new Word("объект"),
                new Word("экземпляр"),
                new Word("класс")
        };
    }

    public void displayNext() {
        index = (index == words.length - 1) ? 0 : index + 1;
        words[index].display();
    }

    public void displayPrev() {
        index = (index == 0) ? words.length - 1 : index - 1;
        words[index].display();
    }

    public void displayRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        words[randomIndex].display();//записывает в случайный индекс
    }

    public void displayRandomNotPopular() {//найти наименьшее количество показов
        int length = quantityNotPopularWords();
        Word[] notPopularWords = new Word[length];//создаем массив непопулярных слов
        int minQuantityDisplays = minQuantityDisplays();
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].getQuantityDisplays() == minQuantityDisplays) {
                notPopularWords[j] = words[i];
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(notPopularWords.length);
        notPopularWords[randomIndex].display();
    }

    private int quantityNotPopularWords() {
        int quantity = 0;
        int minQuantityDisplays = minQuantityDisplays();
        for (int i = 0; i < words.length; i++) {
            if (words[0].getQuantityDisplays() == minQuantityDisplays) {
                quantity++;
            }
        }
        return quantity;
    }

    private int minQuantityDisplays() {//возвращает минимальное количество показов
        int minQuantityDisplays = words[0].getQuantityDisplays();
        for (int i = 0; i < words.length; i++) {
            if (minQuantityDisplays < words[i].getQuantityDisplays()) {
                minQuantityDisplays = words[i].getQuantityDisplays();
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
}
