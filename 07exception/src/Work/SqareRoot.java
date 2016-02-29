package Work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqareRoot {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения a*x*x+b*x+c+0");
        System.out.println("Введите значение a, b и c");
        Scanner scanner = new Scanner(System.in);
        double a = 1, b = 1, c = 1;
        try {
            //Alt + Shift + Insert
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели неверное значение");
            return;
        }

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / 2 * a;
            double x2 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("Первый корень уравнения = " + x1);
            System.out.println("Второй корень уравнения = " + x2);
        } else if (d == 0) {
            double x3 = -b / 2 * a;
            System.out.println("Уравнение имеет один корень x =" + x3);
        } else System.out.println("Уравнение не имеет корней");
    }
}
