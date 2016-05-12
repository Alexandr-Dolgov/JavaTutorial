package com.sokolov.words.frames.appgui;

import com.sokolov.words.frames.dictionary.change.ChangeDictionaryFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeDictionaryListener implements ActionListener {

//    public JFrame frame;//описываем поле у ChangeDictionaryListener есть поле frame

//    public ChangeDictionaryListener(JFrame frame){//должна при. ссылка на объект типа JFrame
//        this.frame = frame;
//    }

    private AppGuiFrame appGuiFrame;

    public ChangeDictionaryListener(AppGuiFrame appGuiFrame) {
        this.appGuiFrame = appGuiFrame;
    }

    public void actionPerformed(ActionEvent e) {
        new ChangeDictionaryFrame(appGuiFrame);
//        frame.setVisible(true);
    }
}


