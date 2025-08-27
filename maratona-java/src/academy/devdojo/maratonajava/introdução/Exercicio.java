package src.academy.devdojo.maratonajava.introdução.main;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner age = new Scanner(System.in);
        int idade = age.nextLine();
        System.out.println("I'm " + idade + " years old");
    }
}