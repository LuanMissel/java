package src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.sexo = 'M';
        professor.idade = 26;

        System.out.println(professor.nome + ", " +  professor.sexo + ", " +  professor.idade);
    }
}
