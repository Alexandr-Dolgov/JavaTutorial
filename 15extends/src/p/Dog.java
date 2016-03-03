package p;

public class Dog extends Object {

    public String color = "black";
    private int age;
    protected double weight;

    @Override //annotation - аннотации
    public String toString() {
        return "color = " + color + ", age = " + age + ", weight = " + weight;
    }

    public void run(){
        System.out.println("я бегу");
    }

    /* ошибка компиляции нельзя переопредилять final методы
    public Class<?> getClass() {
        return Object;
    }
    */
}
