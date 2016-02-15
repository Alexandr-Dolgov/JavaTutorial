import java.util.Scanner;

public class Array13 {
    //13 поменять местами первый элемент и максимальный
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
        int max = a[0];
        for (int i = 0; i < length; i = i + 1) {
            if (a[max] < a[i]) {
                max = a[i];
            }
        }
        System.out.println("масимальный элемент = " + a[max]);
        int tmp = a[0];
        a[0] = a[max];
        a[max] = tmp;
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
    }
}
