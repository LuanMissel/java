package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        try (Scanner age = new Scanner(System.in)) {
            System.out.println("Qual a sua idade?");
            int idade  = age.nextInt();
//        boolean podeComprarBebidaAlcolica = idade >= 18;
//        if (podeComprarBebidaAlcolica) {
//            System.out.println("Pode comprar bebida alcolica!");
//        }else {
//            System.out.println("Não pode comprar bebida alcolica!");
//        }
String resultado = idade > 18 ? "Pode comprar bebida alcolica!" : "Não pode comprar bebida alcolica!";
System.out.println(resultado);
        }
    }
}
