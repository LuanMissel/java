package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Monitor;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo ThinkPad 12/512GB AMD Ryzen 5", 7000);
        Tomate tomate = new Tomate("Tomate Francês", 5);
        tomate.setDataDeValidade("14/03/2026");
        Monitor monitor = new Monitor("Samsung 24\"", 1200);
        CalculadoraImposto.calularImpostoProduto(computador);
        System.out.println("====================================");
        CalculadoraImposto.calularImpostoProduto(tomate);
        System.out.println("====================================");
        CalculadoraImposto.calularImpostoProduto(monitor);
    }
}
