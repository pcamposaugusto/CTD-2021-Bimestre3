public abstract class MembroDoGoverno {
    protected int nivelDeAcesso;
    protected MembroDoGoverno membroSeguinte;

    public abstract void leituraDoDocumento(Documento documento);

    public MembroDoGoverno setMembroSeguinte(MembroDoGoverno membroSeguinte) {
        this.membroSeguinte = membroSeguinte;
        return this;
    }

}
