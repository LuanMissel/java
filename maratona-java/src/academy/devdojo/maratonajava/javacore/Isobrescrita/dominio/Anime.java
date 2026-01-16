package src.academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    // constructor
    public Anime(String nome) {
        this.nome = nome;
    }

    // methods
    @Override
    public String toString() {
        return this.nome;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
