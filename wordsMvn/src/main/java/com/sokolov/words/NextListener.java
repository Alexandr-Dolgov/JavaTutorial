package com.sokolov.words;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextListener implements ActionListener {

    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public NextListener(JLabel l1, JLabel l2, JLabel l3){
        labelRus = l1;
        labelEng = l2;
        labelQuantity = l3;
    }

    public void actionPerformed(ActionEvent e) {

//    вызов метода getNextWord() из класса Dictionary используя переменную dictionary
//    и передача ссылки в переменную nextWord типа Wor

//      DictionaryHolder.getInstance() получили объект синглтон
//      у объекта вызвали метод getDictionary() достали словарь
//      из словаря достали первое слово

        Word nextWord = DictionaryHolder.getInstance().getDictionary().getNextWord();

//        используя переменную labelRus типа JLabel вызоваем метод setText класса JLabel из пакета javax.swing
//        в который передается в виде аргумента значение,
//        которое возвращается при вызове метода getEnglish
//        не записываем в переменную, т.к. испотльзуем один раз
        labelRus.setText(nextWord.getEnglish());
        labelEng.setText(nextWord.getRussian());
        labelQuantity.setText("" + nextWord.getQuantityDisplay());
    }
}
