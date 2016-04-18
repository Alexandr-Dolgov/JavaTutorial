package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AK on 17.04.2016.
 */
public class AddWordListener implements ActionListener {
    private Dictionary dictionary;
    private JLabel labelEng;
    private JLabel labelRus;
    private JLabel labelQuantity;

    public AddWordListener(Dictionary dictionary, JLabel l1, JLabel l2, JLabel l3){
        this.dictionary = dictionary;
        labelEng = l1;
        labelRus = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e){

    }
}
