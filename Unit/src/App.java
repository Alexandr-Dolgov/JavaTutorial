public class App {
    public static void main(String[] args) {
        Unit u = new Unit();
        Point p = new Point();
        u.point(0.1);
        u.go(10,30);
        System.out.println("(" + p.x + ":" + p.y + ")");
        System.out.println("(" + p.x + ":" + p.y + ")");
    }
}
