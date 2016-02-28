package work.arrayrandom;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom03 {
    //    03 вывести на экран элементы в обратном порядке
//    массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
//    пользователь указывает границы для количества элементов
//    и границы для самого элемента //элементы - вещественные
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите min и max границы для количества элементов:");

        int minLength = scanner.nextInt();
        int maxLehgth = scanner.nextInt();
        int length = minLength + random.nextInt(maxLehgth - minLength);
        double[] a = new double[length];

        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();

        for (int i = 0; i < length; i = i + 1) {
            a[i] = random.nextDouble();
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
        System.out.println("элементы в обратном порядке:");
        for (int i = length - 1; i >= 0; i = i - 1) {
            System.out.println(a[i]);
        }

    }
}
