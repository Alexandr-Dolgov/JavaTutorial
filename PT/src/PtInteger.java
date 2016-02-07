public class PtInteger extends PT {

    public static void integer1() {
        int sm = getInt();
        int m = sm / 100;
        put(m);
    }

    public static void integer7() {
        int val = getInt();
        int d1 = val / 10;
        int d2 = val % 10;
        int sum = d1 + d2;
        int mul = d1 * d2;
        put(sum, mul);
    }
}
