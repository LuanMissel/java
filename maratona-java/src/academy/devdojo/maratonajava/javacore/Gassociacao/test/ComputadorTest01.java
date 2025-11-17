package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Computador;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Memoria;

import java.awt.image.MemoryImageSource;

public class ComputadorTest01 {
    public static void main(String[] args) {
        Memoria memoria1 = new Memoria("Kingstom Fury Beast");
        Memoria memoria2 = new Memoria("Gamer Rise");
        Memoria memoria3 = new Memoria("XPG Lancer");
        Memoria [] memoria = {memoria1, memoria2, memoria3};
        Computador computador = new Computador("Vinik 3000", memoria); // esse objeto seria o primeiro normalmente, porém quando tiver array para ser lido em uma associação muitos pra um, ele deve ser o último para receber o array como argumento e não dar Nullpointer.Exception

        computador.imprime();
    }
}
