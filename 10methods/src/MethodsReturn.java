public class MethodsReturn {

    public static void main(String[] args) {
        System.out.println(MethodsReturn.calcSquarePerimeter(3) + 1);

        System.out.println(Rectangle.square(3, 5));
    }

    static int calcSquarePerimeter(int a) {
        return a * 4;
    }

}
