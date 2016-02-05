import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            byte d = scanner.nextByte();    //Ctrl + Q //quick documentation
            System.out.print("d = ");
            System.out.println(d);
        } catch (InputMismatchException ex) {
            System.out.println("введенное вами либо не число либо не попадает в диапазо -128--127");
        } catch (Exception ex) {
            System.out.println("что-то пошло не так");
        }
    }

}
