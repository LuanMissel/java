package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        try (Scanner saldoConta = new Scanner(System.in)) {
            ContaBancaria contaBancaria = new ContaBancaria();
            contaBancaria.setdados("Luan", 8709, 4000);
            contaBancaria.getdados();
            System.out.println("Qual valor você quer resgatar? ");
            contaBancaria.sacar(saldoConta.nextDouble());
            contaBancaria.getdados();
        }
    }
}
