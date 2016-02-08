public class Array {
    public static void main(String[] args) {

        //типДанных[] имяМассива = new типДанных[количествоЭлементов]
        //количествоЭлементов - целое число >= 0

        System.out.println("array of int");
        int[] a = new int[3];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        int length = 123;
        int[] a2 = new int[length];     //в качестве количестваЭлементов массива
        // можно использовать переменные типа int, short, byte

        //OutOfMemoryError
        int size = 987_123_456;    //java language level 7
        //int[] a3 = new int[size];

        //ошибка компиляции
        //long не допустим для количестваЭлементов массива
        long l = 10;
        //int[] a4 = new int[l];

        byte b = 1;
        int[]a5 = new int[b];

        System.out.println("array of double");
        double[] a6 = new double[2];
        System.out.println(a6[0]);
        System.out.println(a6[1]);

        //обращение к элементу массива
        //имяМассива[индекс]

        int i = a[0];   //присваиваем в переменнуд i нулевой элемент массива a
        //присваиваем в переменнуд i элемент массива a с номером(индексом) 0
        System.out.println(i);

        //заполнить элемент массива
        a[0] = 123;
        System.out.println(a[0]);

    }
}
