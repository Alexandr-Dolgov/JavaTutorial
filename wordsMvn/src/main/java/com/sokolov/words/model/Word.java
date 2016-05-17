package com.sokolov.words.model;

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
        return russian + ", " + english + ", " + ((onRussian) ? "rus" : "eng") + ", " +  quantityDisplay;
    }

    public String getRussian() {
        return russian;
    }

    public String getEnglish() { return english; }

    public void incrementQuantityDisplay() {
        quantityDisplay++;
    }


    @Override
    public boolean equals(Object anObject) {
        if (this == anObject){
            return true;
        }
        if (anObject instanceof Word){
            Word anotherWord = (Word)anObject;
            return english.equals(anotherWord.english) && russian.equals(anotherWord.russian);
        }
        return false;
    }

}
