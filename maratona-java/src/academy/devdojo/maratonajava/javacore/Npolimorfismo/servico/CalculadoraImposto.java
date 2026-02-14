package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {

    public static void calularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

    }
}
