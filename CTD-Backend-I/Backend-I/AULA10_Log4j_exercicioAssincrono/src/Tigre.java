public class Tigre {

    private String nome;
    private int idade;

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String correr() {
        return "O tigre " + this.nome + " está correndo";
    }

    public void eMaiorQue10() throws Excecao {
        if(this.idade > 10) {
            System.out.println("O tigre " + this.nome + " tem mais de 10 anos");
        } else if (this.idade < 0) {
            throw new Excecao("A idade do tigre " + this.nome + " está incorreta");
        }
    }

}
