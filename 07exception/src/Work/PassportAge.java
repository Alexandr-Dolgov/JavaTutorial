package Work;

import java.util.Scanner;

public class PassportAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        if (age >= 14) {
            System.out.println("Получайте паспорт");
        } else
            System.out.println("Вам рано получать паспорт");
    }
}
