package gui;

import javax.swing.*;
import java.awt.*;

public class ChangeDictionaryFrame extends JFrame {

    public ChangeDictionaryFrame() {

        super();

        setTitle("chande dictionary");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 200);

        JButton buttonAddWord = new JButton("add word");
        JButton buttonDeleteWord = new JButton("delete word");
        JButton buttonLoadDictionary = new JButton("load dictionary");

        LoadDictionaryListener LoadDictionaryListener = new LoadDictionaryListener();
        buttonLoadDictionary.addActionListener(LoadDictionaryListener);

        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(buttonAddWord);
        panelNorth.add(buttonDeleteWord);

        JPanel panelCenter = new JPanel(new FlowLayout());
        panelCenter.add(buttonLoadDictionary);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);

        System.out.println("end chande dictionary");
    }
}
