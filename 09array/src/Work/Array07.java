package Work;

import java.util.Scanner;

public class Array07 {
    //07 вывести на экран минимальный элемент
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }




        //int min;
        int[] arr  = {1, 3};
        System.out.println(Array07.min(arr));

    }
    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i = i + 1) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        //System.out.println("минимальный лемент = " + min);
        return min;
    }

}
