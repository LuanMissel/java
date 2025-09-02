package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstreturasCondicionais06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte dia = input.nextByte();
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");

            default -> System.out.println("Opção Inválida!");
        }

        if  (dia == 1 || dia == 7) {
            System.out.println("É final de semana!");
        }
        else {
            System.out.println("É dia de semana!");
        }
    }
}
