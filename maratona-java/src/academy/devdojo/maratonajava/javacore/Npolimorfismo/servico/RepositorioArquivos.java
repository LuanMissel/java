package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em un arquivo...");
    }
}
