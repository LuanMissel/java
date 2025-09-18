package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;


public class FuncionárioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();


        funcionario1.nome = "Joao";
        funcionario1.idade = 30;


        funcionario2.nome = "Maria";
        funcionario2.idade = 20;


        funcionario3.nome = "Rafael";
        funcionario3.idade = 25;


        funcionario1.ImprimirDados();
        funcionario2.ImprimirDados();
        funcionario3.ImprimirDados();

        funcionario1.calcularMediaSalario();


    }
}
