package com.sokolov.words;

import javax.swing.*;
import java.awt.*;

public class ChangeDictionaryFrame extends JFrame {

    public ChangeDictionaryFrame() {
        super();

        setTitle("change dictionary");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton buttonAddWord = new JButton("add word");
        JButton buttonDeleteWord = new JButton("delete word");

        JButton buttonLoadDictionary = new JButton("load dictionary");
        buttonLoadDictionary.addActionListener(new LoadDictionaryListener());

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
