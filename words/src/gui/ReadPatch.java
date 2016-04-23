package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AK on 21.04.2016.
 */
public class ReadPatch implements ActionListener {

       JTextField jTextField;

    public void actionPerformed(ActionEvent e){
        String s = jTextField.getText();
        LoadDictionaryFrame myLoadDictionaryFrame = new LoadDictionaryFrame();

//        String patch = LoadDictionaryFrame.displayPath;
//        System.out.println(patch);

    }
}
