package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service;

import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Dentista;

import java.util.List;

public interface DentistaService {
    List<Dentista> buscarTodos();
    Dentista buscarPorId(Integer id);
}
