package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionárioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade (25);
        funcionario.setSalarios  (new double[] {1200, 987.32, 2000});

        funcionario.mostrarDados();
        System.out.println("Media: " + funcionario.getMedia());
    }
}
