package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Desenvolvedor;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.IdadeForaDeLimiteException;

public class SobrescritaTestDesenvolvedorTest {
    public static void main(String[] args) {
        try {
        Desenvolvedor dev = new Desenvolvedor("João", 5000, 30);

            dev.salvar();
        } catch (IllegalArgumentException | IdadeForaDeLimiteException e) {
            System.err.println("Erro ao salvar o desenvolvedor: " + e.getMessage());

            if (e instanceof IdadeForaDeLimiteException) {
                System.err.println("A idade do desenvolvedor deve estar entre 18 e 150 anos.");
            }
        }
    }
}
