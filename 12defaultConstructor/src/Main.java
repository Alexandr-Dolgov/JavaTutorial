public class Main {

    public static void main(String[] args) {
        DefaultValue d1 = new DefaultValue(); //вызываем конструктор без аргументов (конструктор по умолчанию)
        DefaultValue d2 = d1;
        d1 = null;  //говорим что ссылка b1 ни на что не ссылается

        InitialValue i1 = new InitialValue();


    }

}
