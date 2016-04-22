package gui;

import javax.swing.*;
import java.awt.*;


public class AppGuiFrame extends JFrame{

    public AppGuiFrame(){
        //super();

//        Dictionary words = new Dictionary(false);
        //words.deleteWord(4);

        Dictionary words = Dictionary.smartReadFromFile("dic");

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

        ChangeDictionaryListener myChangeDictionaryListener = new ChangeDictionaryListener();
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
