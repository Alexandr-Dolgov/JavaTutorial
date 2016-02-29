package Work;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Random;
import java.util.Scanner;

public class Random02 {
    //02 пользователь вводит положительное целое число х.
    //Вывести на экра случайное целое число в пределах [-x, +x]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите число:");
        int x = scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(x+1) - random.nextInt(2 * x);
            System.out.print(number + " ");
        }

    }
}
