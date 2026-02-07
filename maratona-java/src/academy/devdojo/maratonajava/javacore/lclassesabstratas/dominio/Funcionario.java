package src.academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio;

import java.lang.invoke.StringConcatFactory;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
