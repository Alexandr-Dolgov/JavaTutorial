import java.util.Random;
import java.util.Scanner;

public class Array17 {
    //17 вывести на экран произведение ненулевых
    //следующее делать после выполнения заданий на random
    //Все тоже самое, только массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
    //пользователь указывает границы для количества элементов
    //и границы для самого элемента элементы - вещественные

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите диапазон:");
        Random random = new Random();
        int length = scanner.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i = i + 1) {
            a[i] = random.nextInt(length);
            System.out.println(a[i]);
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
