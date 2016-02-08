public class Final {
    public static void main(String[] args) {
        final int i = 0;    //объявления и инициализации константы
        System.out.println(i);
        //i = 3;    //если убрать коммент - ошибка компиляция
        System.out.println(i);

        //полезно для математических констант и других вещей которые не могут изменяться
        double pi = Math.PI;
    }
}
