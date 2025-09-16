package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("================================");
        calculadora.subtraiDoisNumeros(25,69);
        System.out.println("================================");
        calculadora.multiplicaDoisNumeros(15,70);
    }
}
