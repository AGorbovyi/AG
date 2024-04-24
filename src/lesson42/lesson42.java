package lesson42;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class lesson42 {
    public static void main(String[] args) {
        LibraryBookRepository repository = new LibraryBookRepository();
        repository.init();
        Collection<LibraryBook> books = repository.values();
        books.forEach(System.out::println);

        long count = 0;
        Iterator<LibraryBook> iterator = books.iterator();
        while (iterator.hasNext()){
            LibraryBook book = iterator.next();
            if (book.getGenre().equals("Poetry")) {
                count++;
            }
        }
        System.out.println(count);

        // using stream
        count = books.stream()
                .filter(b -> b.getGenre().equals("Poetry"))
                .count();
        System.out.println(count);

        // using stream v2
        List<LibraryBook> list = books.stream()
                .filter(b -> b.getAuthor().equals("Ivan Franko"))
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        // using stream v2
        List<String> listBook = books.stream()
                .filter(b -> b.getAuthor().equals("Ivan Franko"))
                .map(b -> b.getBookTitle())
                .collect(Collectors.toList());
        listBook.forEach(System.out::println);
    }
}
