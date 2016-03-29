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

        Word firstWord = words.getFirst();
        firstWord.incrementQuantityDisplay();
        JLabel label1 = new JLabel(firstWord.getEnglish());
        JLabel label2 = new JLabel(firstWord.getRussian());
        JLabel label3 = new JLabel("" + firstWord.getQuantityDisplay());

        NextListener myNextListener = new NextListener(words, label1, label2, label3);
        buttonNext.addActionListener(myNextListener);

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(label1);
        labelsPanel.add(label2);
        labelsPanel.add(label3);

        mainPanel.add(buttonPrev);
        mainPanel.add(labelsPanel);
        mainPanel.add(buttonNext);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

}
