package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionarios;


public class FuncionáriosTest01 {
    public static void main(String[] args) {

        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.nome [0] = "Joao";
        funcionario1.idade [0] = 30;


        Funcionarios funcionario2 = new Funcionarios();
        funcionario2.nome [0]= "Maria";
        funcionario2.idade [0]= 20;
        
        
        Funcionarios funcionario3 = new Funcionarios();
        funcionario3.nome [0] = "Rafael";
        funcionario3.idade [0]= 25;
        


        funcionario1.ImprimirDados();
        funcionario2.ImprimirDados();
        funcionario3.ImprimirDados();

        System.out.println("--------------------------------------");

        funcionario1.calcularMediaSalario();
    }
}
