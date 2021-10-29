public class Presidente extends MembroDoGoverno {

    public Presidente() {
        this.nivelDeAcesso = 3;
    }

    @Override
    public void leituraDoDocumento(Documento documento) {
        System.out.println("Acesso liberado! O Presidente(a) pode ler qualquer tipo de documento (Reservado, Secreto ou Muito Secreto.)");
    }
}
