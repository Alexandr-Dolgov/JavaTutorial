public class Cuboid {
    //Класс ПрямоугольныйПараллепипед
    //каждый метод принимает три стороны
    //01 периметр
    //02 объем
    //03 площадь
    public static void main(String[] args) {
        System.out.println("периметр = " + Cuboid.perimeter(1, 4, 5));

        Cuboid.volumeRectangularParallelepiped(6, 7, 8);
        Cuboid.areaRectangularParallelepiped(5, 5, 7);
    }

    static int perimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    static void volumeRectangularParallelepiped(int sideA, int sideB, int sideC) {
        int volume = sideA * sideB * sideC;
        System.out.println("объем = " + volume);
    }

    static void areaRectangularParallelepiped(int sideA, int sideB, int sideC) {
        int volume = sideA * sideB * sideC * 4;
        System.out.println("площадь = " + volume);
    }
}
