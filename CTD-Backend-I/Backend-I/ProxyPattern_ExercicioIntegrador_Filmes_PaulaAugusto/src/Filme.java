public class Filme {
    private String nome;
    private String pais;
    private String linkDeReproducao;

    public Filme(String nome, String pais, String linkDeReproducao) {
        this.nome = nome;
        this.pais = pais;
        this.linkDeReproducao = linkDeReproducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLinkDeReproducao() {
        return linkDeReproducao;
    }

    public void setLinkDeReproducao(String linkDeReproducao) {
        this.linkDeReproducao = linkDeReproducao;
    }
}
