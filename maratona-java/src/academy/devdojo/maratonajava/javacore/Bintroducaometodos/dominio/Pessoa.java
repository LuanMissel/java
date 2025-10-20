package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private double salario;
    private String nome;

    public void setSalario (double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
    System.out.println(this.nome);
    System.out.println(this.salario);
    }

  public double getSalario() {
        return this.salario;
    }

    
    public String getNome() {
        return this.nome;
    }

}
 