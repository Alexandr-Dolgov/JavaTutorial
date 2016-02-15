import java.util.Random;
import java.util.Scanner;

public class Random01 {
    //01 пользователь вводит положительное целое целое число.
    // Вывести на экран случайное цеоле число от 0 до введенного

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите положительное целое число:");
        Random random = new Random();
        int count = scanner.nextInt();
        int boundedValue = random.nextInt(count);
        System.out.println("случайное число = "+boundedValue);
    }
}
