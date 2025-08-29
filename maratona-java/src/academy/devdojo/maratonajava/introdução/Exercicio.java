package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner age = new Scanner(System.in);
        int idade = age.nextInt();
        System.out.println("I'm " + idade + " years old");

        System.out.println("How old are you?");
        int idade2 = age.nextInt();
        System.out.println("I'm " + idade + " years old");

        System.out.println(idade + idade2);

    }
}