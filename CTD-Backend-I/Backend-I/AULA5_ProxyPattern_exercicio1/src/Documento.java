public class Documento implements IDocDriveService {

    @Override
    public void registrarAcesso(String url, String email) {
        System.out.println("O usuário de e-mail " + email + " pode ter acesso ao documento de url " + url);
    }
}
