import java.util.Scanner;

public class Array15 {
    //15 отсортировать массив по убыванию (метод "пузырька")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элеменов в массиве:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < length; i = i + 1) {
            for (int j = length - 1; j > i; j = j - 1) {
                if (a[j] > a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
    }
}
