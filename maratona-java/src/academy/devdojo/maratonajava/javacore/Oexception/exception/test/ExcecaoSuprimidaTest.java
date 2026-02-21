package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Estudante;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Livro;


public class ExcecaoSuprimidaTest {
    public static void main(String[] args) throws Exception {
        try (Estudante estudante = new Estudante();
             Livro livro = new Livro();)  {
                throw new RuntimeException("Erro principal no sistema");
        } catch (Exception e) {
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Exceção suprimida: " + suppressed);
            }
        }
    }
}
