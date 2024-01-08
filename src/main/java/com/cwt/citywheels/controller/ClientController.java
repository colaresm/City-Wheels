package com.cwt.citywheels.controller;


import com.cwt.citywheels.dto.ClientCreateRequest;

import exception.GlobalExceptionHandler;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequestMapping(value = "api/clients")
public class ClientController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  create(@RequestBody @Valid ClientCreateRequest request) {

        //return new ResponseEntity<>(HttpStatus.CREATED);

    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
    return  new ResponseEntity<>(GlobalExceptionHandler.extractValidationErrorMessages(ex),HttpStatus.BAD_REQUEST);
    }

}
