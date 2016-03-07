import java.util.Scanner;
//перейти на switch
//класс Words инкапсулирующий работу с массивом
//добавить показ случайного (random)
//добавить показ случайного среди тех, у кого количество показов наименьшее
//добавление слова через пользовательский интерфейс


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ведите eng или rus");

        String inputEng = scanner.next();
        Words words;
        switch (inputEng){
            case "eng": words = new Words(false); break;
            case "rus": words = new Words(true); break;
            default: System.out.println("некорректный ввод, перезапустите программу и попробуйте еще раз"); return;
        }

        String input = scanner.next();
          //Ctrl + B, Ctrl + LKM
        instruction();
        while (!input.equals("exit")) {
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
