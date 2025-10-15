package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    public void init (String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void getGenero (String genero) {
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
    }


    public void setNome (String nome) {
        this.nome = nome;
    }

    public void getNome (){
        System.out.println("Nome : " + this.nome);
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios (int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;

    }
}
