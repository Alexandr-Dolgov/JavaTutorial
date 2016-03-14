import javax.swing.*;
import java.awt.GridLayout;

public class MyCalculator {
    public static void main(String[] args) {

        JPanel windowContent = new JPanel();//создаем панель

        GridLayout g1 = new GridLayout(4,2);//задаем менеджер отображений для этой панели.
        //FlowLayout - построчное расположение в классе java.awt.FlowLayout
        windowContent.setLayout(g1);

        JLabel label1 = new JLabel("Nomber 1 :");//создаем компоненты памяти
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Nomber 2 :");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Nomber 3 :");
        JTextField resalt= new JTextField(10);
        JButton go = new JButton("Add");

        windowContent.add(label1);//добавляем компоненты на панель
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(resalt);
        windowContent.add(go);

        JFrame frame = new JFrame("My first Calculator");//задаем фрейм и задаем для него панель
        frame.setContentPane(windowContent);

        frame.setSize(400,100);//задаем размер и делаем фрейм видимым
        frame.setVisible(true);
    }
}
