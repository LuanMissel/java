package javaproject.luanmissel.poo.test;

import javaproject.luanmissel.poo.dominio.Concessionaria;
import javaproject.luanmissel.poo.dominio.Funcionarios;
import javaproject.luanmissel.poo.dominio.Veiculo;

public class ConcessionariaTest {
    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria("Eco Sport", "Rafael");
        Veiculo veiculo = new Veiculo("Eco Sport", "Ford", 80000);
        Funcionarios funcionario = new Funcionarios();
        concessionaria.imprime();
        veiculo.imprime2();
    }
}
