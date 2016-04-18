package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class LoadDictionaryListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        JFrame frame = new JFrame();

        frame.setTitle("load dictionary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);


        File file = new File("C:\\Users\\AK\\IdeaProjects\\JavaTutorial\\words\\src\\gui\\dictionary.txt");

        JPanel panel = new JPanel(new FlowLayout());
        JTextField field = new JTextField(25);

        JButton buttonLoad = new JButton("load");
        JButton buttonCancel = new JButton("cancel");

        panel.add(field);
        panel.add(buttonLoad);
        panel.add(buttonCancel);

        frame.add(panel);

        frame.setVisible(true);

        System.out.println("end");
    }
}
