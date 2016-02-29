import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

//адание на методы и работу с массивами объектов
//        Класс Word
//
//        с двумя полями
//private String word
//private int quantityDisplays
//
//        одним конструктором принимающим слово
//public Word(String word)
//
//
//        Класс App с точкой входа
//        где будет инициализировать массив объектов типа Word
//
//        затем в "бесконечном" цикле while будем считывать с клавиатуры
//        exit - выход из программы
//        next - следующее слово
//        prev - предыдущее слово
//        что-то другое - некорректный ввод и говорим какой ввод допустим
//
//        Если пользователь дошел до конца массива не выбрасывать исключение а продолжать показ с 0 ячейки массива

public class App {
    /*
    Программа выполняет:
    - выбор языка на котором выводить слова (нет в задании)
    - выводит слова в прямой и обратной последовательности
    - выводит перевод слова (нет в задании)
    - при неправильном вводе комкнд выводит подсказку
    - при выходе из программы показывает статистику
     */

    public static void main(String[] args) {
        Word[] words = initialization();
        int index = 0;
        System.out.println("en - English\n" +
                "ru - Russian\n");

        //Word word = words [index] ;
        //System.out.println(word.english);

        Scanner scanner = new Scanner(System.in);
        String inputLanguage = scanner.next();
        for (int i = 0; i < 3; i++) {
            if (inputLanguage.equals("en")) {
                System.out.println("exit - выход из программы\n" +
                        "next - следующее слово\n" +
                        "prev - предыдущее слово\n" +
                        "trl - перевод слова\n" +
                        " ");
                words[index].displayEn();
                break;
            } else if (inputLanguage.equals("ru")) {
                System.out.println("exit - выход из программы\n" +
                        "next - следующее слово\n" +
                        "prev - предыдущее слово\n" +
                        "trl - перевод слова\n" +
                        " ");
                words[index].displayRus();
                break;
            } else {
                System.out.println("некорректный ввод! введите en или ru");
            }
            inputLanguage = scanner.next();
        }

        String input = scanner.next();
        while (!input.equals("exit")) {
            if (input.equals("next")) {
                if (index == words.length - 1) {
                    index = 0;
                } else {
                    index++;
                }

                if (inputLanguage.equals("en")) {
                    words[index].displayEn();
                } else if (inputLanguage.equals("ru")) {
                    words[index].displayRus();
                }
                //words[index].displayEn();

            } else if (input.equals("trl")) {
                if (inputLanguage.equals("ru")) {
                    words[index].displayEn();
                } else if (inputLanguage.equals("en")) {
                    words[index].displayRus();
                }
                //words[index].displayRus();
            } else if (input.equals("prev")) {
                if (index == 0) {
                    index = words.length - 1;
                } else {
                    index--;
                }

                if (inputLanguage.equals("en")) {
                    words[index].displayEn();
                } else if (inputLanguage.equals("ru")) {
                    words[index].displayRus();
                }
                //words[index].displayEn();

            } else {
                System.out.println("некорректный ввод! введите...\n" +
                        "exit - выход из программы\n" +
                        "next - следующее слово\n" +
                        "prev - предыдущее слово\n" +
                        "trl - перевод слова");
            }
            input = scanner.next();

        }
        System.out.println("программа завершена, вот...");
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
                new Word("мир", "world", true),
                new Word("привет", "hello", false),
                new Word("кто", "who", true),
                new Word("что", "what", true),
                new Word("мед", "honey", false)
        };
        return words;
    }


}
