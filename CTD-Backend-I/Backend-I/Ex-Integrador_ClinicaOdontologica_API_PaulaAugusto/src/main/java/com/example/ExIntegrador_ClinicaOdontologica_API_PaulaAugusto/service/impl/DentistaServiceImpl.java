package com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.impl;

import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.model.Dentista;
import com.example.ExIntegrador_ClinicaOdontologica_API_PaulaAugusto.service.OdontoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DentistaServiceImpl implements OdontoService<Dentista> {
    private static Map<Integer, Dentista> dentistaMap = new HashMap<>();
    private static Integer idGlobal = 1;

    @Override
    public Dentista salvar(Dentista dentista) {
        dentista.setId(idGlobal);
        dentistaMap.put(idGlobal, dentista);
        idGlobal++;
        return dentista;
    }

    @Override
    public Map<Integer, Dentista> buscarTodos() {
        return dentistaMap;
    }

    @Override
    public void deletar(Integer id) {
        dentistaMap.remove(id);
    }

    @Override
    public Dentista buscarPorId(Integer id) {
        Dentista dentista = new Dentista();
        try{
            dentista = dentistaMap.get(id);
        } catch (Exception e){
            return null;
        }
        return dentista;
    }

    @Override
    public Dentista atualizar(Dentista dentista) {
        dentistaMap.put(dentista.getId(), dentista);
        return dentista;
    }
}
