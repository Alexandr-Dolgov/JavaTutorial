import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        System.out.print("d = ");
        System.out.println(d);

        byte b = scanner.nextByte();
        System.out.print("b = ");
        System.out.println(b);

        short s = scanner.nextShort();
        System.out.print("s = ");
        System.out.println(s);
    }
}
