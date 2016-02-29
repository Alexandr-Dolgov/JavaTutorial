package Work;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
//    Создать класс ArrayRandom с только статическими методами
//
//            Метод
//    static double[] generate(int minLength, int maxLength, double minValue, double maxValue)
//
//    Метод выводит на экран массив в строку, на каждое число отводится 10 символ (всегда 2 на дробную часть) //посмотреть на format String java
//    static print(double[] arr)
//
//    В методе main считываем с клавиатуры int minLength, int maxLength, double minValue, double maxValue
//    генерируем массив
//    выводим на экран сгенерированный массив
//    этот массив передаем в соотв. методы (которых 18 штук) обрабатывающие массив
//    возвращаемое значение каждого метода вывести на экран

    static int[] generate(int minLength, int maxLength,  int minValue, int maxValue) {
        Random random = new Random();
        int length = minLength + random.nextInt(maxLength - minLength);
        int[] arr = new int[length];
        for (int i = 0; i < length; i = i + 1) {
            minValue = -3;
            maxValue = 5;

            int integerBound = Math.abs(minValue-maxValue);


            int value = maxValue - random.nextInt(integerBound);
            arr[i] = value;
        }
        for (int i = 0; i < length; i = i + 1) {
            System.out.println(arr[i]);
        }
        return arr;
    }
//    static void print(double[] arr){
//        ArrayRandom.generate(arr);
//        for (int i =0; i<arr.length; i=i+1){
//            System.out.print(arr+" ");
//        }
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите границы min и max количества элементов в массиве:");
        int minLength = scanner.nextInt();
        int maxLength = scanner.nextInt();
        System.out.println("введите границы min max элементов массива:");
        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();

        int[] arr = ArrayRandom.generate(minLength, maxLength, minValue, maxValue);

    }


}
