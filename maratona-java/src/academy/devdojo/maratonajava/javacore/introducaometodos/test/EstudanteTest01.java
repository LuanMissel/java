package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Digite o seu nome e a sua turma ");
        estudante.dadosDoAluno (sc.nextLine() , sc.nextLine());
        sc.nextLine();
        System.out.println("Digite as duas notas: ");
        double resultado = estudante.calculaMediaAluno(sc.nextDouble(), sc.nextDouble());
        System.out.println("Sua média é: " + resultado);
        estudante.imprimirNaTela();
    }
}
