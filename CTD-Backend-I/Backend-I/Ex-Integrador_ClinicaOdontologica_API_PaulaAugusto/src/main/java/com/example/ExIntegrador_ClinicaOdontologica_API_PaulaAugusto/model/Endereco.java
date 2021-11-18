package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto.EnderecoDTO;
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

    public Endereco(){}

    public Endereco(EnderecoDTO enderecoDTO) {
        this.id = enderecoDTO.getId();
        this.rua = enderecoDTO.getRua();
        this.numero = enderecoDTO.getNumero();
        this.cidade = enderecoDTO.getCidade();
        this.estado = enderecoDTO.getEstado();
    }
}
