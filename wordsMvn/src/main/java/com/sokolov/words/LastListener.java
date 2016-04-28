package com.sokolov.words;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LastListener implements ActionListener {
    private Dictionary dictionary;
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public LastListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3) {
        this.dictionary = dictionary;
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word lastWord = dictionary.getLast();
        labelRus.setText(lastWord.getEnglish());
        labelEng.setText(lastWord.getRussian());
        labelQuantity.setText("" + lastWord.getQuantityDisplay());
    }
}
