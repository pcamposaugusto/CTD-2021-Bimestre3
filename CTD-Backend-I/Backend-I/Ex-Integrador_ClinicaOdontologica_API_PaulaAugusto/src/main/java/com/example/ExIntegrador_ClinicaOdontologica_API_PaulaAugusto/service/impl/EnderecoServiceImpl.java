package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.impl;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Endereco;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.OdontoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EnderecoServiceImpl implements OdontoService<Endereco> {
    private static Map<Integer, Endereco> enderecoMap = new HashMap<>();
    private static Integer idGlobal = 1;

    @Override
    public Endereco salvar(Endereco endereco) {
        endereco.setId(idGlobal);
        enderecoMap.put(idGlobal, endereco);
        idGlobal++;
        return endereco;
    }

    @Override
    public Map<Integer, Endereco> buscarTodos() {
        return null;
    }

    @Override
    public void deletar(Integer id) {
        enderecoMap.remove(id);
    }

    @Override
    public Endereco buscarPorId(Integer id) {
        return enderecoMap.get(id);
    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        enderecoMap.put(endereco.getId(), endereco);
        return endereco;
    }
}
