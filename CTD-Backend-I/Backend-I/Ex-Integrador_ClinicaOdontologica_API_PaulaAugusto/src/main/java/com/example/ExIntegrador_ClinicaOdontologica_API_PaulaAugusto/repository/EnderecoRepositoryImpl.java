package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.repository;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto.EnderecoDTO;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Endereco;

import java.util.HashMap;
import java.util.Map;

public class EnderecoRepositoryImpl implements IRepository<Endereco> {

    private static Map<Integer, EnderecoDTO> enderecoMap = new HashMap<>();
    private static Integer idGlobal = 1;


    @Override
    public Endereco salvar(Endereco endereco) {
        endereco.setId(idGlobal);
        EnderecoDTO enderecoDTO = new EnderecoDTO(endereco);
        enderecoMap.put(idGlobal, enderecoDTO);
        idGlobal++;
        return endereco;
    }

    @Override
    public Endereco buscarPorIdRepo(Integer id) {
        Endereco endereco = new Endereco(enderecoMap.get(id));
        return endereco;
    }
}
