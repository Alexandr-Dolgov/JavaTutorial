package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextListener implements ActionListener {

    private Dictionary dictionary;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public NextListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3){
        this.dictionary = dictionary;
        label1 = l1;
        label2 = l2;
        label3 = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word nextWord = dictionary.getNextWord();
        label1.setText(nextWord.getEnglish());
        label2.setText(nextWord.getRussian());
        label3.setText("" + nextWord.getQuantityDisplay());
    }
}
