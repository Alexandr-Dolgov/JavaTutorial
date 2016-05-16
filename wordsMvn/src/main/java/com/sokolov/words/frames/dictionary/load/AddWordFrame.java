package com.sokolov.words.frames.dictionary.load;

import javax.swing.*;
import java.awt.*;

public class AddWordFrame extends JFrame {
    public AddWordFrame() {
        super();
        setTitle("add word");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        int columns = 15;
        JTextField fieldEng = new JTextField(columns);
        JTextField fieldRus = new JTextField(columns);

        JPanel panelEast = new JPanel(new GridLayout(2, 1, 5, 5));
        panelEast.add(fieldEng);
        panelEast.add(fieldRus);

        JLabel labelEng = new JLabel("eng      ");
        JLabel labelRus = new JLabel("rus      ");

        JPanel panelWest = new JPanel(new GridLayout(2, 1, 5, 5));
        panelWest.add(labelEng);
        panelWest.add(labelRus);

        JButton buttonAddWord = new JButton("add word");

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelEast, BorderLayout.EAST);
        mainPanel.add(panelWest, BorderLayout.WEST);
        mainPanel.add(buttonAddWord, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setVisible(true);

    }
}
