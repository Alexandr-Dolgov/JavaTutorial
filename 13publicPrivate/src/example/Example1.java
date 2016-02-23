package example;

public class Example1 {

    int f;

    private void privatePrint() {
        System.out.println("privatePrint");
    }

    public void print() {
        System.out.println("print");

        privatePrint();

        Example2 ex2 = new Example2();
        ex2.e = 1;

        System.out.println(ex2.e);
    }
}
