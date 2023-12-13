package hw04.library;

public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book("Lev Tolstoy", "War and Peace");
        System.out.println(book1.author);
        System.out.println(book1.bookTitle);
        System.out.println(book1);

        Book book2 = new Book("Mark Twain", "The Adventures of Tom Sawyer", 200, 1001.7, true);
        System.out.println(book2.author);
        System.out.println(book2.bookTitle);
        System.out.println(book2.pagesNumber);
        System.out.println(book2.catalogNumber);
        System.out.println(book2.inStorage);
        System.out.println(book2);

        BookUtil util = new BookUtil();

        util.editBookCatalogNumber(9875.45, book2);
        util.editBookPageNumber(280, book2);
        util.editBookInStorage(true, book2);

        System.out.println("===========");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("===========");

        Book book3 = book1;

        // НЕ РАБОТАЕТ!!! НЕ СОЗДАЕТСЯ НОВЫЙ ОБЪЕКТ А КОПИРУЕТСЯ ССЫЛКА!!!!
        System.out.println(book3);

        book3.bookTitle = "Д'Артаньян";

        System.out.println(book3);

        System.out.println("===========");

        System.out.println(book1);

        // как работает наш метод копирования

        Book book4 = util.copyBook(book2);

        System.out.println(book4);

        // другой альтернативный способ копирования

        Book book5 = new Book(book3.author + " (copy)", book3.bookTitle,book3.pagesNumber, book3.catalogNumber, book3.inStorage);

        util.editBookCatalogNumber(1768746.1356, book5);

        System.out.println(book5);




    }
}
