package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacienteDaoImpl implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private EnderecoDaoImpl enderecoDao;
    final static Logger log = Logger.getLogger(PacienteDaoImpl.class);

    public PacienteDaoImpl(ConfiguracaoJDBC configuracaoJDBC, EnderecoDaoImpl enderecoDao) {
        this.configuracaoJDBC = configuracaoJDBC;
        this.enderecoDao = enderecoDao;
    }


    @Override
    public Paciente cadastrar(Paciente paciente) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        paciente.setEndereco(enderecoDao.cadastrar(paciente.getEndereco()));
        String query = String.format("INSERT INTO pacientes(nome, sobrenome, rg, dataDeCadastro, enderecoId) VALUES('%s','%s','%s','%s','%s')", paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getDataDeCadastro(), paciente.getEndereco().getId());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Registrando novo(a) paciente: " + paciente);
        return paciente;
    }


    private Paciente criarObjPaciente(ResultSet result) throws SQLException {
        Integer idPaciente = result.getInt("id");
        String nome = result.getString("nome");
        String sobrenome = result.getString("sobrenome");
        String rg = result.getString("rg");
        LocalDate dataDeCadastro = result.getDate("dataDeCadastro").toLocalDate();
        Endereco endereco = enderecoDao.buscar(result.getInt("enderecoId")).orElse(null);
        return new Paciente(idPaciente, nome, sobrenome, rg, dataDeCadastro, endereco);
    }


    @Override
    public Optional<Paciente> buscar(Integer id) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("SELECT * FROM pacientes WHERE id = '%s'", id);
        Paciente paciente = null;
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                paciente = criarObjPaciente(result);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Buscando por paciente de id: " + id + " - " + paciente);
        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }


    @Override
    public void excluir(Integer id) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        Paciente paciente = buscar(id).get();
        String query = String.format("DELETE FROM pacientes WHERE id = %s", id);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            enderecoDao.excluir(paciente.getEndereco().getId());
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Excluindo o paciente de id " + id + " - " + paciente);
    }


    @Override
    public Paciente modificar(Paciente paciente) {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("UPDATE pacientes set nome = '%s', sobrenome = '%s', rg = '%s', dataDeCadastro = '%s' where id = '%s'", paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getDataDeCadastro(), paciente.getId());
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                paciente = criarObjPaciente(result);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Modificando o paciente: " + paciente);
        return paciente;
    }


    @Override
    public List<Paciente> listarTodos() {
        Connection connection = configuracaoJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("SELECT * FROM pacientes");
        List<Paciente> pacientes = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
                pacientes.add(criarObjPaciente(result));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Listando todos os pacientes: " + pacientes);
        return pacientes;
    }

}


