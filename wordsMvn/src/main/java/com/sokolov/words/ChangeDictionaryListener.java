package com.sokolov.words;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeDictionaryListener implements ActionListener {

//    public JFrame frame;//описываем поле у ChangeDictionaryListener есть поле frame

//    public ChangeDictionaryListener(JFrame frame){//должна при. ссылка на объект типа JFrame
//        this.frame = frame;
//    }

    public void actionPerformed(ActionEvent e) {
        new ChangeDictionaryFrame();
//        frame.setVisible(true);
    }
}


