public class Arr01 {
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
}
