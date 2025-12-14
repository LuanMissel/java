package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Autor;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Autor autor = new Autor("Miguel Prado", "Cubano");
        Livro livro = new Livro("Sindrome de Herói",2021);

        livro.setAutor(autor);
        autor.setLivro(livro);

        autor.Imprimir();
    }
}
