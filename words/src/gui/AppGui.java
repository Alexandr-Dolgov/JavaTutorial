package gui;

import javax.swing.*;
import java.awt.*;

public class AppGui {

    public static void main(String[] args) {

        Dictionary words = new Dictionary(false);

        JFrame frame = new JFrame();
        frame.setTitle("words");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        JPanel mainPanel = new JPanel(new FlowLayout());

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

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(labelRus);
        labelsPanel.add(labelEng);
        labelsPanel.add(labelQuantity);

        mainPanel.add(buttonPrev);
        mainPanel.add(labelsPanel);
        mainPanel.add(buttonNext);
        mainPanel.add(buttonRandom);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

}
