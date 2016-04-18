package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeDictionaryListener implements ActionListener {

    public JFrame frame;//описываем поле у ChangeDictionaryListener есть поле frame

    public ChangeDictionaryListener(JFrame frame){//должна при. ссылка на объект типа JFrame
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        frame.setVisible(true);

        JFrame frame = new JFrame();

        frame.setTitle("chande dictionary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);

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

        frame.add(mainPanel);
        frame.setVisible(true);

        System.out.println("end");
    }
}


