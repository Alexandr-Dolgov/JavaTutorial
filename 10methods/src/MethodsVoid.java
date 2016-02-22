public class MethodsVoid {

    public static void main(String[] args) {
        double d = Math.pow(2, 4);
        System.out.println(d);

        //вызов метода без аргументов
        MethodsVoid.my();

        //вызов метода принимающего 1 аргумент типа int
        MethodsVoid.printHello(2);

        //вызов метода принимающего 2 аргумента String, int
        MethodsVoid.print("Работает метод с двумя аргументами", 3);
    }

    static void my() {

        System.out.println("привет из метода my()");
    }

    static void printHello(int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.println("hello");
        }
    }

    static void print(String s, int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.println(s);
        }
    }
}

