import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int element = scanner.nextInt();
        int[] a = new int[element];
        System.out.println("Введите масив с клавиатуры:");
        try {
            for (int i = 0; i < element; i = i + 1) {
                a[i] = scanner.nextInt();
            }
        } catch (IllegalFormatCodePointException ex) {
            System.out.println("Вы ввели некорректное число");
        }
        for (int i = 0; i < element; i = i + 1) {
            System.out.println(a[i]);
        }
        System.out.println("Последний элемент массива: " + a[element - 1]);
        System.out.println("Элемент массива с номером 0: " + a[0]);
        for (int i = element - 1; i >= 0; i = i - 1) {
            System.out.println(a[i]);
        }
    }
}