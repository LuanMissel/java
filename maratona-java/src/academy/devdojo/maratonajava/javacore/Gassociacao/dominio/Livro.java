package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Livro {
    private String titulo;
    private int anoLancamento;
    private Autor autor;

    public Livro(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public Livro(String titulo, int anoLancamento, Autor autor) {
        this (titulo, anoLancamento);
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
