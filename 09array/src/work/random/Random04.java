package work.random;

import java.util.Random;
import java.util.Scanner;

public class Random04 {
    //04 пользователь вводит положительное целое число х.
    //Вывести на экран случайное вещественное число [-x, +x]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите положительное целое число:");
        int integer = scanner.nextInt();
        int min = integer;
        int max = -integer;
        double nomber = min + (Math.random() * ((max - min) + 1));
        System.out.println("случайное вещественное число в диапазоне от -" + integer + " (вкючительно) до + " + integer + " (включительно) = " + nomber);
    }
}

