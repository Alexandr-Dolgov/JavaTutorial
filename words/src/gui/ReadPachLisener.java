package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AK on 21.04.2016.
 */
public class ReadPachLisener implements ActionListener {

    JTextField jTextField;
    Dictionary dictionary;

    public ReadPachLisener(JTextField jTextField){
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent e) {

        String pach = jTextField.getText();


        Dictionary d = Dictionary.smartReadFromFile(pach);


        LoadDictionaryFrame myLoadDictionaryFrame = new LoadDictionaryFrame();
//        dictionary

//        String patch = LoadDictionaryFrame.displayPath;
//        System.out.println(patch);

    }
}
