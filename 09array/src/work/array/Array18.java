package work.array;

import java.util.Scanner;

public class Array18 {
    //18 вывести сумму

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов:");
        int length = scanner.nextInt();
        int[] a = new int[length];

        System.out.println("введите элементы массива:");

        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        System.out.println("массив:");
        for (int i = 0; i < length; i = i + 1) {
        }
        double sum = 0;
        for (int i = 0; i < length; i = i + 1) {
            sum = sum + a[i];
        }
        System.out.println("сумма элементов массива = " + sum);
    }
}
