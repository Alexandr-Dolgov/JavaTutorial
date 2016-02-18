public class Main {

    public static void main(String[] args) {
        Notebook n1 = new Notebook(2048, 2.47, true);//n1 - instance - экземпляр
        Notebook n2 = new Notebook(512, 1.47, false);
        Notebook n3 = new Notebook(64, 5.47, true);

        n3.turnOff();

        //в классе Main в методе main создать по 2 экземпляра каждого объекта с различными состояниями
        //повызывать методы созданных объектов

        Car c1 = new Car(150, 1, "weith", 150.00, "Mers");
        Car c2 = new Car("while","Mers");

        c1.powerMax();
        c2.topSpeed();

        Room r1 = new Room(5, 5, "waith", 100, 5);
        Room r2 = new Room(5);

        r1.harvest();
        r2.sale();

    }

}
