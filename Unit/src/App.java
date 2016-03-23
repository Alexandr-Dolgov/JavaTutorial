public class App {

    public static void main(String[] args) {
        double speed = 10;
        Unit u = new Unit(speed);// вызов конструктора, передавая переменную типа double. Конструктор отработав передает управление и записывает в прем u

        Point p = new Point(1.0, 2.0);//вызов конструктора, с аргументами
        u.go(new Point(5.0, 5.0));//вызов метода go, котрый вызывает конструктор Point и передает в него значение
        u.goAngleTurn(0.25, 6.0);//вызов метода go1, передает значение угла поворота 0.25 и времени 6, крость передается через конструктор
        u.goAngleTurn(0.5, 6.0);
        u.goAngleTurn(0.75, 6.0);
        u.goAngleTurn(0, 6.0);

        double g = u.go();
        System.out.println(g);

        System.out.println(u);

    }

    public void m() {
    }

}
