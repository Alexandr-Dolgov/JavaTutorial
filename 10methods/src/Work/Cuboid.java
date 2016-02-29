package Work;

public class Cuboid {
    //Класс ПрямоугольныйПараллепипед
    //каждый метод принимает три стороны
    //01 периметр
    //02 объем
    //03 площадь
    public static void main(String[] args) {//изменил название переменных, сделал методы возвращаемые
        System.out.println("периметр ПрямоугольныйПараллепипед = " + Cuboid.perimeter(1, 4, 5));
        System.out.println("объем ПрямоугольныйПараллепипед = " + Cuboid.volumeRectangularParallelepiped(6, 7, 8));
        System.out.println("площадь ПрямоугольныйПараллепипед = " + Cuboid.areaRectangularParallelepiped(5, 5, 7));
    }

    static int perimeter(int sideA, int sideB, int sideC) {

        return sideA + sideB + sideC;
    }

    static int volumeRectangularParallelepiped(int sideA, int sideB, int sideC) {
        return sideA * sideB * sideC;

    }

    static int areaRectangularParallelepiped(int sideA, int sideB, int sideC) {
        return sideA * sideB * sideC * 4;
    }
}
