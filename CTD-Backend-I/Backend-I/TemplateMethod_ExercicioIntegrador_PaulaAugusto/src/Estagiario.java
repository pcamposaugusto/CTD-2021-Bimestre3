public class Estagiario extends Vendedor {

    public Estagiario(String nome) {
        super(nome);
        this.PONTOS_POR_VENDA = 5;
    }

    @Override
    public int calcularPontos() { return this.totalPontos = this.vendas * PONTOS_POR_VENDA; }

    @Override
    public String recategorizar() {
        if(this.totalPontos >= 50) {
            return this.categoria = "estagiário(a) experiente";
        } else {
            return this.categoria = "estagiário(a) novato(a)";
        }
    }
}
