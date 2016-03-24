package layout;

import javax.swing.*;
import java.awt.*;

public class AppFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Programm");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        JPanel panel1 = new JPanel(new FlowLayout());

        JLabel label1 = new JLabel("a");
        JTextField textField1 = new JTextField(10);

        panel1.add(label1);
        panel1.add(textField1);

        frame.add(panel1);

        frame.setVisible(true);

    }
}
