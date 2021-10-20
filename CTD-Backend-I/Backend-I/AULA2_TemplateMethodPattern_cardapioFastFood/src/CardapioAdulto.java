public class CardapioAdulto extends Cardapio{

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    protected void montarCardapio() {
        System.out.println("Um cardápio adulto deve ser montado. Nenhum item adicional é aplicável.");
    }

    @Override
    protected void calcularPrecoCardapio() {
        System.out.println("O custo do cardápio vendido é de " + getPrecoBase() + " reais.");
    }
}
