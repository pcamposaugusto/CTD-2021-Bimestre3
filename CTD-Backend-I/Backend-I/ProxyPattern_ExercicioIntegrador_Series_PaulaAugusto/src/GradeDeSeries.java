import java.util.ArrayList;
import java.util.List;

public class GradeDeSeries implements IGradeDeSeries {

    private List<Serie> series;

    public GradeDeSeries() {
        this.series = new ArrayList<>();
    }

    @Override
    public void assistirSerie(String nome) throws SerieNaoHabilitadaException {
        System.out.println(this.series.stream().filter(serie -> serie.getNome().equals(nome)).findFirst().orElse(null).getLinkDeReproducao());
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
}
