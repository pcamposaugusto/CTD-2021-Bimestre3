package com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.controller;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.model.Dentista;
import com.example.ExIntegrador_ClinicaOdontologica_PaulaAugusto.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DentistaController {
    private final DentistaService dentistaService;

    @Autowired
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @GetMapping("/buscarPorId")
    public String buscarPorId(Model model) {
        Dentista dentista = dentistaService.buscarPorId(2);
        model.addAttribute("nome", dentista.getNome()).addAttribute("sobrenome", dentista.getSobrenome()).addAttribute("matricula", dentista.getMatricula()).addAttribute("paciente", dentista.getPaciente().getNome() + " " + dentista.getPaciente().getSobrenome());
        return "index";
    }

}
