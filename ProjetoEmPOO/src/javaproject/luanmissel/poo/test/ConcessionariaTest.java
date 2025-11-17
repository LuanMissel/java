package javaproject.luanmissel.poo.test;

import javaproject.luanmissel.poo.dominio.Concessionaria;
import javaproject.luanmissel.poo.dominio.Funcionarios;
import javaproject.luanmissel.poo.dominio.Veiculo;

import java.io.File;

public class ConcessionariaTest {
    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria();
        Veiculo veiculo = new Veiculo("Eco Sport", "Ford", 80000);
        Funcionarios funcionario1 = new Funcionarios("Pelé");
        Funcionarios funcionario2 = new Funcionarios("Luiz");
        Funcionarios funcionario3 = new Funcionarios("Maria");
        Funcionarios funcionario4 = new Funcionarios("Carlos");
        Funcionarios funcionario5 = new Funcionarios("Juan");
        Funcionarios funcionario6 = new Funcionarios("Juan");
        Funcionarios funcionario7 = new Funcionarios("Juan");
        Funcionarios funcionario8 = new Funcionarios("Juan");
        Funcionarios funcionario9 = new Funcionarios("Juan");
        Funcionarios funcionario10 = new Funcionarios("Juan");
        Funcionarios[] funcionario = new Funcionarios[]{funcionario1, funcionario2, funcionario3, funcionario4, funcionario5, funcionario6, funcionario7, funcionario8};

        for (Funcionarios f : funcionario) {
            System.out.println(f);
        }

        veiculo.imprime2();
    }
}
