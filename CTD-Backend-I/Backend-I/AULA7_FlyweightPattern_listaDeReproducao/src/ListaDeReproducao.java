import java.util.List;

public class ListaDeReproducao {

    private String nome;
    private List<String> listaDeReprodução;

    public ListaDeReproducao(String nome, List<String> listaDeReprodução) {
        this.nome = nome;
        this.listaDeReprodução = listaDeReprodução;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListaDeReprodução() {
        return listaDeReprodução;
    }

    public void setListaDeReprodução(List<String> listaDeReprodução) {
        this.listaDeReprodução = listaDeReprodução;
    }

    public void obterMusica() {

    }

    public void excluirMusica() {

    }

    public void mostrarListaDeReproducao() {

    }

}
