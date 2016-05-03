package com.sokolov.words;

import com.sokolov.words.model.Dictionary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadPachLisener implements ActionListener {

    JTextField jTextField;
    Dictionary dictionary;

    public ReadPachLisener(JTextField jTextField){
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent e) {

        String pach = jTextField.getText();


        //Dictionary d = Dictionary.smartReadFromFile(pach);


        LoadDictionaryFrame myLoadDictionaryFrame = new LoadDictionaryFrame();
//        dictionary

//        String patch = LoadDictionaryFrame.displayPath;
//        System.out.println(patch);

    }
}
