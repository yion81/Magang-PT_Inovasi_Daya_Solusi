package com.eben.myapi.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    private Integer id;
    private String productId;
    private String productName;
    private BigDecimal amount;
    private String customerName;
    @Column(name = "status_id")
    private Integer statusId;
    private LocalDateTime transactionDate;
    private String createBy;
    private LocalDateTime createOn;

    @ManyToOne
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private TransactionStatus status;
}