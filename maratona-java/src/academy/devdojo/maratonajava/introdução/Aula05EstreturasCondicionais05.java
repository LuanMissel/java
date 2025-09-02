package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstreturasCondicionais05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte dia = input.nextByte();
        input.nextLine();
        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

            String sex = input.nextLine();
            switch (sex) {
                case "M":
                    System.out.println("Masculino");
                    break;
                case "F":
                    System.out.println("Feminino");
                    break;

                default:
                    System.out.println("Invalido");
                    break;
            }
    }
}
