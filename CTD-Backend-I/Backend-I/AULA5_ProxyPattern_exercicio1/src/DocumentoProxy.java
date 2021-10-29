import java.util.List;

public class DocumentoProxy implements IDocDriveService {

    private int id;
    private String url;
    private String conteudo;
    private List<String> usuariosAutorizados;
    private Documento documento;

    public DocumentoProxy(List<String> usuariosAutorizados, Documento documento, String url) {
        this.usuariosAutorizados = usuariosAutorizados;
        this.documento = documento;
        this.url = url;
    }

    @Override
    public void registrarAcesso(String url, String email) {
        if(this.usuariosAutorizados.contains(email)){
            this.documento.registrarAcesso(url);
        }
    }
}
