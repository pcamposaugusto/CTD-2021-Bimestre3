package com.example.AULA20_ClinicaOdontologica.service.impl;

import com.example.AULA20_ClinicaOdontologica.model.Paciente;
import com.example.AULA20_ClinicaOdontologica.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@Service
public class PacienteServiceImpl implements PacienteService {
    private static Map<Integer, Paciente> pacienteMap = new HashMap<>();
    private static Integer idGlobal = 1;

    private static String[] nomes = {"Lucas", "Ana", "Pedro", "Julia", "Roberto", "Larissa", "Antonio", "Pietra", "Rubens", "Giovana"};

    private static String[] sobrenomes = {"Silva", "Santos", "Gomes", "Paglia", "Grisa", "Andrade", "Quinteiros", "Tempesta", "Franco", "Andrade"};

@Override
    public Paciente criarPaciente() {
    Random random = new Random();
    int numRad = 10;
    String nome = nomes[random.nextInt(numRad)];
    String sobrenome = sobrenomes[random.nextInt(numRad)];
    String email = nome.toLowerCase() + sobrenome.toLowerCase() + "@email.com";
    Integer id = idGlobal++;

    pacienteMap.put(id, new Paciente(nome, sobrenome, email, (random.nextInt(numRad) + 18)));

    return pacienteMap.get(id);
}

@Override
    public Map<Integer, Paciente> buscarPacientes() { return pacienteMap; }

@Override
    public void deletar(Integer id) { pacienteMap.remove(id); }

    @Override
    public Paciente buscarPorId(Integer id) {
        return pacienteMap.get(id);
    }

    @Override
    public Paciente atualizarPaciente(Integer id, String nome) {
        Paciente paciente = buscarPorId(id);
        paciente.setNome(nome);
        return paciente;
    }

}
