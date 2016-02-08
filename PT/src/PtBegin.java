public class PtBegin extends PT {

    /**
     * <p class="ptTask">
     *     <span class="ptSpecial">Begin1°</span>.
     *     Дана сторона квадрата&nbsp;<i>a</i>.
     *     Найти его периметр&nbsp;<i>P</i>&nbsp;=&nbsp;4&#183;<i>a</i>.
     * </p>
     */
    public static void begin1() {
        double a = getDouble();
        double p = 4 * a;
        put(p);
    }

    public static void begin2() {
        double a = getDouble();
        double s = a * a;
        put(s);
    }

    /**
     * <p class="ptTask"><span class="ptSpecial">Begin3°</span>.
     * Даны стороны прямоугольника&nbsp;<i>a</i> и&nbsp;<i>b</i>.
     * Найти его площадь&nbsp;<i>S</i>&nbsp;=&nbsp;<i>a</i>&#183;<i>b</i>
     * и периметр&nbsp;<i>P</i>&nbsp;=&nbsp;2&#183;(<i>a</i>&nbsp;+&nbsp;<i>b</i>). </p>
     */
    public static void begin7() {
        double a = getDouble();
        double b = getDouble();
        double square = a * b;
        double perimeter = 2 * ( a + b );
        put(square, perimeter);
    }

    /**
     *
     */
    public static void begin4() {

    }
    public static void begin5(){
        double a = getDouble()

    }
    public  static void integer1(){

    }
}
