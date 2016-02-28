package work.arrayrandom;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom04 {
    //    04 вывести на экран только четные элементы
//    массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
//    пользователь указывает границы для количества элементов
//    и границы для самого элемента //элементы - вещественные
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите min и max границы для количества элементов:");

        int minLength = scanner.nextInt();
        int maxLength = scanner.nextInt();
        int length = minLength + random.nextInt(maxLength - minLength);
        double[] a = new double[length];

        System.out.println("введите min и max границы для элементов:");

        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();

        for (int i = 0; i < length; i = i + 1) {
            a[i] = random.nextDouble();
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < length; i = i + 1) {
            if (a[i] % 2 == 0) {
                System.out.println("только четные элементы:" + a[i]);
            }
        }

    }
}
