package com.example.AULA20_ClinicaOdontologica.service;

import com.example.AULA20_ClinicaOdontologica.model.Paciente;

import java.util.Map;

public interface PacienteService {
    Paciente criarPaciente();
    Map<Integer, Paciente> buscarPacientes();
    void deletar(Integer id);
    Paciente buscarPorId(Integer id);
    Paciente atualizarPaciente(Integer id, String nome);

}
