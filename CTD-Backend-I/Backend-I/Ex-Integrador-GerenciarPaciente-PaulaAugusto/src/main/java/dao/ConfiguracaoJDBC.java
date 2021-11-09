package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConfiguracaoJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    private static final String SQL_CREATE_TABLE_ENDERECOS =
            "DROP TABLE IF EXISTS ENDERECOS CASCADE; CREATE TABLE ENDERECOS (" +
                    "id int auto_increment primary key, " +
                    "rua varchar(255), " +
                    "numero varchar(255), " +
                    "cidade varchar(255), " +
                    "estado varchar(255))";

    private static final String SQL_CREATE_TABLE_PACIENTES =
            "DROP TABLE IF EXISTS PACIENTES; CREATE TABLE PACIENTES (" +
            "id int auto_increment primary key, " +
            "nome varchar(255), " +
            "sobrenome varchar(255), " +
            "rg varchar(255), " +
            "dataDeCadastro date, " +
            "enderecoId int, " +
            "foreign key (enderecoId) references enderecos (id))";

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/test";
        this.nomeUsuario = "sa";
        this.senha = "";

        criarTabelas();
    }

    private void criarTabelas() {
        try {
            Connection connection = conectarBanco();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_ENDERECOS);
            statement.execute(SQL_CREATE_TABLE_PACIENTES);

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection conectarBanco() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

}
