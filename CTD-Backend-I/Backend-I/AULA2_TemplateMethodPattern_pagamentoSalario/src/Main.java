public class Main {
    public static void main(String[] args) {
//        Efetivo funcionario = new Efetivo(); ou para reutilizar a variável:
        Funcionario funcionario = new Efetivo("Odair", "Antunes","17642878472", 5000.0, 1000.0, 500.0);

        funcionario.pagamentoSalario();

        funcionario = new Contratado("Marlene", "Peixoto", "6293849305", 100.0, 80);

        funcionario.pagamentoSalario();

    }

// EXERCÍCIO

// Para efetuar o pagamento dos salários é necessário realizar três etapas: calcular o salário correspondente, imprimir ou gerar recibos de salário e depositar o valor correspondente.

// Existem diferentes tipos de funcionários. No caso de empregados efetivos ou em “relação de dependência”, o cálculo é feito de acordo com o salário-base e acrescido de descontos e bonificações. Os funcionários contratados trabalham uma quantidade de horas, cada uma com um determinado valor. Com essa informação, é feito o cálculo do salário a ser pago e depois se imprime o recibo e, por fim, se deposita o valor.

// O processo que realizamos é pagamentoSalario, que leva três etapas: cálculo, impressão e depósito. Já o cálculo é feito de acordo com o tipo de funcionário. A impressão pode ser digital, no caso do contratado, ou em recibo em papel, no caso do efetivo, e por último o depósito é em conta bancária.

// Os funcionários efetivos têm como informação um salário-base e um valor fixo de descontos e outro de bonificações. Os empregados contratados possuem número de horas trabalhadas e valor por hora. Ambos devem ter nome, sobrenome e número da conta onde o salário é depositado.

// Para simplificar, vamos emitir uma mensagem na parte de impressão do comprovante que informa se é um documento digital ou impresso.

}
