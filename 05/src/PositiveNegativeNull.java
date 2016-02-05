import java.util.Scanner;

public class PositiveNegativeNull {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");

        int s = scanner.nextInt();

        if (s > 0)
            System.out.println("positive");
        if (s < 0)
            System.out.println("negative");
        if (s == 0)
            System.out.println("null");
    }
}
