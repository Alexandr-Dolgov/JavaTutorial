import java.util.Random;
import java.util.Scanner;


public class Array16 {
    //16 вывести на экран среднее арифметическое
    //следующее делать после выполнения заданий на random
    //Все тоже самое, только массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
    //пользователь указывает границы для количества элементов
    //и границы для самого элемента элементы - вещественные

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("введите границы массива:");
        int length = scanner.nextInt();//// TODO: 15.02.2016 сделать вещественные границы
        int[] a = new int[length];
        System.out.println("массив:");
        for (int i = 0; i < length; i = i + 1) {
            a[i] = random.nextInt(length);
            System.out.println(a[i]);
        }
        double sum = 0;
        for (int i = 0; i < length; i = i + 1) {
            sum = sum +a[i];
        }
        System.out.println("среднее арифметическое = " + sum / length);
    }
}
