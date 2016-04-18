package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeDictionaryListener implements ActionListener {

    public JFrame frame;//описываем поле у ChangeDictionaryListener есть поле frame

    public ChangeDictionaryListener(JFrame frame){//должна при. ссылка на объект типа JFrame
        this.frame = frame;//
    }

//    boolean b = true;
//    public  ChangeDictionaryListener(boolean i){
//        this.i = i;
//    }
    public void actionPerformed(ActionEvent e) {
        AppGui.b = true;
        frame.setVisible(true);


        JFrame frame = new JFrame();

        frame.setTitle("chande dictionary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);

        JPanel panel = new JPanel(new FlowLayout());

        JButton buttonAddWord = new JButton("add word");
        JButton buttonDeleteWord = new JButton("delete word");
        JButton buttonLoadDictionary = new JButton("load dictionary");

        LoadDictionaryListener LoadDictionaryListener = new LoadDictionaryListener();
        buttonLoadDictionary.addActionListener(LoadDictionaryListener);

        panel.add(buttonAddWord);
        panel.add(buttonDeleteWord);
        panel.add(buttonLoadDictionary);

        frame.add(panel);
        frame.setVisible(true);

        System.out.println("end");
    }
}


