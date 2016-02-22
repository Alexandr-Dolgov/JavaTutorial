import java.util.Scanner;

public class Array17 {
//    17 вывести на экран произведение ненулевых

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов:");

        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        int product = 1;
        for (int i = 0; i < length; i = i + 1) {
            if (a[i] != 0) {
                product = product * a[i];
            }
        }
        System.out.println("произведение ненулевых = " + product);
    }
}
