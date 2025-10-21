package src.academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import src.academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        try (Scanner saldoConta = new Scanner(System.in).useLocale(Locale.US)) {
            ContaBancaria contaBancaria = new ContaBancaria();
            contaBancaria.setdados("Lucas", 0004, 100000);
            contaBancaria.getdados();
            System.out.println("Qual valor você quer resgatar? " + " Se for um valor maior que 50 reais, digite uma taxa de 30  reais (digite o valor que quer resgatar e o valor da taxa)");
            contaBancaria.sacar(saldoConta.nextDouble(), saldoConta.nextDouble());
            System.out.println("Qual o valor que você quer depositar na conta? ");
            contaBancaria.depositar(saldoConta.nextDouble());
            contaBancaria.getdados();
        }
    }
}
