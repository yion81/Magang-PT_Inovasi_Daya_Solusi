package com.eben.myapi.dto;
import lombok.Data;
@Data
public class TransactionDto {
    private int id;
    private String productID;
    private String productName;
    private String amount;
    private String customerName;
    private int status;
    private String transactionDate;
    private String createBy;
    private String createOn;
}