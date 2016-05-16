package com.sokolov.words.frames.dictionary.load;

import com.sokolov.words.model.DictionaryHolder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadPathListener implements ActionListener {

    private JTextField jTextField;

    public ReadPathListener(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent e) {

        String path = jTextField.getText();

        DictionaryHolder.reloadDictionaryFromFile(path);

        JOptionPane.showMessageDialog(
                null,
                "словарь загрузился",
                "",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
