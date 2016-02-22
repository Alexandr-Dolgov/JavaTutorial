import java.util.Random;
import java.util.Scanner;


public class Array16 {
//    16 вывести на экран среднее арифметическое
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < length; i = i + 1) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
