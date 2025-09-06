package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula07Arrays01 {
    public static void main(String[] args) {
         try (Scanner age = new Scanner(System.in)) {
        int [] numeros = {1,2,3,4,5,6};  
        System.out.println("Digite um número de 1 a 6");
        int encontrado = age.nextInt();
        boolean achou = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrado)  {
                System.out.println("Achei o núm ero " + numeros[i] + " na posição " + i);
                achou = true;
                break;
                } 
            }
            if (achou == false) {
                System.out.println("Número não encontrado");
            }
        }
    }
}