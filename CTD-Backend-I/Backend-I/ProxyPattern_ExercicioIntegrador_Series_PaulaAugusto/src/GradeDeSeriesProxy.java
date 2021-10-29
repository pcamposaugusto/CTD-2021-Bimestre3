public class GradeDeSeriesProxy implements IGradeDeSeries {

    private int qtdVistas;
    private GradeDeSeries gradeDeSerie;

    public GradeDeSeriesProxy(GradeDeSeries gradeDeSerie) {
        this.qtdVistas = 1;
        this.gradeDeSerie = gradeDeSerie;
    }

    @Override
    public void assistirSerie(String nome) throws SerieNaoHabilitadaException {
        if(qtdVistas > 5) {
            throw new SerieNaoHabilitadaException("A série " + nome + " excede o número de reproduções permitidas");
        }
        gradeDeSerie.assistirSerie(nome);

        qtdVistas++;
    }
}
