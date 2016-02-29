package Work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalvinCelsiusFahrenheit {
    public static void main(String[] args) {
        System.out.println("Введите значение температуры:");
        Scanner scanner = new Scanner(System.in);
        try {
            double t = scanner.nextDouble();
            System.out.println("Введите единицу измерения:");
            String s = scanner.next();
            String ca = "ca";
            String fa = "fa";
            String ce = "ce";
            if (s.equals(ca)) {
                System.out.println(t + " градусов по Кельвину = " + (t + 273) + " градусов по Цельсию");
                System.out.println(t + " градусов по Кельвину = " + (t * (-457.87)) + " градусов по Форингейту");
            } else if (s.equals(fa)) {
                System.out.println(t + " градусов по Фарингейту = " + (9 / 5 * (t - 32)) + " градусов по Цельсийю");
                System.out.println(t + " градусов по Фарингейту = " + (t * 255.3) + " градусов по Кельвину)");
            } else if (s.equals(ce)) {
                System.out.println(t + " градусов по Цельсию = " + (t - 243.15) + " градусов по Кельвину");
                System.out.println(t + " градусов по Цельсию = " + (t * 9 / 5 + 32) + " градусов по Форингейту");
            }
        } catch (InputMismatchException ex) {
            System.out.println("не удалось распознать вводимое значение");
        }
    }
}
