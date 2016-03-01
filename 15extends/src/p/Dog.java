package p;

public class Dog extends Object {

    public String color;
    private int age;
    protected double weight;

    public String toString() {
        return "color = " + color + ", age = " + age + ", weight = " + weight;
    }

    public void run(){
        System.out.println("я бегу");
    }
}
