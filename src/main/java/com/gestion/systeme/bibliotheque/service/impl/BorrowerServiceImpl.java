package com.gestion.systeme.bibliotheque.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion.systeme.bibliotheque.model.Borrower;
import com.gestion.systeme.bibliotheque.repository.BorrowerRepository;
import com.gestion.systeme.bibliotheque.service.BorrowerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {

    private final BorrowerRepository borrowerRepository;

    @Override
    public Borrower addBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    @Override
    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    @Override
    public Optional<Borrower> getBorrowerById(Long id) {
        return borrowerRepository.findById(id);
    }

    @Override
    public Borrower updateBorrower(Long id, Borrower borrowerDetails) {
        Borrower borrower = borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
        borrower.setName(borrowerDetails.getName());
        borrower.setContactInfo(borrowerDetails.getContactInfo());
        return borrowerRepository.save(borrower);
    }

    @Override
    public void deleteBorrower(Long id) {
        borrowerRepository.deleteById(id);
    }
}