import java.util.Scanner;

public class MileKilometr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение:");
        double i = scanner.nextDouble();

        System.out.println("Введите единицу измерения km или ml:");
        String s = scanner.next();
        String k = "km";
        String m = "ml";

        if (s.equals(k)) {
            System.out.println("km");
            double v = i / 1.6;
            System.out.println("В " + i + " км " + v + " мл");
        } else if (s.equals(m)) {
            System.out.println("ml");
            double w = i * 1.6;
            System.out.println("В " + i + " мл " + w + "км");
        }
    }
}
