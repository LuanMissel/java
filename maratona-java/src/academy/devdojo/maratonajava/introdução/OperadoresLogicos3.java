package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class OperadoresLogicos3 {
    public static void main(String[] args) {
        try (Scanner age = new Scanner(System.in)) {
            System.out.println("Qual a sua idade? ");
            int idade = age.nextInt();
            System.out.println("Qual o valor da sua compra? ");
            double compra = age.nextDouble();
            
            boolean ganhaDesconto = idade > 60 || compra > 100;
            if(ganhaDesconto){
                System.out.println("Parabéns, você ganhou um desconto de 10%!");
            }
            else {
                System.out.println("Infelizmente você não ganha desconto!");
            }
            double desconto = (10 * compra) / 100;
            if (ganhaDesconto){
                System.out.println( desconto + " reais esse é o valor do seu desconto!!");
                double valor_final = compra - desconto;
                System.out.println("o valor final da sua compra é: " + valor_final);
            }
        }

    }
}
