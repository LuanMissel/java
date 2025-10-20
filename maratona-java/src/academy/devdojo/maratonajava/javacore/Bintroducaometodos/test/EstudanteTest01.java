package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
    Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    //ImpressoraEstudantes impressora = new ImpressoraEstudantes();
    estudante01.nome = "Midoriya";
    estudante01.sexo = 'M';
    estudante01.idade = 16;

    estudante02.nome = "Sakura";
    estudante02.sexo = 'F';
    estudante02.idade = 17;

    estudante01.imprime();
    estudante02.imprime();

/*    impressora.imprime(estudante01);
    impressora.imprime(estudante02);

        System.out.println("-------------------------------------------------------------");

    impressora.imprime(estudante01);
    impressora.imprime(estudante02);
    // esse é um dos riscos de utilizar uma váriavel de referência para passar parâmetros, se você precisar modificar algo, ele vai alterar
    // o código, no caso as referências */
    }

}
