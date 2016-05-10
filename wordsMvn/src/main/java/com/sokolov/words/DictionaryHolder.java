package com.sokolov.words;

import com.sokolov.words.model.Dictionary;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Класс держатель(хранитель) словаря. Singleton.
 */
public class DictionaryHolder {

    private Dictionary dictionary;

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    private static DictionaryHolder instance;
    private DictionaryHolder () {}

    public static DictionaryHolder getInstance() {
        if (instance == null) {
            instance = new DictionaryHolder();
        }
        return instance;
    }

    public static void reloadDictionaryFromFile(String path) {
        Dictionary dictionary = null;
        try {
            dictionary = Dictionary.smartReadFromFile(path);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "не удается найти файл '" + path + "'",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Произошла ошибка при чтении словаря из файла '" + path + "'. " + e,
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        getInstance().setDictionary(dictionary);
    }
}
