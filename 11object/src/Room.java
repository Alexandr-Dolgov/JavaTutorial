public class Room {
    //01 создать 3 класса каких нибудь вещей вокруг нас
    //у каждого класса должно быть от двух до пяти полей
    //у каждого класса должно быть от одного до пяти методо

    int door;
    int window;
    String color;
    double aria;
    int number;

    void harvest() {
    }

    void sale() {
    }

    void cooling() {
    }

    void aeration() {
    }

    Room(int d, int w, String c, double a, int n) {
        door = d;
        window = w;
        color = c;
        aria = a;
        number = n;
    }
    Room(int d){
        door = d;
    }

}
