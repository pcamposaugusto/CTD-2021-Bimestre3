public class Main {
    public static void main(String[] args) {
        // SERIES

        Serie serie1 = new Serie("A casa de papel", "www.acasadepapel.com");
        Serie serie2 = new Serie("À beira do caos", "www.abeiradocaos.com");
        Serie serie3 = new Serie("Sex education", "www.sexeducation.com");
        Serie serie4 = new Serie("The Office", "www.theoffice.com");

        // GRADE DE SERIES

        GradeDeSeries gradeDeSeries = new GradeDeSeries();
        gradeDeSeries.getSeries().add(serie1);
        gradeDeSeries.getSeries().add(serie2);
        gradeDeSeries.getSeries().add(serie3);
        gradeDeSeries.getSeries().add(serie4);


        // GRADE DE SERIES - PROXY

        GradeDeSeriesProxy proxy1 = new GradeDeSeriesProxy(gradeDeSeries);
        GradeDeSeriesProxy proxy2 = new GradeDeSeriesProxy(gradeDeSeries);
        GradeDeSeriesProxy proxy3 = new GradeDeSeriesProxy(gradeDeSeries);
        GradeDeSeriesProxy proxy4 = new GradeDeSeriesProxy(gradeDeSeries);


        try {
            proxy1.assistirSerie("A casa de papel");
            proxy1.assistirSerie("A casa de papel");
            proxy1.assistirSerie("A casa de papel");
            proxy1.assistirSerie("A casa de papel");
            proxy1.assistirSerie("A casa de papel");
            proxy1.assistirSerie("A casa de papel");

        } catch (SerieNaoHabilitadaException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxy2.assistirSerie("À beira do caos");
            proxy2.assistirSerie("À beira do caos");

        } catch (SerieNaoHabilitadaException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxy3.assistirSerie("Sex education");
            proxy3.assistirSerie("Sex education");
            proxy3.assistirSerie("Sex education");
            proxy3.assistirSerie("Sex education");
            proxy3.assistirSerie("Sex education");

        } catch (SerieNaoHabilitadaException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");
            proxy4.assistirSerie("The Office");

        } catch (SerieNaoHabilitadaException e) {
            System.err.println(e.getMessage());
        }

    }

//    ENUNCIADO

//    Agora nosso aplicativo de streaming vai incorporar a transmissão de séries. Nesse caso, precisamos desenvolver uma funcionalidade em particular: como cliente, queremos que o aplicativo nos permita fazer um pedido com o nome da série e nos envie o link de reprodução.

//    O único limite imposto ao nosso pedido é que o número de séries não pode ser superior a 5 por semana. Para saber quantas já foram vistas, será feito um contador.

//    Propõe-se a criação de uma estrutura de classes semelhante ao exercício anterior, com as seguintes classes:

// - Uma Interface ISerie que define um método getSerie que recebe o nome, devolvendo uma String.
// - Uma classe Serie que implementa a interface ISerie e devolve uma String que representa o link, que simplemente é o prefixo “www.” seguido pelo nome da série.
// - Uma classe SerieProxy com um atributo qtdVistas que conta o número de vezes que uma série foi solicitada e pede a Serie um link com getSerie e verifica o número de vezes que uma série foi reproduzida e se o valor máximo for excedido, ela lança uma exceção do tipo SerieNaoHabilitadaException, criada para esse fim.

//    No método principal (main), faça solicitações de séries com o nome. Mostrar o link da série caso esteja habilitado. Se não estiver, exiba: "Excede o número de reproduções permitidas".

}
