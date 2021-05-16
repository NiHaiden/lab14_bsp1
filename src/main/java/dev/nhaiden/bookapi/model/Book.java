package dev.nhaiden.bookapi.model;

import java.io.Serializable;
import java.util.Objects;


public class Book implements Serializable {
    private String isbn;
    private double preis;
    private String titel;
    private String author;

    private Book() {}

    public Book(String isbn, double preis, String titel, String author) {
        this.isbn = isbn;
        this.preis = preis;
        this.titel = titel;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", preis=" + preis +
                ", titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

