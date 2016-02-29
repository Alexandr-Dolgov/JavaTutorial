package Work;

import java.util.Scanner;

public class InThreeCountMinFylMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("max = " + a);

        } else if (b > a && b > c) {
            System.out.println("max = " + b);

        } else {
            System.out.println("max = " + c);
        }
    }
}
