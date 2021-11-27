package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.controller;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Dentista;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.impl.DentistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaServiceImpl dentistaService;

    @PostMapping
    public ResponseEntity<Dentista> salvarDentista(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.salvar(dentista));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(dentistaService.buscarPorId(id));
    }

    @GetMapping
    public Map<Integer, Dentista> buscarTodos() {
        return dentistaService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if(dentistaService.buscarPorId(id) != null) {
            dentistaService.deletar(id);
            response = ResponseEntity.status(HttpStatus.ACCEPTED).body("Dentista deletado(a)");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dentista não encontrado(a)");
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Dentista> atualizar(@RequestBody Dentista dentista) {
        ResponseEntity<Dentista> response = null;

        if (dentista.getId() != null) {
            response = ResponseEntity.ok(dentistaService.atualizar(dentista));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

}
