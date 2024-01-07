package com.cwt.citywheels.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class ClientCreateRequest {
    @NotBlank(message = "O campo nome não deve estar em branco")
    private String name;

}
