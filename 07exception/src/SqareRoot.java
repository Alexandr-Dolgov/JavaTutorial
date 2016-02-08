import java.util.InputMismatchException;
import java.util.Scanner;

public class SqareRoot {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения a*x*x+b*x+c+0");
        System.out.println("Введите значение a, b и c");
        Scanner scanner = new Scanner(System.in);
        try {
            double a = scanner.nextInt();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
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
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели неверное значение");
        }
    }
}
