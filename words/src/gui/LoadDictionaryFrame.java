package gui;

import javax.swing.*;
import java.awt.*;

public class LoadDictionaryFrame extends JFrame {

    public LoadDictionaryFrame() {
        //создание фрейма
        super();

        //настройка фрейма
        setTitle("load dictionary");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 200);

        JTextField field = new JTextField(15);

        JButton buttonLoad = new JButton("load");
        JButton buttonCancel = new JButton("cancel");

        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(field);

        JPanel panelCentr = new JPanel(new FlowLayout());
        panelCentr.add(buttonCancel);
        panelCentr.add(buttonLoad);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCentr, BorderLayout.CENTER);

        //buttonLoad.addActionListener(/*new СлушательНажатияНаКнопкуЗагрузитьСловарь()*/);

        add(mainPanel);
        setVisible(true);
    }
}
