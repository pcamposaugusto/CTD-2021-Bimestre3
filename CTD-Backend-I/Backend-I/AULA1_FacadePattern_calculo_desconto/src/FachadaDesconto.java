public class FachadaDesconto implements IFachadaDesconto{
    // variáveis devem ser private

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FachadaDesconto() {
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    public int desconto(Cartao cartao, Produto prod, int quantidade){
        int desconto = 0;
//        desconto += apiQuantidade.desconto(quantidade);
//        desconto += apiProduto.desconto(prod);
//        desconto += apiCartao.desconto(cartao);
//        return desconto;
        return apiQuantidade.desconto(quantidade) + apiProduto.desconto(prod) + apiCartao.desconto(cartao);
    }

}
