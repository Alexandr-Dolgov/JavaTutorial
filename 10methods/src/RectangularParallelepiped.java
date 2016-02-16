public class RectangularParallelepiped {
    //Класс ПрямоугольныйПараллепипед
    //каждый метод принимает три стороны
    //01 периметр
    //02 объем
    //03 площадь
    public static void main(String[] args) {
        RectangularParallelepiped.perimeterRectangularParallelepiped(1, 4, 5);
        RectangularParallelepiped.volumeRectangularParallelepiped(6, 7, 8);
        RectangularParallelepiped.areaRectangularParallelepiped(5, 5, 7);
    }

    static void perimeterRectangularParallelepiped(int sideA, int sideB, int sideC) {
        int perimeter = sideA + sideB + sideC;
        System.out.println("периметр = " + perimeter);
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
