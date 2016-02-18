public class Arr03 {
    //03 static int indexMin(int[] a) //метод возвращает индекс минимального элемент массива а
    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < min) {
                min = i;
            }
        }
        return min;
    }
}
