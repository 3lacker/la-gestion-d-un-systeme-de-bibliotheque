package com.gestion.systeme.bibliotheque.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion.systeme.bibliotheque.model.Book;
import com.gestion.systeme.bibliotheque.repository.BookRepository;
import com.gestion.systeme.bibliotheque.service.BookService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Service
@Slf4j
public class BookServiceImpl implements BookService {

    
    private final BookRepository bookRepository;

    
    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    @Override
    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setIsbn(bookDetails.getIsbn());
        book.setAuthor(bookDetails.getAuthor());
        book.setAvailabilityStatus(bookDetails.isAvailabilityStatus());
        return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}