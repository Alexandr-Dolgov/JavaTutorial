import java.util.Scanner;

public class Array05 {
    //05 вывести на экран только элементы с нечетными номерами
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
        System.out.println("элементы с нечетными номерми в массиве:");
        for (int i = 0; i < length; i = i + 1) {
            if (i % 2 == 1)
                System.out.println(a[i]);
        }
    }
}
