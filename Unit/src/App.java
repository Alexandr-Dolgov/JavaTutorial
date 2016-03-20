public class App {

    public static void main(String[] args) {
        double speed = 10;
        Unit u = new Unit(speed);

        double g = u.go();
        System.out.println(g);

        Point p = new Point(1, 2);
        u.go(new Point(1.0,1.0));
        u.go(10,30);
        u.go(10.1, 11.1);

        System.out.println("(" + p.x + ":" + p.y + ")");
        System.out.println("(" + p.x + ":" + p.y + ")");
    }

    public void m(){}
}
