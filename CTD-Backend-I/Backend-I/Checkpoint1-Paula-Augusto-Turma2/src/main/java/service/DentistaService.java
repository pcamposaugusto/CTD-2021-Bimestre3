package service;

import dao.IDao;
import model.Dentista;

import java.util.List;
import java.util.Optional;

public class DentistaService {
    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista cadastrar(Dentista dentista) {
        return dentistaIDao.cadastrar(dentista);
    }

    public Optional<Dentista> buscar(Integer id) { return dentistaIDao.buscar(id); }

    public List<Dentista> listarTodos() { return dentistaIDao.listarTodos(); }

    public void excluir(Integer id) { dentistaIDao.excluir(id); }

    public Dentista modificar(Dentista dentista) { return dentistaIDao.modificar(dentista); }

}
