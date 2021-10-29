public class Ministro extends MembroDoGoverno {

    public Ministro() {
        this.nivelDeAcesso = 2;
    }

    @Override
    public void leituraDoDocumento(Documento documento) {
        if(documento.getTipoDeDocumento() == 1) {
            System.out.println("Acesso liberado! O Deputado(a) pode ler um documento de tipo 1 (Reservado).");
        } if(documento.getTipoDeDocumento() == 2) {
            System.out.println("Acesso liberado! O Deputado(a) pode ler um documento de tipo 2 (Secreto).");
        } else if (this.membroSeguinte != null) {
            System.out.println("Acesso negado, Ministro(a)! O Sr(a) não pode ler um documento de tipo 3 (Muito Secreto).");
            this.membroSeguinte.leituraDoDocumento(documento);
        }
    }
}
