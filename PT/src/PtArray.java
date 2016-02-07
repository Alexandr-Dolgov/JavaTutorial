public class PtArray extends PT {

    public static void array7() {
        int count = getInt();
        double[] a = new double[count];
        for (int i = 0; i < count; i++) {
            a[i] = getDouble();
        }
        for (int i = count - 1; i >= 0; i--) {
            put(a[i]);
        }
    }
}
