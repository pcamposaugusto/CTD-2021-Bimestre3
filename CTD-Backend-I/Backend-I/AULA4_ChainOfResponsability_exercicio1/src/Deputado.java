public class Deputado extends MembroDoGoverno {

    public Deputado() {
        this.nivelDeAcesso = 1;
    }

    @Override
    public void leituraDoDocumento(Documento documento) {
        if(documento.getTipoDeDocumento() == 1) {
            System.out.println("Acesso liberado! O Deputado(a) pode ler um documento de tipo 1 (Reservado).");
        } else if (this.membroSeguinte != null) {
            System.out.println("Acesso negado, Deputado(a)! O Sr(a) não pode ler esse tipo de documento.");
            this.membroSeguinte.leituraDoDocumento(documento);
        }
    }

}
