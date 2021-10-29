public class Main {
    public static void main(String[] args) {

        // IP

        Ip ip1 = new Ip(12, 198, 122, 255);
        Ip ip2 = new Ip(55, 198, 122, 255);
        Ip ip3 = new Ip(122, 198, 122, 255);
        Ip ip4 = new Ip(155, 198, 122, 255);

        // FILMES

        Filme filme1 = new Filme("Aquarius", "Brasil", "www.aquarius.com");
        Filme filme2 = new Filme("Relatos selvagens", "Argentina", "www.relatosselvagens.com");
        Filme filme3 = new Filme("A Terra e a Sombra", "Colômbia", "www.aterraeasombra.com");
        Filme filme4 = new Filme("Lolo: o filho da minha namorada", "França", "www.lolo.com");

        // GRADE DE FILMES

        GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();
        gradeDeFilmes.getFilmes().add(filme1);
        gradeDeFilmes.getFilmes().add(filme2);
        gradeDeFilmes.getFilmes().add(filme3);
        gradeDeFilmes.getFilmes().add(filme4);

        // GRADE DE FILMES - PROXY

        GradeDeFilmesProxy proxyArg = new GradeDeFilmesProxy(ip1, gradeDeFilmes);
        GradeDeFilmesProxy proxyBr = new GradeDeFilmesProxy(ip2, gradeDeFilmes);
        GradeDeFilmesProxy proxyCol = new GradeDeFilmesProxy(ip3, gradeDeFilmes);
        GradeDeFilmesProxy proxyOutro = new GradeDeFilmesProxy(ip4, gradeDeFilmes);

        try {
            proxyArg.assistirFilme("Relatos selvagens");
            proxyArg.assistirFilme("Aquarius");

        } catch (FilmeNaoHabilitadoException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxyBr.assistirFilme("Aquarius");
            proxyBr.assistirFilme("A Terra e a Sombra");

        } catch (FilmeNaoHabilitadoException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxyCol.assistirFilme("A Terra e a Sombra");
            proxyCol.assistirFilme("Lolo: o filho da minha namorada");

        } catch (FilmeNaoHabilitadoException e) {
            System.err.println(e.getMessage());
        }

        try {
            proxyOutro.assistirFilme("Relatos selvagens");

        } catch (FilmeNaoHabilitadoException e) {
            System.err.println(e.getMessage());
        }

    }
}
