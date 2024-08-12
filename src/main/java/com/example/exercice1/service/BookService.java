package com.example.exercice1.service;

import org.springframework.stereotype.Service;
import com.example.exercice1.entity.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> booksList = new ArrayList<>();

    public BookService() {
        booksList.add(new Book(1, "Les Misérables", "Victor Hugo", 1862));
        booksList.add(new Book(2, "Madame Bovary", "Gustave Flaubert", 1857));
        booksList.add(new Book(3, "Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
    }

    public List<Book> getBooks() {
        return booksList;
    }

    public void createBook(Book book) {
        booksList.add(book);
    }

    public void deleteBook(int id) {
        booksList.removeIf(book -> book.getId() == id);
    }


}
