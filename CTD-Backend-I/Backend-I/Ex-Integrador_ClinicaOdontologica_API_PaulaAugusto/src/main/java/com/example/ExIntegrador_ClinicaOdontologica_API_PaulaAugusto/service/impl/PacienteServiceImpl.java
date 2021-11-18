package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.impl;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Paciente;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.repository.PacienteRepositoryImpl;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.OdontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PacienteServiceImpl implements OdontoService<Paciente> {
//    private static Map<Integer, Paciente> pacienteMap = new HashMap<>();
//    private static Integer idGlobal = 1;

    @Autowired
    private PacienteRepositoryImpl pacienteRepository;

    @Override
    public Paciente salvar(Paciente paciente) {
        return pacienteRepository.salvar(paciente);
    }

//    @Override
//    public Map<Integer, Paciente> buscarTodos() {
//        pacienteMap.forEach((chave, paciente) -> {
//            paciente.setEndereco(enderecoService.buscarPorId(paciente.getIdEndereco()));
//        });
//        return pacienteMap;
//    }

//    @Override
//    public void deletar(Integer id) {
//        enderecoService.deletar(buscarPorId(id).getIdEndereco());
//        pacienteMap.remove(id);
//    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return pacienteRepository.buscarPorIdRepo(id);
    }

//    @Override
//    public Paciente atualizar(Paciente paciente) {
//        enderecoService.atualizar(paciente.getEndereco());
//        pacienteMap.put(paciente.getId(), paciente);
//        return paciente;
//    }
}

