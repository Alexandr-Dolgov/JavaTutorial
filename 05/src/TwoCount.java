import java.util.Scanner;

public class TwoCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i = i + 1) {
            System.out.println(i);
        }

    }
}
