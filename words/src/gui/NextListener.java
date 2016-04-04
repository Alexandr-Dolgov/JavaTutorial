package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextListener implements ActionListener {

    private Dictionary dictionary;
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public NextListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3){
        this.dictionary = dictionary;
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word nextWord = dictionary.getNextWord();
        labelRus.setText(nextWord.getEnglish());
        labelEng.setText(nextWord.getRussian());
        labelQuantity.setText("" + nextWord.getQuantityDisplay());
    }
}
