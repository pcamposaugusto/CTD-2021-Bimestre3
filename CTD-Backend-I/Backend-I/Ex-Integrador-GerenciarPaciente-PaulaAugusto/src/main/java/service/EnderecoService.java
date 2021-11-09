package service;

import dao.IDao;
import model.Endereco;

import java.util.List;
import java.util.Optional;


public class EnderecoService {
    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco cadastrar(Endereco endereco) {
        return enderecoIDao.cadastrar(endereco);
    }

    public Optional<Endereco> buscar(Integer id) { return enderecoIDao.buscar(id); }

    public void excluir(Integer id) {
        enderecoIDao.excluir(id);
    }

    public Endereco modificar(Endereco endereco) {
        return enderecoIDao.modificar(endereco);
    }

    public List<Endereco> listarTodos(){
        return enderecoIDao.listarTodos();
    }
}
