import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите сторону квадрата");
        try {
            double d = scanner.nextDouble();
            System.out.println("сторона квадрата " + d);
            System.out.println("периметр квадрата " + (d + d) * 2);
            System.out.println("площадь квадрата " + d * d);
        } catch (InputMismatchException ex) {
            System.out.println("Не удалось распознать число((");
        }
    }
}
