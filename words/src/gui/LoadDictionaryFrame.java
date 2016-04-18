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

        JPanel panel = new JPanel(new FlowLayout());
        JTextField field = new JTextField(25);

        JButton buttonLoad = new JButton("load");
        JButton buttonCancel = new JButton("cancel");

        panel.add(field);
        panel.add(buttonLoad);
        panel.add(buttonCancel);

        //buttonLoad.addActionListener(/*new СлушательНажатияНаКнопкуЗагрузитьСловарь()*/);

        add(panel);
        setVisible(true);
    }
}
