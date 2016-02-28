package work.array;

import java.util.Scanner;

public class Array10 {
    //10 вывести на экран номер минимального элемента
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите клличество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < length; i = i + 1) {
        }
        int min = a[0];
        int index = 0;
        for (int i = 0; i < length; i = i + 1) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("номер минимального элемента = " + index);
    }
}
