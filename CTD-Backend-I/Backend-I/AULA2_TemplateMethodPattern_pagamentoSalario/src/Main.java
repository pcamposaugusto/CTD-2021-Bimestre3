public class Main {
    public static void main(String[] args) {
//        Efetivo funcionario = new Efetivo(); ou para reutilizar a variável:
        Funcionario funcionario = new Efetivo("Odair", "Antunes","17642878472", 5000.0, 1000.0, 500.0);

        funcionario.pagamentoSalario();

        funcionario = new Contratado("Marlene", "Peixoto", "6293849305", 100.0, 80);

        funcionario.pagamentoSalario();

    }
}
