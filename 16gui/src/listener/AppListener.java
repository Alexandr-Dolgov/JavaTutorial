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

        MyListener listener = new MyListener();

        JButton buttonA = new JButton("a");
        buttonA.addActionListener(listener);
        JButton buttonB = new JButton("b");
        buttonB.addFocusListener(listener);

        panel1.add(buttonA);
        panel1.add(buttonB);

        frame.add(panel1);

        frame.setVisible(true);
    }
}
