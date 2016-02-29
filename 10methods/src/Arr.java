import java.util.Random;

public class Arr {
    //01 static int min(int[] a) //метод возвращает минимальный элемент массива а
    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //int[] a = {5, 2, 4};    //способ инициализации массива

        int[] a = Arr.generate();
        Arr.print(a);

        int min = Arr.min(a);
        System.out.println(min);

    }

    static int[] generate() {
        int[] a = new int[5];
        Random random = new Random();
        for (int i = 0; i < a.length; i = i + 1) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
