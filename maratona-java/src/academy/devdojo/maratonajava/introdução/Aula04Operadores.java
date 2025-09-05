package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
         try (Scanner age = new Scanner(System.in)) {
        // + _ / *
        int numero01= 10;
        double numero02= 20;
        double resultado = numero01/numero02;

        System.out.println("Digite sua idade: ");
        int idade2 = age.nextInt();
        System.out.println(resultado);
        

        System.out.println(idade2);
        // operadores relacionais

        // % resto da divisão

        /*
        < menor que
        > maior que
        <= menor ou igual
        >= maior ou igual
        == igual a
        != diferente
        * */
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 20;
        boolean isDezIgualDez = 10 == 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        System.out.println("isDezIgualDez " + isDezIgualDez);

        // && (And) , || (Or), ! Not)
        int idade = 20;
        int horas = 7;
        boolean idadeeHoras = idade > 30 || horas < 9;
        System.out.println("Idade e horas " + idadeeHoras);

        double contaCorrente = 200;
        double contaPoupanca = 7000;
        float playstationCinco = 5999F;
        boolean comprarPlaystantion5 = contaCorrente > playstationCinco || contaPoupanca > playstationCinco;
        System.out.println("É possivel comprar playstation5? " + comprarPlaystantion5);


        /* Operadores de atribuição
        = += -= *= /= %=
        */

        int contador = 0;
        contador += 1;
        ++contador;
        --contador;
        ++contador;
        --contador;
        System.out.println("Contador " + contador);
        }

    }
}
