package com.sokolov.words.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Dictionary {

    private Word[] words;
    private int index;

    public Dictionary(boolean onRussian) {
        words = new Word[]{
                new Word("мир", "world", onRussian),
                new Word("привет", "hello", onRussian),
                new Word("кто", "who", onRussian),
                new Word("что", "what", onRussian),
                new Word("мед", "honey", onRussian)};
    }

    private Dictionary() {
        words = new Word[0];
    }

    public Word getFirst() {
        words[0].incrementQuantityDisplay();
        return words[0];
    }

    public Word getLast() {
        words[words.length - 1].incrementQuantityDisplay();
        return words[words.length-1];
    }

    public Word getNextWord() {
        index = (index == words.length - 1) ? 0 : index + 1;
        words[index].incrementQuantityDisplay();
        return words[index];
    }

    public Word getPrevWord() {
        index = (index == 0) ? words.length - 1 : index - 1;
        words[index].incrementQuantityDisplay();
        return words[index];
    }

    public Word getRandomWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        words[randomIndex].incrementQuantityDisplay();
        return words[randomIndex];
    }

    public void deleteWord(int index) {
        Word[] deleteWords = new Word[words.length - 1];
        for (int i = 0; i < words.length; i++) {
            if (i < index) {
                deleteWords[i] = words[i];
            } else if (i > index) {
                deleteWords[i - 1] = words[i];
            }
        }
        words = deleteWords;
    }



    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < words.length; i++) {
            s = s + ", [" + words[i] + "]";
        }
        return "" + words.length + " " + s;
    }

    public static Dictionary readFromFile(String pathName) throws Exception {

        Dictionary dictionary = new Dictionary();

        File f1 = new File(pathName);

        FileReader fr = new FileReader(f1);


        String rus = null;
        String eng = null;

        String s = "";
        int c = fr.read();
        int i = 0;
        int commaIndex = 0;

        while (c != -1) {
            char ch = (char) c;
            if (ch == ',') {
                commaIndex = i;
            }
            if (ch == '\r') {
                rus = s.substring(0, commaIndex);
                eng = s.substring(commaIndex + 1, i);
                s = "";
                dictionary.addWord(rus, eng, true);
            }
            s = s + ch;
            c = fr.read();
            i++;
        }
        System.out.println("\ntest");
//        Word word1 = new Word();


        return dictionary;
    }

    public static Dictionary smartReadFromFile(String pathName) throws IOException {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(new FileReader(pathName));
        while (scanner.hasNext()) {
            String rus = scanner.next();
            String eng = scanner.next();
            dictionary.addWord(rus, eng, false);
        }
        return dictionary;
    }

    public void writeToFile(String pathName) throws IOException {
        try (FileWriter writer = new FileWriter(pathName)) { //try with resources
            //for each
            for (Word word: words) {
                writer.write("" + word.getEnglish() + " " + word.getRussian() + "\n");
            }
        }
    }


    public void addWord(String rus, String eng, boolean onRus) {
        Word[] newWords = new Word[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i];
        }
        Word newWord = new Word(rus, eng, onRus);
        newWords[words.length] = newWord;
        words = newWords;
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

}
