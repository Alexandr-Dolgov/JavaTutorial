package Work;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom02 {
//    02 вывести на экран элемент массива с номером 0
//    массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
//    пользователь указывает границы для количества элементов
//    и границы для самого элемента //элементы - вещественные
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("введите min и max границы для количества элементов:");

    int minLength = scanner.nextInt();
    int maxLength = scanner.nextInt();
    int length = minLength + random.nextInt(maxLength-minLength);
    double[] a = new double[length];

    System.out.println("введите min и max границы для самих элементов:");

    int minValue = scanner.nextInt();
    int maxValue = scanner.nextInt();

    System.out.println("массив:");
    for (int i =0; i<length; i=i+1){
        double value = random.nextDouble();
        a[i] = value;
    }
    for (int i = 0; i<length; i=i+1){
        System.out.println(a[i]);
    }
    System.out.println("элемент массива с номером 0 = "+ a[0]);
}
}
