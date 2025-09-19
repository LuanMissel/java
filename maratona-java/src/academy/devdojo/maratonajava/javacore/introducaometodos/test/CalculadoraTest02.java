package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite dois números");
        calculadora.multiplicaDoisNumeros(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}
}
