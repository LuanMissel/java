package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest  {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
