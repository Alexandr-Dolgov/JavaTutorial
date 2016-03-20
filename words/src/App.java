import java.util.Scanner;
//перейти на switch
//класс Dictionary инкапсулирующий работу с массивом
//добавить показ случайного (random)
//добавить показ случайного среди тех, у кого количество показов наименьшее
//добавление слова через пользовательский интерфейс


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите eng или rus");
        String inputEng = scanner.next();
        Dictionary words;

        switch (inputEng) {
            case "eng":words = new Dictionary(false);break;
            case "rus":words = new Dictionary(true);break;
            default:
                System.out.println("некорректный ввод, перезапустите программу и попробуйте еще раз");
                return;
        }
        instruction();
        String input = scanner.next();
        //Ctrl + B, Ctrl + LKM
        while (!input.equals("exit")) {
            switch (input) {
                case "next": words.displayNext(); break;
                case "prev": words.displayPrev(); break;
                case "rand": words.displayRandom() ;break;
                case "rnd": words.displayRandomNotPopular(); break;
                case "add":
                    System.out.println("введите слово на русском");
                    String rus = scanner.next();
                    System.out.println("введите слово на английском");
                    String eng = scanner.next();
                    System.out.println("состояние слова на русском?: true/false");
                    boolean onRus = scanner.nextBoolean();
                    words.addWord(rus, eng, onRus);
                    break;
                default:
                    System.out.println("некорректный ввод");
                    System.out.println(new Object[23]);
                    instruction();
                    break;
            }
            input = scanner.next();//используем через объект
        }
        System.out.println("программа завершена, вот результат:");
        words.print();
    }
    static void instruction() {
        System.out.println("next - следующее слово");
        System.out.println("prev - предыдущее слово");
        System.out.println("rand - случайное слово");
        System.out.println("rnd - добавить показ случайного среди тех, у кого количество показов наименьшее");
        System.out.println("exit - выход из программы");
    }


}