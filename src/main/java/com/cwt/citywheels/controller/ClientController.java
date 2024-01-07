package com.cwt.citywheels.controller;


import com.cwt.citywheels.dto.ClientCreateRequest;
import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Validated
@RestController
@RequestMapping(value = "api/clients")
public class ClientController {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> create(@RequestBody ClientCreateRequest request) {
        return ResponseEntity.ok("Cliente criado com sucesso");
    }

}
