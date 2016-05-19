package com.sokolov.words.frames.dictionary.load;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.DictionaryHolder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddWordFrame extends JFrame {
    public AddWordFrame() {
        super();
        setTitle("add word");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(true);

        int columns = 15;
        final JTextField fieldEng = new JTextField(columns);
        final JTextField fieldRus = new JTextField(columns);

        JPanel panelWest = new JPanel(new GridLayout(2, 1, 5, 5));
        panelWest.add(fieldEng);
        panelWest.add(fieldRus);

        final JLabel labelEng = new JLabel("eng");
        final JLabel labelRus = new JLabel("rus");

        JPanel panelEast = new JPanel(new GridLayout(2, 1, 5, 5));
        panelEast.add(labelEng);
        panelEast.add(labelRus);

        JButton buttonAddWord = new JButton("add word");
        buttonAddWord.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Dictionary dictionary = DictionaryHolder.getInstance().getDictionary();
                String wordEng = fieldEng.getText();
                String wordRus = fieldRus.getText();
                dictionary.addWord(wordRus, wordEng, false);

                setVisible(false);
                JOptionPane.showMessageDialog(
                        null,
                        "добавлено слово " + wordEng + " " + wordRus,
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }

            @Override
            public void keyPressed(KeyEvent e) {

                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    Dictionary dictionary = DictionaryHolder.getInstance().getDictionary();
                    String wordEng = fieldEng.getText();
                    String wordRus = fieldRus.getText();
                    dictionary.addWord(wordRus, wordEng, false);

                    setVisible(false);
                    JOptionPane.showMessageDialog(
                            null,
                            "добавлено слово " + wordEng + " " + wordRus,
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

//            @Override
//            public void keyReleased(KeyEvent e) {
//            }
        });

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelWest, BorderLayout.EAST);
        mainPanel.add(panelEast, BorderLayout.WEST);
        mainPanel.add(buttonAddWord, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setVisible(true);

    }
}
