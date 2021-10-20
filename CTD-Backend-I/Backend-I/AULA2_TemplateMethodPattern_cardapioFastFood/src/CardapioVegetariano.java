public class CardapioVegetariano extends Cardapio {
    private double custoEmbalagemEspecial;

    public CardapioVegetariano(double precoBase, double custoEmbalagemEspecial) {
        super(precoBase);
        this.custoEmbalagemEspecial = custoEmbalagemEspecial;
    }

    @Override
    protected void montarCardapio() {
        System.out.println("Um cardápio vegetariano deve ser montado. Você deve adicionar temperos em uma embalagem especial.");
    }

    @Override
    protected void calcularPrecoCardapio() {
        System.out.println("O custo do cardápio vendido é de " + (getPrecoBase() + custoEmbalagemEspecial + (getPrecoBase()*0.01)) + " reais.");
    }

}
