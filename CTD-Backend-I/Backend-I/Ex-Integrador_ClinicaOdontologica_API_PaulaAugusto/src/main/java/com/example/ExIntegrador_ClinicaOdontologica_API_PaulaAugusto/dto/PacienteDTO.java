package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private Integer idade;
    private Integer idEndereco;

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.sobrenome = paciente.getSobrenome();
        this.email = paciente.getEmail();
        this.idade = paciente.getIdade();
        this.idEndereco = paciente.getEndereco().getId();
    }
}
