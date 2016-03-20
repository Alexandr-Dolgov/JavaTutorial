public class Unit {

    private Point p = new Point(0,0);
    private double quantityHourGo;
    private double speed;
    private double angleTurn;
    private int health = 100;

    public Unit(double speed){//для записи в поле double speed значения скорости
        if (speed <= 0) {
            throw new IllegalArgumentException("speed can not be negative or zero value");
        }
        this.speed = speed;
    }

    public void go(Point point){
        p.y = p.y + Math.sin(angleTurn/360);
        //p.x =

        double nx = 0;
        double ny = 0;
        Point np = new Point(nx, ny);
        p = np;

    }

    public double go(){
        return 0.7 + 0.9;
    }

    public double go(int i){
        return 0.7 + 0.9;
    }

    public double go(double angleTurn, double quantityHourGo){
        Point p = new Point(0,0);
//        p.x = p.x + quantityHourGo*speedMouveHour*Math.cos(angleTurn/360);
//        p.y = p.y + quantityHourGo*speedMouveHour*Math.sin(angleTurn/360);
        return 0;
    }



}
