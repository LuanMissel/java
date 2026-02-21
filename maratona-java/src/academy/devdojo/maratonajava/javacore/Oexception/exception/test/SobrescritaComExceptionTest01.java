package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.IdadeForaDeLimiteException;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a idade: ");
            int success = 0;
            while (success < 5) {

                try {
                int i = sc.nextInt();
                    retornaIdade(i);
                    System.out.println("Idade válida: " + i);
                    success++;
                } catch (IdadeForaDeLimiteException | InputMismatchException e) {
                   System.out.println("Digite a idade novamente: ");
                    if (e instanceof InputMismatchException) {
                        System.out.println("Digite um número inteiro para a idade.");
                        sc.next();
                    } else {
                        System.err.println("Erro: " + e.getMessage());
                    }
                }
            }

        }
    }

    private static int retornaIdade(int idade) throws IdadeForaDeLimiteException {
        if (idade < 20 || idade > 150) {
            throw new IdadeForaDeLimiteException();
        }
        return idade;
    }
}