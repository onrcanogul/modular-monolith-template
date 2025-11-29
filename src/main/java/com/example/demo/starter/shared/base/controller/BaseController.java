package com.example.demo.starter.shared.base.controller;

import com.example.demo.starter.shared.common.response.ServiceResponse;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected <T> ResponseEntity<ServiceResponse<T>> controllerResponse(ServiceResponse<T> response) {
        return ResponseEntity
                .status(response.getStatusCode())
                .body(response);
    }
}
