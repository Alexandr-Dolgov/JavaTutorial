package com.sokolov.words;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.*;


public class AppGuiFrame extends JFrame {

    private JLabel labelRus;
    private JLabel labelEng;
    private JLabel labelQuantity;

    public JLabel getLabelRus() {
        return labelRus;
    }

    public JLabel getLabelEng() {
        return labelEng;
    }

    public JLabel getLabelQuantity() {
        return labelQuantity;
    }

    public AppGuiFrame(){
        //super();

//        Dictionary words = new Dictionary(false);
        //words.deleteWord(4);

        Dictionary words = Dictionary.smartReadFromFile("dic");
        AppGui.getInstance().setDictionary(words);

        //тестовый код, удалить после проверки
//        Dictionary wordsTest = Dictionary.readFromFile("words\\src\\gui\\dictionary.txt");
//        Dictionary dic = Dictionary.readFromFile("dictionary.txt");

//        JFrame frame = new JFrame();
        setTitle("words");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setSize(400, 200);

//        JFrame frameChangeDictionary = new JFrame();
//        frameChangeDictionary.setTitle("change dictionary");
//        frameChangeDictionary.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frameChangeDictionary.setSize(600, 200);


//        JPanel panelChangeDictionari = new JPanel();

        JButton buttonNext = new JButton("next");
        JButton buttonPrev = new JButton("prev");
        JButton buttonRandom = new JButton("random");
        JButton buttonFirst = new JButton("first");
        JButton buttonLast = new JButton("last");
        JButton buttonChangeDictionary = new JButton("change Dictionary");

        Word firstWord = words.getFirst();
        labelRus = new JLabel(firstWord.getEnglish());
        labelEng = new JLabel(firstWord.getRussian());
        labelQuantity = new JLabel("" + firstWord.getQuantityDisplay());

        NextListener myNextListener = new NextListener(words, labelRus, labelEng, labelQuantity);
        buttonNext.addActionListener(myNextListener);

        PrevListener myPrevListener = new PrevListener(words, labelRus, labelEng, labelQuantity);
        buttonPrev.addActionListener(myPrevListener);

        RandomListener myRandomListener = new RandomListener(words, labelRus, labelEng, labelQuantity);
        buttonRandom.addActionListener(myRandomListener);

        FirstListener myFirstListener = new FirstListener(words, labelEng, labelRus, labelQuantity);
        buttonFirst.addActionListener(myFirstListener);

        LastListener myLastListener = new LastListener(words, labelEng, labelRus, labelQuantity);
        buttonLast.addActionListener(myLastListener);

        ChangeDictionaryListener myChangeDictionaryListener = new ChangeDictionaryListener(this);
        buttonChangeDictionary.addActionListener(myChangeDictionaryListener);

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(labelRus);
        labelsPanel.add(labelEng);
        labelsPanel.add(labelQuantity);

        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.add(labelsPanel);

        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(buttonChangeDictionary);
        southPanel.add(buttonRandom);

        JPanel westPanel = new JPanel(new GridLayout(2, 1));
        westPanel.add(buttonPrev);
        westPanel.add(buttonFirst);

        JPanel eastPanel = new JPanel(new GridLayout(2, 1));
        eastPanel.add(buttonNext);
        eastPanel.add(buttonLast);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);
//        frameChangeDictionary.add(panelChangeDictionari);
        pack();

        setVisible(true);
    }
}
