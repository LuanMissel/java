package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;

    public void imprimir(){
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
