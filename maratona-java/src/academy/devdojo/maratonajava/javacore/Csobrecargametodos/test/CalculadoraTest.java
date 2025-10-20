package src.academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;


import src.academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double ghost = calculadora.somar(1.5,2.6);
        System.out.println(ghost);
    }
}
