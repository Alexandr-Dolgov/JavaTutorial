package layout;

import javax.swing.*;
import java.awt.*;

public class AddBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Word");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        JPanel panel1 = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("a");
        JTextField textField = new JTextField(10);

        JPanel panel2 = new JPanel(new GridLayout(1, 2));
        panel2.add(new JButton("a"));
        panel2.add(new JButton("s"));

        JPanel panel3 = new JPanel(new BorderLayout());
        panel1.add(new TextField(20));

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add("North", panel1);
        mainPanel.add(label1);
        mainPanel.add(textField);
        mainPanel.add("West", panel2);
        mainPanel.add("Center", panel3);

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}
