public class CardapioInfantil extends Cardapio {
    private double custoPresenteSurpresa;

    public CardapioInfantil(double precoBase, double custoPresenteSurpresa) {
        super(precoBase);
        this.custoPresenteSurpresa = custoPresenteSurpresa;
    }

    @Override
    protected void montarCardapio() {
        System.out.println("Um cardápio infantil deve ser montado. Você deve adicionar um presente surpresa.");
    }

    @Override
    protected void calcularPrecoCardapio() {
        System.out.println("O custo do cardápio vendido é de " + (getPrecoBase() + custoPresenteSurpresa) + " reais.");
    }
}
