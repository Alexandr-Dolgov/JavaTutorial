package com.sokolov.words.frames.dictionary.load;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AK on 29.05.2016.
 */
public class SaveFrame extends JFrame{
    public SaveFrame(){
        super();

        setTitle("save");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        int colums = 15;
        final JTextField field = new JTextField(colums);

        JPanel panelEast = new JPanel(new FlowLayout());
        panelEast.add(field);

        final JLabel label = new JLabel("path");

        JButton buttonSave = new JButton("save");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(label, BorderLayout.WEST);
        mainPanel.add(panelEast, BorderLayout.EAST);
        mainPanel.add(buttonSave, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setVisible(true);
    }
}
