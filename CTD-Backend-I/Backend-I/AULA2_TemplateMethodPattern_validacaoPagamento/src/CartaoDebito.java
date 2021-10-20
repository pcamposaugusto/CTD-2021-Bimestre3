import java.time.LocalDate;

public class CartaoDebito extends Cartao{

    private double saldoDisponivel;

    public CartaoDebito(String numero, String codigoSeguranca, LocalDate dataValidade, double saldoDisponivel) {
        super(numero, codigoSeguranca, dataValidade);
        this.saldoDisponivel = saldoDisponivel;
    }


    @Override
    protected boolean autorizarPagamento(double valor) {
        if(saldoDisponivel >= valor) {
            System.out.println("Você possui saldo suficiente. Aproveite!");
            return true;
        } else {
            System.out.println("Você não tem saldo suficiente para realizar esse pagamento!");
            return false;
        }
    }
}
