package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro Java";
        book.author = "Tolga YIGIT";
        book.price = 399.99;
        book.type = "Education Set";
        System.out.println(book.title + " " + book.author + " " + book.price + " " + book.type);
        AudioBook audioBook = new AudioBook();

        Ebook ebook = new Ebook();
    }
}
