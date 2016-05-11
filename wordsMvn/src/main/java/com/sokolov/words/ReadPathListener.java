package com.sokolov.words;

import com.sokolov.words.model.DictionaryHolder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadPathListener implements ActionListener  {

    private JTextField jTextField;

    public ReadPathListener(JTextField jTextField){
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent e) {

        String path = jTextField.getText();

        DictionaryHolder.reloadDictionaryFromFile(path);

        /*в фрейме LoadDictionaryFrame пользователь вводит новый путь к словарю,
        затем нажимает кнопку load path на которую навешан слушатель ReadPathListener.
        В ReadPathListener через переменную jTextField вызывая метод get.Text() считываем
        путь введенный пользователем и записываем его в переменную path
        Далее вызываем метод ReadPathListener используя переменную dictionary
         */



    }
}
