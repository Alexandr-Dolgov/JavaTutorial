import java.util.Scanner;

public class Array03 {
    //03 вывести на экран элементы в обратном порядке
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        for (int i = length - 1; i >= 0; i = i - 1) {
            System.out.println(a[i]);
        }
    }
}
