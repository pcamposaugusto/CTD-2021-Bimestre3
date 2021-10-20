public abstract class Cardapio {
    private double precoBase;

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    public void preparacaoCardapio() {
        montarCardapio();
        calcularPrecoCardapio();
    }

    protected abstract void montarCardapio();
    protected abstract void calcularPrecoCardapio();

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
