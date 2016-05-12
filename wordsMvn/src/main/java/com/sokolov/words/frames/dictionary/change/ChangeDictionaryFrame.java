package com.sokolov.words.frames.dictionary.change;

import com.sokolov.words.frames.appgui.AppGuiFrame;
import com.sokolov.words.frames.dictionary.load.LoadDictionaryFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeDictionaryFrame extends JFrame {

    public ChangeDictionaryFrame(AppGuiFrame appGuiFrame) {
        super();

        setTitle("change dictionary");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton buttonAddWord = new JButton("add word");

        JButton buttonDeleteWord = new JButton("delete word");
        buttonDeleteWord.addActionListener(new DeleteWordListener(appGuiFrame));

        JButton buttonLoadDictionary = new JButton("load dictionary");
        buttonLoadDictionary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoadDictionaryFrame();
            }
        });

        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(buttonAddWord);
        panelNorth.add(buttonDeleteWord);

        JPanel panelCenter = new JPanel(new FlowLayout());
        panelCenter.add(buttonLoadDictionary);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);

        add(mainPanel);
        pack();
        setVisible(true);
    }
}
