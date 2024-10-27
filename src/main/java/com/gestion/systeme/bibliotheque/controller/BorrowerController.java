package com.gestion.systeme.bibliotheque.controller;

import com.gestion.systeme.bibliotheque.model.Borrower;
import com.gestion.systeme.bibliotheque.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping
    public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower borrower) {
        Borrower newBorrower = borrowerService.addBorrower(borrower);
        return ResponseEntity.ok(newBorrower);
    }

    @GetMapping
    public ResponseEntity<List<Borrower>> getAllBorrowers() {
        List<Borrower> borrowers = borrowerService.getAllBorrowers();
        return ResponseEntity.ok(borrowers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Borrower> getBorrowerById(@PathVariable Long id) {
        Borrower borrower = borrowerService.getBorrowerById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
        return ResponseEntity.ok(borrower);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Borrower> updateBorrower(@PathVariable Long id, @RequestBody Borrower borrowerDetails) {
        Borrower updatedBorrower = borrowerService.updateBorrower(id, borrowerDetails);
        return ResponseEntity.ok(updatedBorrower);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorrower(@PathVariable Long id) {
        borrowerService.deleteBorrower(id);
        return ResponseEntity.noContent().build();
    }
}