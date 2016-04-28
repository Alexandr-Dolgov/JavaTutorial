package com.sokolov.words;

import com.sokolov.words.model.Dictionary;

public class AppGui {

    private Dictionary dictionary;

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public static void main(String[] args) throws Exception {
        new AppGuiFrame();
    }

    private static AppGui instance;
    private AppGui () {}

    public static AppGui getInstance() {
        if (instance == null) {
            instance = new AppGui();
        }
        return instance;
    }
}
