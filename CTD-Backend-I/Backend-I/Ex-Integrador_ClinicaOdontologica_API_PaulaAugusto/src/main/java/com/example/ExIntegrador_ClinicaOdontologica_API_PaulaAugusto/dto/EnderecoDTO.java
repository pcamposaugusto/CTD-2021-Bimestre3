package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {
    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
    }
}
