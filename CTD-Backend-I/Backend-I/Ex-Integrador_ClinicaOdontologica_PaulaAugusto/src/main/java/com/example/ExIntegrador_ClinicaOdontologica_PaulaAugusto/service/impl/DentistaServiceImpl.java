package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.impl;

import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Dentista;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Endereco;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Paciente;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.DentistaService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DentistaServiceImpl implements DentistaService {

    private Endereco endereco = new Endereco("Rua Clovis", "14", "São Paulo", "SP");
    private Endereco endereco2 = new Endereco("Rua Mendes", "140", "Belo Horizonte", "MG");

    private Paciente paciente1 = new Paciente(1, "John", "Dutra", "johndutra@email.com", "12345678909", LocalDate.now(), endereco);
    private Paciente paciente2 = new Paciente(2, "Neide", "Blanco", "neideblanco@email.com", "98765432112", LocalDate.now(), endereco2);

    private Dentista dentista1 = new Dentista(1, "Fernanda", "Oliveira", "5647", paciente1);
    private Dentista dentista2 = new Dentista(2, "João", "Pitanga", "8823", paciente2);

    @Override
    public List<Dentista> buscarTodos() {
        return Arrays.asList(dentista1, dentista2);
    }

    @Override
    public Dentista buscarPorId(Integer id) {
        if(id.equals(dentista1.getId()))
            return dentista1;
        else if(id.equals(dentista2.getId()))
            return dentista2;
        return null;
    }
}
