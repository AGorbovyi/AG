package hw04.library;

public class Book {
    String author;
    String bookTitle;
    int pagesNumber;
    double catalogNumber;
    boolean inStorage;

    public Book(String author, String bookTitle){
        this.author = author;
        this.bookTitle = bookTitle;
    }
    public Book(String author, String bookTitle, int pagesNumber, double catalogNumber, boolean inStorage){
        this.author = author;
        this.bookTitle = bookTitle;
        this.pagesNumber = pagesNumber;
        this.catalogNumber = catalogNumber;
        this.inStorage = inStorage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", catalogNumber=" + catalogNumber +
                ", inStorage=" + inStorage +
                '}';
    }
}
