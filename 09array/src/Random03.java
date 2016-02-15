import java.util.Random;
import java.util.Scanner;

public class Random03 {
    //03 пользователь вводит положительное целое число х. Вывести на экран случайное вещественное число [0, x)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите положительное целое число:");
        int count = scanner.nextInt();
        int d = random.nextInt(count);
        System.out.println("случайное вещественное число от 0(включительно) до " + count + " = " + d);
        double figure = Math.random() * count;
        System.out.println(figure);
    }
}
