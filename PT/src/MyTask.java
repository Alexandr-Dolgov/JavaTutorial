public class MyTask extends PT {
    public static void solve() throws Exception {
        String s = "Begin3";
        task(s);
        Class.forName("Pt" + stringWithoutDigitSuffix(s)).getMethod(s.toLowerCase()).invoke(null);
    }

    public static void main(String[] args) {
        start();
    }

    private static String stringWithoutDigitSuffix(String s) {
        int endIndex = s.length() - 1;
        while (Character.isDigit(s.charAt(endIndex))) {
            endIndex--;
        }
        return s.substring(0, endIndex + 1);
    }
}
