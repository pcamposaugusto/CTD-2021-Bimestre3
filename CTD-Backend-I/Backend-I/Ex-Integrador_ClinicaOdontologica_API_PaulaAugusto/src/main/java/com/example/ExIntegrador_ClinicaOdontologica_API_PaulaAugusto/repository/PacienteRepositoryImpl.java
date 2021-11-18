package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.repository;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.dto.PacienteDTO;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Paciente;

import java.util.HashMap;
import java.util.Map;

public class PacienteRepositoryImpl implements IRepository<Paciente> {

    private static Map<Integer, PacienteDTO> pacienteDTOMap = new HashMap<>();
    private static Integer idGlobal = 1;

    private EnderecoRepositoryImpl enderecoRepository;

    public PacienteRepositoryImpl(EnderecoRepositoryImpl enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        paciente.setId(enderecoRepository.salvar(paciente.getEndereco()).getId());
        paciente.setId(idGlobal);
        PacienteDTO pacienteDTO = new PacienteDTO(paciente);
        pacienteDTOMap.put(idGlobal, pacienteDTO);
        idGlobal++;
        return paciente;
    }

    @Override
    public Paciente buscarPorIdRepo(Integer id) {
        PacienteDTO pacienteDTO = pacienteDTOMap.get(id);
        return new Paciente(pacienteDTO, enderecoRepository.buscarPorIdRepo(pacienteDTO.getIdEndereco()));
    }
}
