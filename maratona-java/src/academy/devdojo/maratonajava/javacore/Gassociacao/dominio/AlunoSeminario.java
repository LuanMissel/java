package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class AlunoSeminario {
    private String nome;
    private int idade;
    private Seminario seminario;

    public AlunoSeminario(String nome) {
        this.nome = nome;
    }

    public AlunoSeminario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
