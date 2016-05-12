package com.sokolov.words.frames.appgui;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.DictionaryHolder;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomListener implements ActionListener{
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public RandomListener(JLabel l1, JLabel l2, JLabel l3){

        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e){
        Word randomWord = DictionaryHolder.getInstance().getDictionary().getRandomWord();

        labelRus.setText(randomWord.getRussian());
        labelEng.setText(randomWord.getEnglish());
        labelQuantity.setText("" + randomWord.getQuantityDisplay());
    }

}
