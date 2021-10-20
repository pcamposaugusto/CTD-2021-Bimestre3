public class Efetivo extends Funcionario {

    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    // double com letra minúscula não permite null - tipo primitivo
    // Double permite

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Foi gerado um recibo impresso na quantia de: " + quantia);
    }
}
