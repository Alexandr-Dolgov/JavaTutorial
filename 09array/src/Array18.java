import java.util.Random;
import java.util.Scanner;

public class Array18 {
    //18 вывести сумму
    //следующее делать после выполнения заданий на random
    //Все тоже самое, только массив заполняется автоматически
    //случайными числами в заданном с клавиатуры диапазоне.
    //пользователь указывает границы для количества элементов
    //и границы для самого элемента элементы - вещественные

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите границы для количества элементов:");
        int length = scanner.nextInt();
        int[] a = new int[length];
        int boundedValue = random.nextInt(length);
        System.out.println(boundedValue);
        length = boundedValue;
        for (int i = 0; i < length; i = i + 1) {//// TODO: 15.02.2016 при генерации возможен 0, некорректно
            a[i] = random.nextInt(length);
        }
        System.out.println("массив:");
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(a[i]);
        }
        double sum = 0;
        for (int i = 0; i < length; i = i + 1) {
            sum = sum + a[i];
        }
        System.out.println("сумма элементов массива = " + sum);
    }
}
