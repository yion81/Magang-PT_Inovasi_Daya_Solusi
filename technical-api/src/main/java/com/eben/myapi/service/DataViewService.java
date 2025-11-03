package com.eben.myapi.service;

import com.eben.myapi.dto.StatusDto;
import com.eben.myapi.dto.TransactionDto;
import com.eben.myapi.dto.ViewDataResponse;
import com.eben.myapi.model.Transaction;
import com.eben.myapi.model.TransactionStatus;
import com.eben.myapi.repository.TransactionRepository;
import com.eben.myapi.repository.TransactionStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataViewService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private TransactionStatusRepository transactionStatusRepository;
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ViewDataResponse getCombinedData() {
        List<Transaction> transactions = transactionRepository.findAll();
        List<TransactionStatus> statuses = transactionStatusRepository.findAll();

        List<TransactionDto> transactionDtos = transactions.stream()
            .map(t -> {
                TransactionDto dto = new TransactionDto();
                dto.setId(t.getId());
                dto.setProductID(t.getProductId());
                dto.setProductName(t.getProductName());
                dto.setAmount(String.format("%.0f", t.getAmount()));
                dto.setCustomerName(t.getCustomerName());
                dto.setStatus(t.getStatusId());
                dto.setTransactionDate(t.getTransactionDate().format(FORMATTER));
                dto.setCreateBy(t.getCreateBy());
                dto.setCreateOn(t.getCreateOn().format(FORMATTER));
                return dto;
            }).collect(Collectors.toList());
            
        List<StatusDto> statusDtos = statuses.stream()
            .map(s -> {
                StatusDto dto = new StatusDto();
                dto.setId(s.getId());
                dto.setName(s.getName());
                return dto;
            }).collect(Collectors.toList());

        ViewDataResponse response = new ViewDataResponse();
        response.setData(transactionDtos);
        response.setStatus(statusDtos);
        
        return response;
    }
}