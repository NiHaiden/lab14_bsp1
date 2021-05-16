package dev.nhaiden.bookapi;

import dev.nhaiden.bookapi.model.Book;
import dev.nhaiden.bookapi.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class BookapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookapiApplication.class, args);
    }
}
