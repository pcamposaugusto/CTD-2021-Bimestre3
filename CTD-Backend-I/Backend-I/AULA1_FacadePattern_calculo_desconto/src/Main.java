public class Main {
    public static void main(String[] args) {
        IFachadaDesconto fachada = new FachadaDesconto();

        Cartao cartao = new Cartao("19899282", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Enlatado");

        System.out.println("Desconto: " + fachada.desconto(cartao, produto, 1));

        cartao.setBanco("Coiso");
        produto.setTipo("Latas");

        System.out.println("Desconto: " + fachada.desconto(cartao, produto, 13));

    }

//    EXERCÍCIO
//
//    Suponha que tenhamos que programar um sistema de cálculo de desconto em um supermercado.
//
//    Existem descontos cumulativos (as percentagens são somadas) de acordo com:
//
//    - Por cartão: se for do banco Star Bank, tem um desconto extra de 20%.
//    - Por tipo de produto: as latas têm 10% de desconto.
//    - Por quantidade: se comprarem mais de 12, o desconto é de 15%.
//
//    Cada política de desconto é implementada em uma API diferente:
//
//    - ApiCartao: int desconto(Cartao)
//    - ApiProduto: int desconto(Produto)
//    - ApiQuantidade: int desconto(quantidade)
//
//    Portanto, se implementará uma fachada (facade) que permita expor o cálculo de desconto de alto nivel que utilize as diferentes APIs.
//
//    Você também deve modelar as classes:
//
//   - Produto: nome String e tipo String
//   - Cartao: numero String e banco String
//
//    Usando o padrão Facade, queremos criar uma fachada que permita simplificar o cálculo de desconto com produto, cartão e quantidade como parâmetros.

}
