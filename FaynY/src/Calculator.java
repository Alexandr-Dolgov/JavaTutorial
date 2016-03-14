import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonDevision;
    JButton buttonMultiplication;
    JButton buttonSubtraction;
    JButton buttonAddition;
    JButton buttonMS;
    JButton buttonMR;
    JButton buttonMC;
    JButton buttonMP;
    JPanel p1;
    JPanel p2;

// В конструкторе создаются все компоненты
// и добавляются на фрейм с помощью комбинации
// Borderlayout и Gridlayout
    Calculator() {
        windowContent = new JPanel();

// 1. Задаём схему для этой панели, которая будет
// основной, и в которой будут содержаться остальные панли
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

// Создаём и отображаем поле
// 2. Добавляем его в Северную область окна. Добавить JTextField
// северную часть, для того чтобы отображать введенные числа
        displayField = new JTextField(30);
        windowContent.add("North", displayField);

// Создаём кнопки, используя конструктор
// класса JButton, который принимает текст
// кнопки в качестве параметра
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonDevision = new JButton("/");
        buttonMultiplication = new JButton("*");
        buttonSubtraction = new JButton("-");
        buttonAddition = new JButton("+");

        buttonMC = new JButton("MC");
        buttonMR = new JButton("MR");
        buttonMS = new JButton("MS");
        buttonMP = new JButton("MP");

// 3. Создаём панель с GridLayout
// которая содержит 12 кнопок - 10 кнопок с числами
// и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4, 4);
        p1.setLayout(g1);

        p2 = new JPanel();
        GridLayout g2 = new GridLayout(4, 1);
        p2.setLayout(g2);

// Добавляем кнопки на панель p1
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonDevision);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(buttonMultiplication);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(buttonSubtraction);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p1.add(buttonAddition);

        p2.add(buttonMC);
        p2.add(buttonMR);
        p2.add(buttonMS);
        p2.add(buttonMP);

//Помещаем панель p1 в центральную область окна
        windowContent.add("Center", p1);
        windowContent.add("West", p2);

//Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

//делаем размер окна достаточным
//для того, чтобы вместить все компоненты
        frame.pack();

// Наконец, отображаем окно
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }


}
