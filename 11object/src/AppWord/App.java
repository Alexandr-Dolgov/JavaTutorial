package AppWord;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        instruction();
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.equals("exit")) {
            switch (input) {
                case "next": words.displayNext(); break;
                case "prev": words.displayPrev(); break;
                case "random": words.displayRandom(); break;
                case "rndNP": words.displayRandomNotPopular(); break;
                default: System.out.println("некорректный ввод"); instruction(); break;
            }
            input = scanner.next();
        }
        System.out.println("программа завершена, вот результаты");
        words.print();
    }

    static void instruction() {
        System.out.println("next - следующее слово");
        System.out.println("prev - предыдущее слово");
        System.out.println("random - показ случайного слова");
        System.out.println("rndNP - (random not popular) показ случайного слова среди наименее популярных");
        System.out.println("exit - выход из программы");
    }
}