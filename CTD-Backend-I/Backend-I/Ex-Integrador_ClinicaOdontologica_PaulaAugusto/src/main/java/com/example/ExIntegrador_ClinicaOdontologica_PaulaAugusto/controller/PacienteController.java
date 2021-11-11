package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.controller;

import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Paciente;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/buscarPorEmail")
    public String buscarPorEmail(Model model) {
        Paciente paciente = pacienteService.buscarPorEmail("neideblanco@email.com");
        model.addAttribute("nome", paciente.getNome()).addAttribute("sobrenome", paciente.getSobrenome());
        return "index";
    }
}
