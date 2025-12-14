package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Autor {
    private String autor;
    private String nacionalidade;
    private Livro livro;

    public Autor(String autor, String nacionalidade) {
        this.autor = autor;
        this.nacionalidade = nacionalidade;
    }

    public Autor(String autor, String nacionalidade,  Livro livro) {
        this.autor = autor;
        this.nacionalidade = nacionalidade;
        this.livro = livro;
    }

    public void Imprimir() {
        System.out.println("O autor é: " + this.autor);
        System.out.println("Sua nacionalidade é: " + this.nacionalidade);
        if  (this.livro == null) return;
        System.out.println("O seu livro é: " + this.livro.getTitulo());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
