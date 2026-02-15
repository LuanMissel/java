package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
