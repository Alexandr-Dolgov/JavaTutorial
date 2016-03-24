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

        JButton buttonA = new JButton("prev");

        JButton buttonB = new JButton("next");

        JLabel label = new JLabel(words.getFirst().toString());

        panel1.add(buttonA);
        panel1.add(label);
        panel1.add(buttonB);

        frame.add(panel1);

        frame.setVisible(true);
    }

}
