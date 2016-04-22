public class Book {

    private boolean isOpen;
    private int quantityPage;
    private String author;
    private String title;

    public Book(String title, String author, int quantityPage) {
        this.title = title;
        this.author = author;
        this.quantityPage = quantityPage;
        isOpen = false;
    }

    public void close() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    //getter (тип метода) такие мотоды возвращают значение поля
    public String getAuthor() {
        return author;
    }

    public void tearOutPage() {
        quantityPage = quantityPage - 1;
    }

    public int getQuantityPage() {
        return quantityPage;
    }
}
