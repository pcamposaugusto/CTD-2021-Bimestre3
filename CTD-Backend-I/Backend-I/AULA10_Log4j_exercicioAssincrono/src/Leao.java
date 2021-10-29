public class Leao {

    private String nome;
    private int idade;
    private boolean eAlfa;

    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

    public String correr() {
        return "O leão " + this.nome + " está correndo";
    }

    public void eMaiorQue10() throws Excecao {
        if(this.idade > 10 && eAlfa == true) {
            System.out.println("O leão " + this.nome + " tem mais de 10 anos e é alfa");
        } else if (this.idade < 0) {
            throw new Excecao("A idade do leão " + this.nome + " está incorreta");
        }
    }

}
