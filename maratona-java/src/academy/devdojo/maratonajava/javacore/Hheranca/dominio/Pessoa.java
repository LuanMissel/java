package src.academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;

    // Constructors

    public Pessoa() {
        
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade, String cpf, Endereco endereco) {
        this(nome, idade, cpf);
        this.endereco = endereco;
    }

    // Print Method

    public void Imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.getEndereco().getRua());
        System.out.println("Cep: " + this.getEndereco().getCep());
    }

    // getters and setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getcPF() {
        return this.cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
}
