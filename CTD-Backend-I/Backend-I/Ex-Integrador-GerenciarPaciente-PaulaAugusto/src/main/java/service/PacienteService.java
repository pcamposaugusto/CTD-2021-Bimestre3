package service;

import dao.IDao;
import model.Paciente;

import java.util.List;
import java.util.Optional;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente cadastrar(Paciente paciente) { return pacienteIDao.cadastrar(paciente);
    }

    public Optional<Paciente> buscar(Integer id) {
        return pacienteIDao.buscar(id);
    }

    public void excluir(Integer id) { pacienteIDao.excluir(id); }

    public Paciente modificar(Paciente paciente) {
        return pacienteIDao.modificar(paciente);
    }

    public List<Paciente> listarTodos(){
        return pacienteIDao.listarTodos();
    }

}
