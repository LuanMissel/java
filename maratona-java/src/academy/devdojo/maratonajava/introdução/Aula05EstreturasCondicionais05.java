package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstreturasCondicionais05 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        byte dia = input.nextByte();
        input.nextLine();
        switch (dia) {

            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Opção inválida!");
        }

            String sex = input.nextLine();
            switch (sex) {
                case "M" -> System.out.println("Masculino");
                case "F" -> System.out.println("Feminino");

                default -> System.out.println("Invalido");
            }
            input.close();
        }
    }
}
