package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTevladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pergunte algo sobre seu futuro e eu responderei!");
        System.out.println("Qual a sua pergunta? ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
           System.out.println("Sim");
       } else {
           System.out.println("Não");
       }
    }
}
