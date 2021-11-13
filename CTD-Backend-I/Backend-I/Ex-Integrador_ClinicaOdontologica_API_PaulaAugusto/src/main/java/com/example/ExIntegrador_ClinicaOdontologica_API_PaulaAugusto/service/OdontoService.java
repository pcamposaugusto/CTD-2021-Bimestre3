package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service;

import java.util.Map;

public interface OdontoService<T> {
    T salvar(T t);
    Map<Integer, T> buscarTodos();
    void deletar(Integer id);
    T buscarPorId(Integer id);
    T atualizar(T t);
}
