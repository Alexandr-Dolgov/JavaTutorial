import java.util.Scanner;

public class Array11 {
    //11 вывести на экран номер максимального элемента массива
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
        int index = 0;
        for (int i = 0; i < length; i = i + 1) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("номер максимального элемента = " + index);
    }
}
