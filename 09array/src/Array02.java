import java.util.Scanner;

public class Array02 {
    //02 вывести на экран элемент массива с номером 0
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
        int n = a[0];
        System.out.println("элемент массива с номером 0 = " + n);
    }
}
