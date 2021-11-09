package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    private static final String SQL_CREATE_TABLE_DENTISTAS =
            "DROP TABLE IF EXISTS DENTISTAS; CREATE TABLE DENTISTAS (" +
                    "id int auto_increment primary key, " +
                    "numeroDeMatricula varchar(255), " +
                    "nome varchar(255), " +
                    "sobrenome varchar(255));";

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

        criarTabela();
    }

    private void criarTabela() {
        try {
            Connection connection = conectarBanco();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_DENTISTAS);

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
