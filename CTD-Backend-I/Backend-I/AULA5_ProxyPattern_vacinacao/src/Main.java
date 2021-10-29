import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formato.parse("23/10/2021");

        Pessoa pessoa = new Pessoa("Carlos", "Alberto", "12448865", "Pfizer", new Date());
        IRegistro registroVacina = new RegistroVacinaProxy();
        registroVacina.vacinar(pessoa.informacoes());

        pessoa = new Pessoa("Paula", "Augusto", "84372612", "Coronavac", date);
        registroVacina.vacinar(pessoa.informacoes());

        date = formato.parse("21/10/2021");
        pessoa = new Pessoa("Pedro", "Brito", "45267721", "Oxford", date);
        registroVacina.vacinar(pessoa.informacoes());

    }


//
//    Em um posto de vacinação, as pessoas são cadastradas e devem informar os seguintes dados: nome, sobrenome e RG. Além disso, quando marcarem uma vacinação, uma data lhes é atribuída, bem como o nome da vacina que lhes será aplicada.
//
//    Ao se vacinar, o método vacinar() deve ser informado de que a vacina foi aplicada. No momento da vacinação, a confirmação deve ser registrada com o RG, data e vacina. Para evitar que as informações sejam inconsistentes, deve-se controlar se a data da aplicação da vacina é igual ou posterior à data marcada. Um proxy deve ser usado para executar esse controle.
//
//    Para simplificar o exercício, caso o registro esteja correto, é emitida uma mensagem com a informação registrada.
//

}


