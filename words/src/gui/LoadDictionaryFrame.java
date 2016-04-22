package gui;

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
        setSize(400, 200);

        JTextField field = new JTextField(15);

        JButton buttonLoadPatch = new JButton("load patch");
        JButton buttonCancel = new JButton("cancel");

        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(field);

//        String displayPath = field.getText();
//        this.displayPath = displayPath;
//        System.out.println(displayPath);


        JPanel panelCenter = new JPanel(new FlowLayout());
        panelCenter.add(buttonLoadPatch);
        panelCenter.add(buttonCancel);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);

        //buttonLoad.addActionListener(/*new СлушательНажатияНаКнопкуЗагрузитьСловарь()*/);
        buttonLoadPatch.addActionListener(new ReadPatch());


        add(mainPanel);
        setVisible(true);
    }
}
