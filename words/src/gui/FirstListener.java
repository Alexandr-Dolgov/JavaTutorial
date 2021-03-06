package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener {

    private Dictionary dictionary;
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public FirstListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3) {
        this.dictionary = dictionary;
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word firstWord = dictionary.getFirst();
        labelRus.setText(firstWord.getEnglish());
        labelEng.setText(firstWord.getRussian());
        labelQuantity.setText("" + firstWord.getQuantityDisplay());
    }
}
