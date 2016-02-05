import java.util.Scanner;

public class InputPrimitiveDataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        System.out.print("d = ");
        System.out.println(d);

        byte aByte = scanner.nextByte();
        System.out.print("aByte = ");
        System.out.println(aByte);

        short s = scanner.nextShort();
        System.out.print("s = ");
        System.out.println(s);

        int i = scanner.nextInt();
        System.out.print("i = ");
        System.out.println(i);

        long l = scanner.nextLong();
        System.out.print("l = ");
        System.out.println(l);

        float f = scanner.nextFloat();
        System.out.print("f = ");
        System.out.println(f);

        boolean aBoolean = scanner.nextBoolean();
        System.out.print("aBoolean = ");
        System.out.println(aBoolean);

        //char c = scanner.nextChar ()  //у класса Scanner нет метода считывающего единственный символ с клавиатуры
    }
}
