package src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();
        Professor professor = new Professor();
        Professor professor2 = new Professor();

        estudante.nome = "Lucas";
        estudante.sexo = 'F';
        estudante.idade = 12;
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println("--------------------------");

        estudante2.nome = "Luan";
        estudante2.sexo = 'M';
        estudante2.idade = 16;
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);

        System.out.println("--------------------------");
        estudante3.nome = "Pedro";
        estudante3.sexo = 'M';
        estudante3.idade = 20;
        System.out.println(estudante3.nome);
        System.out.println(estudante3.sexo);
        System.out.println(estudante3.idade);

        System.out.println("--------------------------");
        professor.nome = "Paulo";
        professor.sexo = 'M';
        professor.idade = 22;
        System.out.println(professor.nome);
        System.out.println(professor.sexo);
        System.out.println(professor.idade);

        System.out.println("--------------------------");
        professor2.nome = "Paula";
        professor2.sexo = 'F';
        professor2.idade = 26;
        System.out.println(professor2.nome + ", " +  professor2.sexo + ", " +  professor2.idade);
    }
}
