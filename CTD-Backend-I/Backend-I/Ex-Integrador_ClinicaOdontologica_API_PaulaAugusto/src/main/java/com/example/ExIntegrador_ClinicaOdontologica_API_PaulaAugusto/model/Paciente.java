package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private Integer idade;
    private Endereco endereco;
    private Integer idEndereco;
}
