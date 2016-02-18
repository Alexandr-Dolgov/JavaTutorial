public class Arr04 {
    //04 static int indexMax(int[] a) //метод возвращает индекс максимального элемент массива а
    static int max(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] > max) {
                max = i;
            }
        }
        return max;

    }
}
