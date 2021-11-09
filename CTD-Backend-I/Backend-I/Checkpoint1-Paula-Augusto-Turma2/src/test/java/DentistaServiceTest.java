import dao.ConfiguracaoJDBC;
import dao.impl.DentistaDaoImpl;
import model.Dentista;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.DentistaService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DentistaServiceTest {

    private static DentistaService dentistaService = new DentistaService(new DentistaDaoImpl(new ConfiguracaoJDBC()));

    @BeforeAll
    public static void preencherTabelaDentista() {
        Dentista dentista1 = new Dentista("2345", "Joana", "Almeida");
        Dentista dentista2 = new Dentista("7856", "Jorge", "Gomes");
        Dentista dentista3 = new Dentista("3322", "Clarice", "Medeiros");

        dentistaService.cadastrar(dentista1);
        dentistaService.cadastrar(dentista2);
        dentistaService.cadastrar(dentista3);
    }

    @Test
    public void exibirLista() {
        List<Dentista> dentistas = dentistaService.listarTodos();
        assertFalse(dentistas.isEmpty());
    }

}
