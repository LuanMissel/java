package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaVarArgs(numeros);
    }
}
