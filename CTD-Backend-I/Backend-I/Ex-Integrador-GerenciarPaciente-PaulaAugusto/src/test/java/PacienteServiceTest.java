import dao.ConfiguracaoJDBC;
import dao.impl.EnderecoDaoImpl;
import dao.impl.PacienteDaoImpl;
import model.Endereco;
import model.Paciente;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.PacienteService;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteServiceTest {

    private static PacienteService pacienteService = new PacienteService(new PacienteDaoImpl(new ConfiguracaoJDBC(), new EnderecoDaoImpl(new ConfiguracaoJDBC())));


    @BeforeAll
    public static void preencherTabelas() {
        Endereco endereco1 = new Endereco("rua joao jose rescala", "210", "Salvador", "Bahia");
        Paciente paciente1 = new Paciente("Paula", "Augusto", "4352617265", LocalDate.of(2020, 1, 17), endereco1);

        Endereco endereco2 = new Endereco("rua bertold brecht", "45", "Salvador", "Bahia");
        Paciente paciente2 = new Paciente("Teresa", "Vieira", "8866443223", LocalDate.of(2019, 7, 12), endereco2);

        Endereco endereco3 = new Endereco("rua das araras", "78", "Salvador", "Bahia");
        Paciente paciente3 = new Paciente("Roberto", "Sampaio", "1123657722", LocalDate.of(2018, 10, 26), endereco3);

        pacienteService.cadastrar(paciente1);
        pacienteService.cadastrar(paciente2);
        pacienteService.cadastrar(paciente3);
    }

    @Test
    public void adicionarPesquisarExcluir() {
        Endereco endereco4 = new Endereco("rua milton santos", "23", "Salvador", "Bahia");
        Paciente paciente4 = new Paciente("Jaime", "Brito", "1145663374", LocalDate.of(2015, 7, 6), endereco4);

        pacienteService.cadastrar(paciente4);
        assertFalse(pacienteService.buscar(paciente4.getId()).isEmpty());
        pacienteService.excluir(paciente4.getId());
        assertTrue(pacienteService.buscar(paciente4.getId()).isEmpty());
    }

    @Test
    public void pesquisarTodos() {
        List<Paciente> pacientes = pacienteService.listarTodos();

        assertFalse(pacientes.isEmpty());
    }

}
