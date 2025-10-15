package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.test;


import src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double ghost = calculadora.somar(1.5,2.6);
        System.out.println(ghost);
    }
}
