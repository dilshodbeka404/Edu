package algoritms;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class ForList {

    public static void main(String[] args) {
        final List<Book> books = new ArrayList<>();
        books.add(new Book("O'tgan kunlar", "Abdulla Qodriy", 60000.00));
        books.add(new Book("Mehrobdan Chayon", "Cho'lpon", 50000.00));
        books.add(new Book("Navoiy", "Oybek", 45000.00));

        System.out.printf("books" + books);

        for (Book book : books) {
            book.setPrice(book.getPrice() / 100);
        }
        System.out.printf("\nbooks" + books);

        List<String> stringList = new ArrayList<>(2);
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        for (String s : stringList) {
            System.out.println(s);
        }
    }

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    static class Book {
        private String name;
        private String author;
        private Double price;
    }

}
