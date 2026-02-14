package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 5900X", 3000);
        Tomate tomate  = new Tomate("Americano" , 20);
        tomate.setDataDeValidade("12/12/2024");
    }
}
