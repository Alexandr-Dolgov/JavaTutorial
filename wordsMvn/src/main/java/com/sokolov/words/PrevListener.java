package com.sokolov.words;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrevListener implements ActionListener {

    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public PrevListener(JLabel l1, JLabel l2, JLabel l3) {

        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {

        Word prevWord = DictionaryHolder.getInstance().getDictionary().getPrevWord();

        labelRus.setText(prevWord.getEnglish());
        labelEng.setText(prevWord.getRussian());
        labelQuantity.setText("" + prevWord.getQuantityDisplay());
    }
}
