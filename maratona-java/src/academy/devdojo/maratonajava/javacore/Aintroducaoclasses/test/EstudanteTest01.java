package src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 12;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
    }
}