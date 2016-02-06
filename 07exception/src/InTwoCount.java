import java.util.Scanner;

public class InTwoCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("min = " + a);
        } else {
            System.out.println("min = " + b);
        }
    }
}
