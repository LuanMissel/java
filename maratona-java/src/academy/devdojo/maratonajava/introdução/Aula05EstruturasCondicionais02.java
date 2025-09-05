package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //  idade < 15 categoria juvenil
        //  idade >= 15 && idade < 18 categoria de base
        // idade >= 18 categoria profissional
        try (Scanner age = new Scanner(System.in)) {
            //  idade < 15 categoria juvenil
            //  idade >= 15 && idade < 18 categoria de base
            // idade >= 18 categoria profissional
            System.out.println("Qual a sua idade? ");
            int idade = age.nextInt();
            String categoria;
            if (idade < 15) {
                categoria = ("Categoria infantil!");
            } else if (idade >= 15 && idade < 18) {
                categoria = ("Categoria de base!");
            } else {
                categoria = ("Categoria profissional!");
            }
            System.out.println(categoria);
        }
    }
}
