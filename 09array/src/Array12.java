import java.util.Scanner;

public class Array12 {
    //12 поменять в массиве первый и последний элемент местами и вывести полученный массив
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
        System.out.println("меняем первый и последний элемент местами:");
        int tmp = a[0];
        a[0] = a[length - 1];
        a[length - 1] = tmp;
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
    }
}
