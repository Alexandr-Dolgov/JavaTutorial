package gui;

import javax.swing.*;
import java.awt.*;

public class AppGui {

    public static void main(String[] args) throws Exception {

        Dictionary words = new Dictionary(false);

        //тестовый код, удалить после проверки
        //Dictionary words = Dictionary.readFromFile("Dictionary.txt");

        JFrame frame = new JFrame();
        frame.setTitle("words");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JPanel centerPanel = new JPanel(new FlowLayout());

        JButton buttonNext = new JButton("next");
        JButton buttonPrev = new JButton("prev");
        JButton buttonRandom = new JButton("random");

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

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(labelRus);
        labelsPanel.add(labelEng);
        labelsPanel.add(labelQuantity);

        centerPanel.add(buttonPrev);
        centerPanel.add(labelsPanel);
        centerPanel.add(buttonNext);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(buttonRandom);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

}
