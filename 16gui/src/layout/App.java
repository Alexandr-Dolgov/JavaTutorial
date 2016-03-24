package layout;

import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("моя первая программа с графическим интрефейсом пользователя");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        panel1.add(new JButton("a"));
        panel1.add(new JButton("b"));

        JPanel panel2 = new JPanel(new GridLayout(1, 2));
        panel2.add(new JButton("c"));
        panel2.add(new JButton("d"));

        JPanel mainPanel = new JPanel(new GridLayout(1,2));
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

}
