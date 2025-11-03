package com.eben.myapi.dto;
import java.util.List;
import lombok.Data;
@Data
public class ViewDataResponse {
    private List<TransactionDto> data;
    private List<StatusDto> status;
}