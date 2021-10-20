public class Main {
    public static void main(String[] args) {
        Cardapio cardapio = new CardapioAdulto(20.0);
        cardapio.preparacaoCardapio();

        cardapio = new CardapioInfantil(16.0, 8.0);
        cardapio.preparacaoCardapio();

        cardapio = new CardapioVegetariano(25.0, 5.0);
        cardapio.preparacaoCardapio();


    }
}
