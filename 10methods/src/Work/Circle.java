package Work;

public class Circle {
    //Класс Work.Circle
    //статические методы помогающие вычислять разные параметры окружности, каждый метод принимает double radius
    //сделать метод возвращающий
    //01 диаметр
    //02 длину
    //03 площадь
    public static void main(String[] args) {//
        System.out.println("диаметр окружности = " + Circle.diameterCircle(3));
        System.out.println("длина окружности = " + Circle.lengthCircle(6));
        System.out.println("площадь окружности = " + Circle.areaCircle(5));
    }

    static int diameterCircle(int radiusCircle) {
        return 2 * radiusCircle;
    }

    static double lengthCircle(int radiusCircle) {
        return 2 * 3.14 * radiusCircle;//константа

    }

    static double areaCircle(int radiusCircle) {
        return 3.14 * radiusCircle * radiusCircle;
    }

}
