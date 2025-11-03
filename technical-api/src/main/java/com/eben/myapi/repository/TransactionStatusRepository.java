package com.eben.myapi.repository;

import com.eben.myapi.model.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatus, Integer> {
}