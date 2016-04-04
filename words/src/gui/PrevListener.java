package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrevListener implements ActionListener{

    private Dictionary dictionary;
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public PrevListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3){
        this.dictionary = dictionary;
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {
        Word prevWord = dictionary.getPrevWord();
        labelRus.setText(prevWord.getEnglish());
        labelEng.setText(prevWord.getRussian());
        labelQuantity.setText("" + prevWord.getQuantityDisplay());
    }
}
