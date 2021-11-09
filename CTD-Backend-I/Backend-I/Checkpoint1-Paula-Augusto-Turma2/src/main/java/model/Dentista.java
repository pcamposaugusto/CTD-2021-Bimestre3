package model;

public class Dentista {

    private Integer id;
    private String numeroDeMatricula;
    private String nome;
    private String sobrenome;

    public Dentista(String numeroDeMatricula, String nome, String sobrenome) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Dentista(Integer id, String numeroDeMatricula, String nome, String sobrenome) {
        this.id = id;
        this.numeroDeMatricula = numeroDeMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", numeroDeMatricula='" + numeroDeMatricula + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

}
