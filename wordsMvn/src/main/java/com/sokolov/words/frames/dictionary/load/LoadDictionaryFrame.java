package com.sokolov.words.frames.dictionary.load;

import javax.swing.*;
import java.awt.*;

public class LoadDictionaryFrame extends JFrame {

    public String displayPath;

    public LoadDictionaryFrame() {

        //создание фрейма
        super();

        //настройка фрейма
        setTitle("load dictionary");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        int columns = 15;
        JTextField field = new JTextField(columns);

        JButton buttonLoadPatch = new JButton("load path");
        JButton buttonCancel = new JButton("cancel");

        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(field);

        JPanel panelCenter = new JPanel(new FlowLayout());
        panelCenter.add(buttonLoadPatch);
        panelCenter.add(buttonCancel);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);

        //buttonLoad.addActionListener(/*new СлушательНажатияНаКнопкуЗагрузитьСловарь()*/);
        buttonLoadPatch.addActionListener(new ReadPathListener(field));

        add(mainPanel);
        pack();
        setVisible(true);
    }
}
