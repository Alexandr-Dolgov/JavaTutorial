package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteWordListener implements ActionListener{

    private Dictionary dictionary;
    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public DeleteWordListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3){
        this.dictionary = dictionary;
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;

    }

    public void actionPerformed(ActionEvent e){
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
