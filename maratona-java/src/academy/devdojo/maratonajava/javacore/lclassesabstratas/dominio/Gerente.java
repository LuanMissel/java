package src.academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.15;
    }
}
