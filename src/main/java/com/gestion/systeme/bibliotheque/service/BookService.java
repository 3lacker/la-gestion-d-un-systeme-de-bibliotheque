package com.gestion.systeme.bibliotheque.service;

import java.util.List;
import java.util.Optional;

import com.gestion.systeme.bibliotheque.model.Book;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book updateBook(Long id, Book bookDetails);
    void deleteBook(Long id);
    
}
