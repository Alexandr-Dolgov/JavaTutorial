package word;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Word[] words = initialization();

        int index = 0;
        words[index].display();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.equals("exit")) {
            if (input.equals("next")) {
                if (index == words.length - 1) {
                    index = 0;
                } else {
                    index++;
                }
                words[index].display();
            } else if (input.equals("prev")) {
                if (index == 0) {
                    index = words.length - 1;
                } else {
                    index--;
                }
                words[index].display();
            } else {
                //что-то другое - некорректный ввод и говорим какой ввод допустим
                System.out.println("некорректный ввод");
            }
            input = scanner.next();
        }
        System.out.println("программа завершена, вот результаты");
        printWords(words);
    }

    static void printWords(Word[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(i + ": ");
            words[i].println();
        }
    }

    static Word[] initialization() {
        Word[] words = {
                new Word("привет"),
                new Word("пока"),
                new Word("объект"),
                new Word("экземпляр"),
                new Word("класс")
        };
        return words;
    }

}
