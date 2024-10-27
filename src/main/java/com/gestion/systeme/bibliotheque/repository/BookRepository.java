package com.gestion.systeme.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.systeme.bibliotheque.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}