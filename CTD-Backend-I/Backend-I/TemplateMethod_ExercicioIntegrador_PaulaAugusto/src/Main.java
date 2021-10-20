public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        Funcionario func2 = new Funcionario("Maria",1);
        func2.vender(5);

        Vendedor afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        Vendedor afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        Vendedor afi3 = new Afiliado("José");
        afi3.vender(2);

        func1.addAfiliado(afi1);
        func2.addAfiliado(afi3);

        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());

        Estagiario estg1 = new Estagiario("Rafael");
        estg1.vender(2);

        Estagiario estg2 = new Estagiario("Letícia");
        estg2.vender(10);

        System.out.println(estg1.mostrarCategoria());
        System.out.println(estg2.mostrarCategoria());

    }

//    Exercício Integrador: Template Method pattern

//    Objetivo: Analisar o seguinte enunciado em conjunto com o código e, em seguida, modifique-o de acordo com o enunciado.

//    Desafio I

//    Uma empresa de vendas digitais nos pede para modificar a modelagem de seu sistema.
//    Atualmente, o sistema permite que os vendedores sejam classificados de acordo com o cumprimento de determinados requisitos.

//    Os seguintes aspectos são considerados:
//    - Tanto funcionários quanto afiliados são vendedores;
//    - Cada vendedor retorna uma categoria (mostrarCategoria) de acordo com o número de pontos obtidos.
//    - O objetivo dos funcionários é conseguir afiliados (obterAfiliado) e realizar vendas(vender). Cada um recebe 10 pontos por cada novo afiliado, 5 pontos por cada venda que fizer e 5 pontos por cada ano de antiguidade que tiver.
//    - O objetivo dos afiliados é realizar vendas (vender), mas o cálculo dos pontos é diferente: eles ganham 15 pontos a cada nova venda.

//    Os vendedores são categorizados da seguinte forma:
//    Menos de 20 pontos = novato;
//    Entre 20 e 30 pontos = aprendiz;
//    Entre 31 e 40 pontos = bom;
//    Mais de 40 pontos = mestre.

//    Deve ser implementado um método mostrarCategoria que deve primeiro calcularPontos, depois recategorizar de acordo com a pontuação obtida no método anterior e, finalmente, exibir o nome do vendedor, total de pontos e categoria por console.

//    Desafio II

//    Somos solicitados a criar um terceiro tipo de vendedor chamado estagiário. O objetivo dos estagiários é fazer vendas, onde para cada uma, eles receberão 5 pontos. Os estagiários são categorizados da seguinte forma:
//    Menos de 50 pontos = estagiário novato.
//    50 pontos ou mais = estagiário experiente.

}
