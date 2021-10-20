public class Afiliado extends Vendedor{

    public Afiliado(String nome) {
        super(nome);
        this.PONTOS_POR_VENDA = 15;
    }

    @Override
    public int calcularPontos() {
        return this.totalPontos = this.vendas * PONTOS_POR_VENDA;
    }

}
