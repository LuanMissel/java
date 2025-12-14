package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Categoria {
    private String nome;
    private Produto produto;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
