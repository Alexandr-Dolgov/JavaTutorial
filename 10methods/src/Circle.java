public class Circle {
    //Класс Circle
    //статические методы помогающие вычислять разные параметры окружности, каждый метод принимает double radius
    //сделать метод возвращающий
    //01 диаметр
    //02 длину
    //03 площадь
    public static void main(String[] args) {
        Circle.diameterCircle(3);
        Circle.lengthCircle(6);
        Circle.areaCircle(5);

    }

    static void diameterCircle(int radiusCircle) {
        int diameterCircle = 2 * radiusCircle;
        System.out.println(diameterCircle);
    }

    static void lengthCircle(int radiusCircle) {
        double lengthCircle = 2 * 3.14 * radiusCircle;//константа
        System.out.println(lengthCircle);
    }

    static void areaCircle(int radiusCircle) {
        double areaCircle = 3.14 * radiusCircle * radiusCircle;
        System.out.println(areaCircle);
    }

}
