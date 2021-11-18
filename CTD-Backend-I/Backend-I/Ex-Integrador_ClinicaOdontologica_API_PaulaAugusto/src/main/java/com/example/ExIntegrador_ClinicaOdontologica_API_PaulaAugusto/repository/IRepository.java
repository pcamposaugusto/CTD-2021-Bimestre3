package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.repository;

public interface IRepository <T> {
    T salvar(T t);
    T buscarPorIdRepo(Integer id);
}
