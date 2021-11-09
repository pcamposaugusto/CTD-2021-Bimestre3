package dao;

import java.util.List;
import java.util.Optional;

public interface IDao <T> {
    public T cadastrar(T t);
    public Optional<T> buscar(Integer id);
    public void excluir(Integer id);
    public T modificar(T t);
    public List<T> listarTodos();
}
