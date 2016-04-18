package gui;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppGui {


    public static void main(String[] args) throws Exception {

        Dictionary words = new Dictionary(false);
        //words.deleteWord(4);

        Dictionary d = Dictionary.smartReadFromFile("dic");

        //тестовый код, удалить после проверки
//        Dictionary wordsTest = Dictionary.readFromFile("words\\src\\gui\\dictionary.txt");
//        Dictionary dic = Dictionary.readFromFile("dictionary.txt");

        JFrame frame = new JFrame();
        frame.setTitle("words");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JFrame frameChangeDictionary = new JFrame();
        frameChangeDictionary.setTitle("change dictionary");
        frameChangeDictionary.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameChangeDictionary.setSize(600, 200);

        JPanel centerPanel = new JPanel(new FlowLayout());
        JPanel panelChangeDictionari = new JPanel();

        JButton buttonNext = new JButton("next");
        JButton buttonPrev = new JButton("prev");
        JButton buttonRandom = new JButton("random");
        JButton buttonFirst = new JButton("first");
        JButton buttonLast = new JButton("last");
        JButton buttonChangeDictionary = new JButton("change Dictionary");

        Word firstWord = words.getFirst();
        firstWord.incrementQuantityDisplay();
        JLabel labelRus = new JLabel(firstWord.getEnglish());
        JLabel labelEng = new JLabel(firstWord.getRussian());
        JLabel labelQuantity = new JLabel("" + firstWord.getQuantityDisplay());

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

        ChangeDictionaryListener myChangeDictionaryListener = new ChangeDictionaryListener(frameChangeDictionary);
        buttonChangeDictionary.addActionListener(myChangeDictionaryListener);

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(labelRus);
        labelsPanel.add(labelEng);
        labelsPanel.add(labelQuantity);

        centerPanel.add(buttonPrev);
        centerPanel.add(labelsPanel);
        centerPanel.add(buttonNext);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(buttonChangeDictionary);
        bottomPanel.add(buttonRandom);

        JPanel bottomPanel1 = new JPanel();
        bottomPanel1.add(buttonFirst);
        bottomPanel1.add(buttonLast);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        mainPanel.add(bottomPanel1, BorderLayout.NORTH);

        frame.add(mainPanel);
        frameChangeDictionary.add(panelChangeDictionari);

        frame.setVisible(true);

    }
}
