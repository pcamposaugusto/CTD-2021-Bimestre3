package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
}
