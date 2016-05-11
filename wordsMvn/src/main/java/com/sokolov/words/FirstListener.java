package com.sokolov.words;

import com.sokolov.words.model.DictionaryHolder;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener {


    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public FirstListener(JLabel l1, JLabel l2, JLabel l3) {
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {

        Word firstWord = DictionaryHolder.getInstance().getDictionary().getFirst();

        labelRus.setText(firstWord.getEnglish());
        labelEng.setText(firstWord.getRussian());
        labelQuantity.setText("" + firstWord.getQuantityDisplay());
    }
}
