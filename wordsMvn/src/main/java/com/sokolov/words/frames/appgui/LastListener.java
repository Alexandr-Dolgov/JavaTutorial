package com.sokolov.words.frames.appgui;

import com.sokolov.words.model.DictionaryHolder;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastListener implements ActionListener {

    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public LastListener(JLabel l1, JLabel l2, JLabel l3) {
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word lastWord = DictionaryHolder.getInstance().getDictionary().getLast();

        labelRus.setText(lastWord.getEnglish());
        labelEng.setText(lastWord.getRussian());
        labelQuantity.setText("" + lastWord.getQuantityDisplay());
    }
}
