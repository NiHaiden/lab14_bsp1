package dev.nhaiden.bookapi.rest;

import dev.nhaiden.bookapi.model.Book;
import dev.nhaiden.bookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAll() {
        return BookService.getBooks();
    }

    @GetMapping("/book/{pattern}")
    public List<Book> getBookByISBN(@PathVariable String pattern) {
        return BookService.getBooks().stream().
                filter(b -> b.getTitel().contains(pattern))
                .collect(Collectors.toList());
    }
}
