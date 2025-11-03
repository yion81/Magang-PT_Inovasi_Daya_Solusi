package com.eben.myapi.controller;

import com.eben.myapi.dto.ViewDataResponse;
import com.eben.myapi.service.DataViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataViewController {
    @Autowired
    private DataViewService dataViewService;

    @GetMapping("/viewdata")
    public ResponseEntity<ViewDataResponse> getViewData() {
        ViewDataResponse response = dataViewService.getCombinedData();
        return ResponseEntity.ok(response);
    }
}