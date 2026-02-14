package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 5900X", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
