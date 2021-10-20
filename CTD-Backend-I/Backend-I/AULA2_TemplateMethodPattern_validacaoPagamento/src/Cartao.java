import java.time.LocalDate;
import java.util.Scanner;

public abstract class Cartao {

    Scanner entrada = new Scanner(System.in);

    private String numero;
    private String codigoSeguranca;
    private LocalDate dataValidade;

    public Cartao(String numero, String codigoSeguranca, LocalDate dataValidade) {
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.dataValidade = dataValidade;
    }

    public void processarPagamento() {
        double valor = Double.parseDouble(entrada.nextLine());
        validarData();
        if(validarData()) {
            autorizarPagamento(valor);
        } else {
            System.out.println("A data de validade do cartão está expirada!");
        }
    }

    private boolean validarData(){
        if(this.dataValidade.compareTo(LocalDate.now()) > 0) {
            return true;
        } else {
            return false;
        }
    }

    protected abstract boolean autorizarPagamento(double valor);

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
