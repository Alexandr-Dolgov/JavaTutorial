public class Car {
    //01 создать 3 класса каких нибудь вещей вокруг нас
    //у каждого класса должно быть от двух до пяти полей
    //у каждого класса должно быть от одного до пяти методов

    int power;
    int age;
    String color;
    double topSpeed;
    String modelBasket;

    void powerMax() {
    }

    void age() {
    }

    void color() {
    }

    void topSpeed() {
    }

    void modeBasket() {
    }

    Car(int p, int a, String c, double t, String m) {
        power = p;
        age = a;
        color = c;
        topSpeed = t;
        modelBasket = m;
    }
    Car(String c, String m){
        color =c;
        modelBasket =m;

    }

    public static class Main {

        public static void main(String[] args) {
            Notebook n1 = new Notebook(2048, 2.47, true);//n1 - instance - экземпляр класса
            Notebook n2 = new Notebook(512, 1.47, false);
            Notebook n3 = new Notebook(64, 5.47, true);


            System.out.println(n1.weight);

            n3.turnOff();

            //в классе Car.Main в методе main создать по 2 экземпляра каждого объекта с различными состояниями
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


}
