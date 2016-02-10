import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();   //генерирует случайный int, границы естественно те жи что у int
        System.out.println(i);

        //bound - граница, bounded value - ограниченная величина
        int boundedValue = random.nextInt(12);  //выдает случайный int от 0 включая до 12 не включая [0, 12)
        System.out.println(boundedValue);

        double d = random.nextDouble();
        System.out.println(d);
    }

}
