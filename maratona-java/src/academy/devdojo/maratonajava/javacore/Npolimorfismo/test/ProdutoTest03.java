package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 5900X", 3000);
        Tomate tomate = new Tomate("Americano", 6);
        tomate.setDataDeValidade("14/03/2026");
        CalculadoraImposto.calularImpostoProduto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calularImpostoProduto(produto);

    }
}
