package com.Pranjal.ExpenseTracker.repository;

import com.Pranjal.ExpenseTracker.entity.Transaction;
import com.Pranjal.ExpenseTracker.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findByWallet(Wallet wallet);
}
