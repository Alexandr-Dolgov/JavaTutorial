package com.sokolov.words;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteWordListener implements ActionListener{

    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public DeleteWordListener(AppGuiFrame appGuiFrame){
        labelRus = appGuiFrame.getLabelRus();
        labelEng = appGuiFrame.getLabelEng();
        labelQuantity = appGuiFrame.getLabelQuantity();
    }

    public void actionPerformed(ActionEvent e){
        Dictionary dictionary = AppGui.getInstance().getDictionary();

        Word firstWord = dictionary.getFirst();
        dictionary.deleteWord(0);

        Word nextWord = dictionary.getNextWord();
        labelRus.setText(nextWord.getEnglish());
        labelEng.setText(nextWord.getRussian());
        labelQuantity.setText("" + nextWord.getQuantityDisplay());

        JOptionPane.showMessageDialog(
                null,
                "Слово [" + firstWord.toString() + "] удалено",
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
