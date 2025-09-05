package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        try (Scanner pay = new Scanner(System.in)) {
            System.out.println("Qual o seu salário? ");
            double salario = pay.nextDouble();
            String mensagemDoar = "eu vou doar 500 por DevDojo";
            String mensagemNaoDoar = "ainda não tenho condições, mas vou ter!";
            String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
            
            System.out.println(resultado);
        }
    }
}
