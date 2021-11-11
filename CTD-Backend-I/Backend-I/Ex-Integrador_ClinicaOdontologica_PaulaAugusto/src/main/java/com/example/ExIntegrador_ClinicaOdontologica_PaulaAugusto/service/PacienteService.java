package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service;

import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente> buscarTodos();
    Paciente buscarPorEmail(String email);
}
