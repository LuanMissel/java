package src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio;
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void mostrarDados() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Idade do funcionario: " + this.idade);

        for (double salario : this.salarios) {
            System.out.println("O salário do mês é " + salario);
        }
        mediaDosSalarios();
    }

    public void mediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media Salarial " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}