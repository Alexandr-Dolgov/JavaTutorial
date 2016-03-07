import java.util.Scanner;
//перейти на switch
//класс Words инкапсулирующий работу с массивом
//добавить показ случайного (random)
//добавить показ случайного среди тех, у кого количество показов наименьшее
//добавление слова через пользовательский интерфейс


public class App {
    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        instruction();
        String input = scanner.next();


        while (!input.equals("exit")) {

//            if (input.equals("eng")){//выбор языка
//                boolean onRus = true;
//                if (onRus) {
//                    words.language();
//                }
//            }



            switch (input) {

                case "next":
                    words.displayNext();
                    break;
                case "prev":
                    words.displayPrev();
                    break;
                case "rand":
                    words.displayRandom();
                    break;
                case "rnd":
                    words.displayRandomNotPopular();
                    break;
                default:
                    System.out.println("некорректный ввод");
                    instruction();
                    break;
            }
            input = scanner.next();
        }
        System.out.println("программа завершена, вот...");
        words.print();
    }

    static void instruction() {
        System.out.println("next - следующее слово");
        System.out.println("prev - предыдущее слово");
        System.out.println("rand - случайное слово");
        System.out.println("exit - выход из программы");
    }
}
