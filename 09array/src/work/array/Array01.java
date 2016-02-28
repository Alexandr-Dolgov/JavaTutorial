package work.array;

import java.util.InputMismatchException;
import java.util.Scanner;
//01 вывести последний элемент массива на экран

public class Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива");
        try {
            for (int i = 0; i < length; i = i + 1) {
                a[i] = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            System.out.println("введено нерорректоное число");
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
        int lastElement = a[length - 1];
        System.out.println("последний элемент массива = " + lastElement);
    }
}
