package domain;


public abstract class Produto implements Taxa {
    public String nome;
    public double valor;

    public Produto(String produto, double valor) {
        this.nome = produto;
        this.valor = valor;
    }

}
