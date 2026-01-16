package src.academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AlunoSeminario;

public class Funcionario extends Pessoa{
    private String contaBancaria;
    private double salario;

    // Construtores

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, int idade, String cpf, String contaBancaria, double salario) {
        super(nome, idade, cpf);
        this.contaBancaria = contaBancaria;
        this.salario = salario;
    }

    public Funcionario (String nome, int idade, String cpf, Endereco endereco,String contaBancaria, double salario) {
        super(nome, idade, cpf, endereco);
        this.contaBancaria = contaBancaria;
        this.salario = salario;
    }

    // Print

    public void Imprime() {
        super.Imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " +  this.nome + " recebi o salário de: " + this.salario);
    }

    // getters e setters
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}

