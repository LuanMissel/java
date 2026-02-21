package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.util.InputMismatchException;

public abstract class Funcionario {

    private String nome;
    private double salario;
    private int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public Funcionario() {

    }
    public void salvar() throws IllegalArgumentException, InputMismatchException, IdadeForaDeLimiteException {
        if (nome == null) {
            throw new InputMismatchException("O nome do funcionário não pode ser nulo.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("O salário do funcionário não pode ser negativo.");
        }
        // simulação de salvamento do funcionário
            System.out.println("Funcionário salvo com sucesso: " + nome + ", Salário: " + salario + ", Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

