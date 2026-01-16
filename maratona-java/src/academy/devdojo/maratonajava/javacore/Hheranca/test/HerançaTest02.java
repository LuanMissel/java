package src.academy.devdojo.maratonajava.javacore.Hheranca.test;

import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerançaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado.
    // 1 - Bloco de inicialização estático de sub classe é executado
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com os valores default
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com os valores default
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    //
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Jiraya");
    }
}
