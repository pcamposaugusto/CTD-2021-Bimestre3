
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {
    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;
    protected int totalPontos = 0;
    protected String categoria;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome + " realizou " + qtdVendas + " venda(s).");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos a serem considerados*/
    public abstract int calcularPontos();

    public String recategorizar() {
        if(this.totalPontos < 20) {
            return this.categoria = "vendedor(a) novato(a)";
        } else if(this.totalPontos >= 20 && this.totalPontos <= 30) {
            return this.categoria = "vendedor(a) aprendiz";
        } else if(this.totalPontos >= 31 && this.totalPontos <= 40) {
            return this.categoria = "vendedor(a) bom/boa";
        } else if (this.totalPontos > 40) {
            return this.categoria = "vendedor(a) mestre";
        } else {
            return null;
        }
    }

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
        calcularPontos();
        recategorizar();
        return this.nome + " tem um total de " + this.totalPontos + " ponto(s) e categoriza como " + this.categoria;
    }
}





