public class Documento {
    private String conteudo;
    private int tipoDeDocumento;

    public Documento(String conteudo, int tipoDeDocumento) {
        this.conteudo = conteudo;
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public int getTipoDeDocumento() {
        return tipoDeDocumento;
    }

}
