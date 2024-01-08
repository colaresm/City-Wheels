package com.cwt.citywheels.dto;


import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@ToString
public class ClientCreateRequest {
    @NotBlank(message = "O campo nome não pode ser vazio")
    @Size(min=3,max=60, message = "O comprimento do nome informado deve estar entre {min} e {max}")
    private String name;

    @Email(message = "Email inválido")
    @Size(min=3,max=60, message = "O comprimento do email informado deve estar entre {min} e {max}")
    private String email;

    private LocalDate birthDate;
    @CPF(message = "CPF inválido")
    private String CPF;

}
