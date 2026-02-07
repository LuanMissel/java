package src.academy.devdojo.maratonajava.javacore.lclassesabstratas.test;

import src.academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Desenvolvedor;
import src.academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente( "Lucas", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Thiago", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
