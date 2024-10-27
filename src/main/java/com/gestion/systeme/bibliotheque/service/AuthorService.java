package com.gestion.systeme.bibliotheque.service;

import java.util.List;
import java.util.Optional;

import com.gestion.systeme.bibliotheque.model.Author;

public interface AuthorService {
    List<Author> getAllAuthors();
    Optional<Author> getAuthorById(Long id);
    Author updateAuthor(Long id, Author authorDetails);
    void deleteAuthor(Long id);
    Author addAuthor(Author author);
}
