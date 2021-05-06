package com.inetum.realdolmen.careercorner.endpoints;

import com.inetum.realdolmen.careercorner.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorModel> handleConversion(RuntimeException ex) {
        return new ResponseEntity<>((ErrorModel) null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
