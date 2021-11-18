package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto.PacienteDTO;
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

    public Paciente(){}

    public Paciente(PacienteDTO pacienteDTO, Endereco endereco) {
        this.id = pacienteDTO.getId();
        this.nome = pacienteDTO.getNome();
        this.sobrenome = pacienteDTO.getSobrenome();
        this.email = pacienteDTO.getEmail();
        this.idade = pacienteDTO.getIdade();
        this.endereco = endereco;
    }
}
