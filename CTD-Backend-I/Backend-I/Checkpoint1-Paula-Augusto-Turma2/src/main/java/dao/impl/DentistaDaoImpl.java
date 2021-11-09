package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class DentistaDaoImpl implements IDao<Dentista> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(DentistaDaoImpl.class);

    public DentistaDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    // Método pedido no Checkpoint 1
    @Override
    public Dentista cadastrar(Dentista dentista) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("INSERT INTO dentistas(numeroDeMatricula, nome, sobrenome) VALUES('%s','%s','%s')", dentista.getNumeroDeMatricula(), dentista.getNome(), dentista.getSobrenome());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                dentista.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Registrando novo(a) dentista: " + dentista);
        return dentista;
    }


    @Override
    public Optional<Dentista> buscar(Integer id) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("SELECT *  FROM dentistas where id = '%s'", id);
        Dentista dentista = null;
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                dentista = criarObjDentista(result);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Buscando por dentista de id: " + id);
        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }


    private Dentista criarObjDentista(ResultSet result) throws SQLException {
        Integer id = result.getInt("id");
        String numeroDeMatricula = result.getString("numeroDeMatricula");
        String nome = result.getString("nome");
        String sobrenome = result.getString("sobrenome");

        return new Dentista(id, numeroDeMatricula, nome, sobrenome);
    }


    // Método pedido no Checkpoint 1
    @Override
    public List<Dentista> listarTodos() {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("SELECT *  FROM dentistas");
        List<Dentista> dentistas = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                dentistas.add(criarObjDentista(result));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Listando todos os dentistas cadastrados: " + dentistas);
        return dentistas;
    }


    @Override
    public void excluir(Integer id) {
        log.debug("Excluindo o dentista de id " + id);
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("DELETE FROM dentistas WHERE id = %s", id);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Excluindo dentista de id " + id);
    }


    @Override
    public Dentista modificar(Dentista dentista) {
        log.debug("Modificando o dentista: " + dentista.toString());
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("UPDATE dentistas SET numeroDeMatricula = '%s', nome = '%s', sobrenome = '%s' WHERE id='%s'", dentista.getNumeroDeMatricula(), dentista.getNome(), dentista.getSobrenome(), dentista.getId());
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                dentista = criarObjDentista(result);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Modificando dentista: " + dentista);
        return dentista;
    }

}
