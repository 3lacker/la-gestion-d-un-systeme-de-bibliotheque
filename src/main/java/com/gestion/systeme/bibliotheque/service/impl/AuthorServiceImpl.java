package com.gestion.systeme.bibliotheque.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion.systeme.bibliotheque.model.Author;
import com.gestion.systeme.bibliotheque.repository.AuthorRepository;
import com.gestion.systeme.bibliotheque.service.AuthorService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
    @Override

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    @Override

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }
    @Override

    public Author updateAuthor(Long id, Author authorDetails) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        author.setName(authorDetails.getName());
        author.setBiography(authorDetails.getBiography());
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}