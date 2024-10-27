package com.gestion.systeme.bibliotheque.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.systeme.bibliotheque.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}