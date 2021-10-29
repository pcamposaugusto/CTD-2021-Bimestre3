import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoupaFactory {

    public static final Map<String, List<Roupa>> FABRICA = new HashMap<>();

    public static Roupa fabricarRoupa(String tamanho, String tipo, boolean nova, boolean importada) {
        List<String> key = new ArrayList<>();
        key.add(tamanho);
        key.add(tipo);
        key.add(nova+"");
        key.add(importada+"");

        Roupa roupa = new Roupa(tamanho, tipo, nova, importada);
        FABRICA.putIfAbsent(key, roupa);
        return roupa;
    }

    public static void tamanhoFabrica() {
        int num = FABRICA;
        System.out.println("O tamanho da fábrica é " + num);
    }


}