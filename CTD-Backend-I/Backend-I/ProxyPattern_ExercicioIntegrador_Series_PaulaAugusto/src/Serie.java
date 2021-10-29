public class Serie {

    private String nome;
    private String linkDeReproducao;

    public Serie(String nome, String linkDeReproducao) {
        this.nome = nome;
        this.linkDeReproducao = linkDeReproducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkDeReproducao() {
        return linkDeReproducao;
    }

    public void setLinkDeReproducao(String linkDeReproducao) {
        this.linkDeReproducao = linkDeReproducao;
    }
}
