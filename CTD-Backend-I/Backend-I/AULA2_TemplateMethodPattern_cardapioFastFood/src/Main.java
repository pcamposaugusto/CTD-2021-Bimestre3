public class Main {
    public static void main(String[] args) {
        Cardapio cardapio = new CardapioAdulto(20.0);
        cardapio.preparacaoCardapio();

        cardapio = new CardapioInfantil(16.0, 8.0);
        cardapio.preparacaoCardapio();

        cardapio = new CardapioVegetariano(25.0, 5.0);
        cardapio.preparacaoCardapio();

    }

//    Mesas de trabalho: Template Method pattern

//    Em uma empresa de fast food que vende apenas cardápios prontos para levar, eles classificam os produtos como cardápio adulto, cardápio infantil ou cardápio vegetariano. Todos os menus têm um preço base, ou seja, pode ser aumentado se houver acréscimos ao pedido.

//    Quando um cliente compra os produtos, os funcionários devem montar a embalagem de cada cardápio e calcular seu custo. O processo de preparação de um menu envolve montar e calcular o preço de venda.

//    Os menus para adultos trazem apenas o que diz na sua oferta e o seu valor não é acrescido. Os menus infantis têm um presente surpresa, que deve ser adicionado e tem um custo adicional.

//    Os cardápios vegetarianos têm uma embalagem especial já que são acrescentados temperos. O custo aumenta com o valor do contêiner e sobretaxa de 1% para os condimentos.

//    Precisamos de um sistema que exiba uma mensagem aos funcionários com os itens adicionais, se aplicável, para que não se esqueçam de fazer isso na hora da montagem. Em seguida, você precisará relatar o custo do menu vendido.

//    Tanto a montagem, quanto o cálculo do custo são processos que sempre se fazem com todos os produtos vendidos.
    
//    Devemos desenvolver as classes necessárias para realizar o processo de preparação explicado.

}
