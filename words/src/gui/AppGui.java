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

        JPanel panel1 = new JPanel(new FlowLayout());

        NextListener myNextListener = new NextListener();

        JButton buttonNext = new JButton("next");
        buttonNext.addActionListener(myNextListener);

        JButton buttonPrev = new JButton("prev");

        JLabel label1 = new JLabel(words.getFirst().toString());
        JLabel label2 = new JLabel(words.getNextWord().toString());
        JLabel label3 = new JLabel();

        panel1.add(buttonPrev);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(buttonNext);

        frame.add(panel1);

        frame.setVisible(true);
    }

}
