public class App {

    public static void main(String[] args) {
        Book thinkingInJavaFull = new Book("Философи Java", "Брюс Экклель", 1158); //создали объект


        System.out.println(thinkingInJavaFull.getAuthor()); //вывели автора на экран

        System.out.println(thinkingInJavaFull.getQuantityPage()); //вывели  количество страниц на кран

        thinkingInJavaFull.tearOutPage(); //вырвали страницу

        System.out.println(thinkingInJavaFull.getQuantityPage()); //вывели  количество страниц на кран

        Book thinkingInJava = new Book("Философи Java", "Брюс Экклель", 700);
        Book book = new Book("Собачье сердце", "Булгаков", 200);
    }
}
