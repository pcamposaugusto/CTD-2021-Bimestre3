import java.util.ArrayList;
import java.util.List;

public class GradeDeFilmes implements IGradeDeFilmes {

    private List<Filme> filmes;

    public GradeDeFilmes() {
        this.filmes = new ArrayList<>();
    }

    @Override
    public void assistirFilme(String nome) throws FilmeNaoHabilitadoException {
        System.out.println(this.filmes.stream().filter(filme -> filme.getNome().equals(nome)).findFirst().orElse(null).getLinkDeReproducao());
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
