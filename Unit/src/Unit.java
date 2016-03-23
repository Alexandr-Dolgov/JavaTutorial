public class Unit {

    private Point p = new Point(0, 0);
    private double quantityHourGo;
    private double speed;
    private double angleTurn;
    private int health = 100;

//    public Unit(){
//
//    }

    public Unit(double speed) {//для записи в поле double speed значения скорости
        if (speed <= 0) {
            throw new IllegalArgumentException("speed can not be negative or zero value");
        }
        this.speed = speed;
    }

    public void go(Point point) {//принимает координату, вычисляет расстояние до новой координаты точки
        double r = Math.sqrt(Math.pow(point.x - p.x, 2) + Math.pow(point.y - p.y, 2));
        quantityHourGo = quantityHourGo + (r / speed);
        p = point;//в переменную p записали новое значение point
        System.out.println("при перемещении в точку " + "(" + point.x + ":" + point.y + ")" +
                " пройдено расстояние " + r + " за  " + quantityHourGo);
    }

    //перемещаем точку на заданное расстояние по направлению, вычисляем координаты точки
    public void goAngleTurn(double angleTurn, double quantityHourGo) {
        p.x = p.x + speed * quantityHourGo * Math.cos(angleTurn / 360);
        p.y = p.y + speed * quantityHourGo * Math.sin(angleTurn / 360);
        System.out.println("координата новой точки при перемещении в направлении " + angleTurn +
                " на " + speed * quantityHourGo + " за " + quantityHourGo + " (" + p.x + ":" + p.y + ")");
    }

    @Override
    public String toString() {
        return "quantityHourGo = " + quantityHourGo;

    }

    public double go() {
        return 0.7 + 0.9;
    }

    public double go(int i) {
        return 0.7 + 0.9;
    }


}
