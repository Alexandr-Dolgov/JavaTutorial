package gui;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppGui {

    public static void main(String[] args) throws Exception {

        File f = new File("dictionary.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s = br.readLine();
            System.out.println(s);



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null)
                    fr.close();
            } catch (IOException ignore){

            }
        }

        Dictionary words = new Dictionary(false);
        words.deleteWord(4);


        //тестовый код, удалить после проверки
//        Dictionary words = Dictionary.readFromFile("dictionary.txt");
//        Dictionary dic = Dictionary.readFromFile("dictionary.txt");

        JFrame frame = new JFrame();
        frame.setTitle("words");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JPanel centerPanel = new JPanel(new FlowLayout());

        JButton buttonNext = new JButton("next");
        JButton buttonPrev = new JButton("prev");
        JButton buttonRandom = new JButton("random");
        JButton buttonDeleteWord = new JButton("delete");

        Word firstWord = words.getFirst();
        firstWord.incrementQuantityDisplay();
        JLabel labelRus = new JLabel(firstWord.getEnglish());
        JLabel labelEng = new JLabel(firstWord.getRussian());
        JLabel labelQuantity = new JLabel("" + firstWord.getQuantityDisplay());

        NextListener myNextListener = new NextListener(words, labelRus, labelEng, labelQuantity);
        buttonNext.addActionListener(myNextListener);

        PrevListener myPrevListener = new PrevListener(words, labelRus, labelEng, labelQuantity);
        buttonPrev.addActionListener(myPrevListener);

        RandomListener myRandomListener = new RandomListener(words, labelRus, labelEng, labelQuantity);
        buttonRandom.addActionListener(myRandomListener);

        DeleteWord myDeleteWord = new DeleteWord(words, labelEng, labelEng, labelQuantity);
        buttonDeleteWord.addActionListener(myDeleteWord);



        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(labelRus);
        labelsPanel.add(labelEng);
        labelsPanel.add(labelQuantity);

        centerPanel.add(buttonPrev);
        centerPanel.add(labelsPanel);
        centerPanel.add(buttonNext);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(buttonRandom);
        bottomPanel.add(buttonDeleteWord);



        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

}
