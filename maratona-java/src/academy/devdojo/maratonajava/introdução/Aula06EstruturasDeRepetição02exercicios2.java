package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula06EstruturasDeRepetição02exercicios2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)
//        System.out.println("Digite um numero: ");
//        int numero = input.nextInt();
//        int contador = 0;
//        while (contador < 10) {
//                contador += 1;
//                System.out.println(contador+" x "+ numero + " = " + (contador * numero));
//        }
//
//        System.out.println("Digite um numero: ");
//        int numero = input.nextInt();
//        for (int i = 1; i <= 2000; i += 1 ) {
//            System.out.println(i +" x "+ numero + " = " + (i * numero));
//        }
        ) {
            int i = 0;
            System.out.println("Digite um numero: ");
            int numero = input.nextInt();
            do {
                i += 1;
                System.out.println(i +" x "+ numero + " = " + (i * numero));
            }while (i < 10);
        }
    }
}
