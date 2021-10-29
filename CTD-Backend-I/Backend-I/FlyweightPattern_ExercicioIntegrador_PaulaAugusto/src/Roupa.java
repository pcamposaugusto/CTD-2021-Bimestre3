public class Roupa {

    private String tamanho;
    private String tipo;
    private boolean nova;
    private boolean importada;

    public Roupa(String tamanho, String tipo, boolean nova, boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.nova = nova;
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNova() {
        return nova;
    }

    public void setNova(boolean nova) {
        this.nova = nova;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    public String toText() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nova=" + nova +
                ", importada=" + importada +
                '}';
    }
}
