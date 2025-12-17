package primeiroprojeto.calculadora.test;

import primeiroprojeto.calculadora.domain.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner numeros = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("====Calculadora====");
            System.out.println("1. Soma");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = numeros.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro valor: ");
                calculadora.setNum1(numeros.nextDouble());
                System.out.println("Digite o segundo valor: ");
                calculadora.setNum2(numeros.nextDouble());
                switch (opcao) {
                    case 1 -> calculadora.somar();
                    case 2 -> calculadora.subtrair();
                    case 3 -> calculadora.mutiplicar();
                    case 4 -> calculadora.dividir();
                }
                calculadora.imprimir();
            }
        }
    }
}

