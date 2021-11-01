import org.apache.log4j.Logger;

import java.sql.*;


public class Main {

    private static final String Create_Table =
            "DROP TABLE IF EXISTS FUNCIONARIO;" +
                    "CREATE TABLE FUNCIONARIO(" +
                    "ID INT PRIMARY KEY, " +
                    "PRIMEIRO_NOME varchar(100) NOT NULL, " +
                    "SOBRENOME varchar(100) NOT NULL, " +
                    "CARGO varchar(100) NOT NULL, " +
                    "EMAIL varchar(100) NOT NULL)";

    private static final String sqlInsert1 = "INSERT INTO FUNCIONARIO (ID, PRIMEIRO_NOME, SOBRENOME, CARGO, EMAIL) VALUES (1, 'Laís', 'Freitas', 'DevOps', 'laisfreitas@email.com')";
    private static final String sqlInsert2 = "INSERT INTO FUNCIONARIO (ID, PRIMEIRO_NOME, SOBRENOME, CARGO, EMAIL) VALUES (2, 'Lucas', 'Araujo', 'Backend Developer Jr', 'lucasaraujo@email.com')";
    private static final String sqlInsert3 = "INSERT INTO FUNCIONARIO (ID, PRIMEIRO_NOME, SOBRENOME, CARGO, EMAIL) VALUES (2, 'Raquel', 'Santos', 'Frontend Developer Sr', 'raquelsantos@email.com')";

    private static final String Update = "UPDATE FUNCIONARIO SET EMAIL='lucas40@email.com' WHERE EMAIL='lucasaraujo@email.com'";

    private static final String Delete1 = "DELETE FROM FUNCIONARIO WHERE ID=1";
    private static final String Delete2 = "DELETE FROM FUNCIONARIO WHERE PRIMEIRO_NOME='Raquel'";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(Create_Table);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

        } catch (Exception e) {
            logger.error("O ID do(a) primeiro(a) funcionário(a) cadastrado(a) é igual ao ID do(a) segundo(a). Por favor, corrija esse erro!", e); }

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(Update);
            logger.debug("O e-mail do(a) funcionário(a) de ID 2 foi atualizado: " + sqlInsert2 + Update);

            statement.execute(Delete1);
            logger.info("O(A) funcionário(a) de ID 1 foi excluído(a): " + sqlInsert1);

            statement.execute(Delete2);
            logger.info("O(A) funcionário(a) cujo primeiro nome é 'Raquel' foi excluído(a): " + sqlInsert3);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection == null)
                return;

            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }


//    ENUNCIADO

//    Utilizaremos um statement para criar uma tabela de funcionários com cinco colunas. A única coluna obrigatória será a coluna ID, que também é Primary Key, e as demais colunas são de livre escolha. Em seguida:

//    - Devemos inserir três linhas com dados diferentes, e uma delas deve conter o ID repetido;
//    - Verificar se está ocorrendo o erro: “Unique index or primary key violation”, ocasionado ao tentar inserir dois registros com o mesmo ID. Então devemos tratá-lo como exceção, registar o erro em log e continuar com a execução das demais instruções;
//    - Em seguida, você deve atualizar um dos funcionários com um novo valor em uma de suas colunas e registrar com um objeto de depuração (debug) as informações do funcionário;
//    - Posteriormente, temos que excluir um funcionário de acordo com o ID e registrar as informações do funcionário excluído como um objeto de informação (info);
//    - Por último, excluir outro funcionário utilizando como critério outra coluna que não seja o ID, como por exemplo o e-mail, e registrar as informações do funcionário excluído como um objeto de informação (info).

}
