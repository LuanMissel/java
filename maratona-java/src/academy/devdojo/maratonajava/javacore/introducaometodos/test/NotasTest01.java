package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Notas;

import java.util.Scanner;

public class NotasTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas notas = new Notas();
        System.out.println("Digite o seu nome e a sua turma ");
        notas.dadosDoAluno (sc.nextLine() , sc.nextLine());
        System.out.println("Digite as duas notas: ");
        double resultado = notas.calculaMediaAluno(sc.nextDouble(), sc.nextDouble());
        notas.imprimirNaTela();
        System.out.println("Sua média é: " + resultado);
    }
}
