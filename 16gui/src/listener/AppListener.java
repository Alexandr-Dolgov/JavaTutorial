package listener;

import javax.swing.*;
import java.awt.*;

public class AppListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("обработка нажатия на кнопку");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        JPanel panel1 = new JPanel(new FlowLayout());
        JButton buttonA = new JButton("a");

        MyActionListener actionListener = new MyActionListener();
        buttonA.addActionListener(actionListener);

        JButton buttonB = new JButton("b");

        MyFocusListener focusListener = new MyFocusListener();
        buttonB.addFocusListener(focusListener);

        panel1.add(buttonA);
        panel1.add(buttonB);

        frame.add(panel1);

        frame.setVisible(true);
    }
}
