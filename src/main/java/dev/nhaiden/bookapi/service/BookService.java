package dev.nhaiden.bookapi.service;

import dev.nhaiden.bookapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public static List<Book> getBooks() {
        Book b1 = new Book("A123456789", 9.99, "Bibi Blocksberg", "Irgendwer");
        Book b2 = new Book("B123456789", 4.99, "Kochen mit Wumms", "Anonymous");
        Book b3 = new Book("C123456789", 3.99, "Kinderlieder mit Bernhard Fibich", "Bernhard Fibich");
        Book b4 = new Book("D123456789", 4.99, "Spring Boot Essentials", "Baeldung");
        Book b5 = new Book("E123456789", 4.99, "Bibi Blocksberg 2", "Baeldung");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        return books;
    }
}
