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
        int count = scanner.nextInt();
        int number = random.nextInt(count+1) - count / 2;
        System.out.println(number);
    }
}
