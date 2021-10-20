import java.time.LocalDate;

public class CartaoCredito extends Cartao{

    private double limite;
    private double saldoUtilizado;

    public CartaoCredito(String numero, String codigoSeguranca, LocalDate dataValidade, double limite, double saldoUtilizado) {
        super(numero, codigoSeguranca, dataValidade);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    protected boolean autorizarPagamento(double valor) {
        if((this.limite - this.saldoUtilizado) > valor){
            System.out.println("Você possui limite suficiente. Aproveite!");
            return true;
        } else {
            System.out.println("Você não tem limite suficiente para realizar esse pagamento!");
            return false;
        }
    }
}
