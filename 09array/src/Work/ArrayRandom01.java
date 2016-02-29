package Work;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom01 {
//    01 вывести последний элемент массива на экран
//массив заполняется автоматически случайными числами в заданном с клавиатуры диапазоне.
//    пользователь указывает границы для количества элементов
//    и границы для самого элемента //элементы - вещественные
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("введите min и max границы для количества элементов:");
    int minLength = scanner.nextInt();
    int maxLength = scanner.nextInt();
    int length = minLength + random.nextInt(maxLength - minLength);
    double[]a = new double[length];

    System.out.println("введите min и max границы самого элемнта:");
    int minValue = scanner.nextInt();
    int maxValue = scanner.nextInt();


    for (int i = 0; i<length; i = i+1){
        int value = minValue + random.nextInt(maxValue-minValue);
        a[i] = value + random.nextDouble();
    }
    for (int i=0; i<length; i=i+1){
        System.out.println(a[i]);
    }
    System.out.println("последний элемент массива = "+ a[length-1]);
}
}
