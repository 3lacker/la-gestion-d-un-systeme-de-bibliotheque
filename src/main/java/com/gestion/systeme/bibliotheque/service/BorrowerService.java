package com.gestion.systeme.bibliotheque.service;

import com.gestion.systeme.bibliotheque.model.Borrower;

import java.util.List;
import java.util.Optional;

public interface BorrowerService {
    Borrower addBorrower(Borrower borrower);
    List<Borrower> getAllBorrowers();
    Optional<Borrower> getBorrowerById(Long id);
    Borrower updateBorrower(Long id, Borrower borrowerDetails);
    void deleteBorrower(Long id);
}