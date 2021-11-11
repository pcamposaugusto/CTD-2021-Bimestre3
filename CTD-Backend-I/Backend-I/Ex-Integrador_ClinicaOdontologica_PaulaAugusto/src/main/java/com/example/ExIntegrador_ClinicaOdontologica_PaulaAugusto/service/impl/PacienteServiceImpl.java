package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.impl;

import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Endereco;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Paciente;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.PacienteService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    private Endereco endereco = new Endereco("Rua Clovis", "14", "São Paulo", "SP");
    private Endereco endereco2 = new Endereco("Rua Mendes", "140", "Belo Horizonte", "MG");

    private Paciente paciente1 = new Paciente(1, "John", "Dutra", "johndutra@email.com", "12345678909", LocalDate.now(), endereco);
    private Paciente paciente2 = new Paciente(2, "Neide", "Blanco", "neideblanco@email.com", "98765432112", LocalDate.now(), endereco2);

    @Override
    public List<Paciente> buscarTodos() {
        return Arrays.asList(paciente1, paciente2);
    }

    @Override
    public Paciente buscarPorEmail(String email) {
        if(email.equalsIgnoreCase(paciente1.getEmail()))
            return paciente1;
        else if(email.equalsIgnoreCase(paciente2.getEmail()))
            return paciente2;

        return null;
    }
}
