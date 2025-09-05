package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstreturasCondicionais04 {
    public static void main(String[] args) {
         try (Scanner pay = new Scanner(System.in)) {
        System.out.println("Qual o valor do seu salário?");
        double salario = pay.nextDouble();
        double imposto = 0;
        double aliquotaBaixa = salario * 0.097;
        double aliquotaMedia = salario * 0.3735;
        double aliquotaAlta = salario * 0.4950;
        double salarioLiquido = salario - imposto;
            pay.close();

        if (salario<=34712){
            imposto = aliquotaBaixa;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = aliquotaMedia;
        } else {
            imposto = aliquotaAlta;
        }
        
        System.out.println("Esse é o valor do seu desconto do imposto! "+ imposto);
        System.out.println(" Esse é o seu salário após o desconto! " + salarioLiquido );
    
        }
    }
}
