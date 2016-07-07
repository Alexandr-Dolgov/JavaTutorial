package com.sokolov.words.frames.dictionary.load;

import com.sokolov.words.model.Dictionary;
import com.sokolov.words.model.DictionaryHolder;
import com.sokolov.words.model.Word;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by AK on 29.05.2016.
 */
public class SaveFrame extends JFrame {

    JComboBox formatsComboBox;

    public SaveFrame() {
        super();

        setTitle("save");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        int columns = 15;
        final JTextField field = new JTextField(columns);

        String[] formats = {"txt", "json", "obj"};
        formatsComboBox = new JComboBox(formats);

        JPanel panelEast = new JPanel(new GridLayout(2, 1, 5, 5));
        panelEast.add(field);
        panelEast.add(formatsComboBox);

        final JLabel label = new JLabel("path");

        JButton buttonSave = new JButton("save");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!formatsComboBox.getSelectedItem().equals("txt")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "этот функционал еще не реализован",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                Dictionary words = DictionaryHolder.getInstance().getDictionary();
                try {
                    String pathName = field.getText();
                    words.writeToFile(pathName);
                    JOptionPane.showMessageDialog(
                            null,
                            "файл записан и сохранен",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "ошибка при записи",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                }
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
