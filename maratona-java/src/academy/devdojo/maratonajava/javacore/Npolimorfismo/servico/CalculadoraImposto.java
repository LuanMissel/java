package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class CalculadoraImposto{

    public static void calularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

//        if (produto instanceof Tomate) {
//        Tomate tomate = (Tomate) produto;
//            System.out.println("Data de validade: " + tomate.getDataDeValidade());   modo antigo de fazer o downcast
//        }


//        if (produto instanceof Tomate tomate) {
//            System.out.println("Data de validade: " + tomate.getDataDeValidade()); aparentemente o java 16 tem um recurso novo que é o pattern matching, onde podemos fazer o downcast e a declaração da variável em uma única linha, sem precisar de um cast explícito, como no exemplo acima
//        }

        if (produto instanceof Tomate tomate) {
            System.out.println("Data de validade: " + tomate.getDataDeValidade());
        }

    }

}
