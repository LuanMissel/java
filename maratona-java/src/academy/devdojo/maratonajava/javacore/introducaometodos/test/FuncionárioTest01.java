package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;


public class FuncionárioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();


        funcionario1.nome = "Joao";
        funcionario1.idade = 30;
        funcionario1.salario [0] = 15000; 


        funcionario2.nome = "Maria";
        funcionario2.idade = 20;
        funcionario2.salario [0] = 19000; 


        funcionario3.nome = "Rafael";
        funcionario3.idade = 25;
        funcionario3.salario [0] = 23000; 


        funcionario1.ImprimirDados();
        funcionario2.ImprimirDados();
        funcionario3.ImprimirDados();

        System.out.println("--------------------------------------");

        funcionario1.calcularMediaSalario();

    }
}
