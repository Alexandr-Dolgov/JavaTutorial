import java.util.Random;

public class Arr02 {
    //02 static int max(int[] a) //метод возвращает максимальный элемент массива а

    static int max(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

    }


}
