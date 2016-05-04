package com.sokolov.words;

import com.sokolov.words.model.Dictionary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadPathListener implements ActionListener {

    JTextField jTextField;
    Dictionary dictionary;

    public ReadPathListener(JTextField jTextField){
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent e) {

        String path = jTextField.getText();


        //Dictionary d = Dictionary.smartReadFromFile(path);


        LoadDictionaryFrame myLoadDictionaryFrame = new LoadDictionaryFrame();
//        dictionary

//        String patch = LoadDictionaryFrame.displayPath;
//        System.out.println(patch);

    }
}
