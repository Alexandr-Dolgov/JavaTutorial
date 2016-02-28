package work.array;

import java.util.Scanner;

public class Array04 {
    //04 вывести на экран только четные элементы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i<length; i= i+1){
            a[i]=scanner.nextInt();
        }
        for (int i=0; i<length; i=i+1) {
            System.out.println(a[i]);
        }
        System.out.println("четные элементы в массиве:");
        for (int i =0; i<length; i=i+1){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
