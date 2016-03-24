package layout;

import javax.swing.*;
import java.awt.*;

//какие еще есть панели
//использовать не GridLayout а FlowLayout
//в mainPanel добавить 3 и 4 Layaut с разным расположением
//методы, которые есть у Frame

/*
Layout Managers схемы размещения
FlowLayout - построчное раположение
GridLayout - табличное
BoxLayout
BorderLayout - по областям
GardLayout
GridBagLayout

JPanel
JFrame
JButton
JTextFild
JLable

setTitle
setSize
setVizibl
*/

public class AppWork {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Таблица");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        JPanel panel1 = new JPanel(new GridLayout(2, 1, 5, 5));
        panel1.add(new JButton("a"));
        panel1.add(new JButton("s"));

        JPanel panel2 = new JPanel(new GridLayout(2, 1, 5, 5));
        panel2.add(new JButton("d"));
        panel2.add(new JButton("f"));

        JPanel panel3 = new JPanel(new GridLayout(1, 2, 5, 5));
        panel3.add(new JButton("j"));
        panel3.add(new JButton("k"));
        panel3.add(new JButton("l"));
        panel3.add(new JButton(";"));

        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        frame.add(mainPanel);

        frame.setVisible(true);

    }
}
