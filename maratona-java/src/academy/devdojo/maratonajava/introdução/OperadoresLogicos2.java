package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class OperadoresLogicos2 {
    public static void main(String[] args) {
        Scanner aplicativo = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = aplicativo.nextLine();
        System.out.println("Você possui carro? ");
        String carro = aplicativo.nextLine();
        System.out.println("Você possui moto? ");
        String moto = aplicativo.nextLine();

        boolean podeSerContratado = carro.equals("sim") || moto.equals("sim");
        boolean notPodeSerContratado = carro.equals("não") && moto.equals("não");


        System.out.println("Pode ser contratado " + podeSerContratado);
        System.out.println("Não pode ser contratado " + notPodeSerContratado);
    }
}
