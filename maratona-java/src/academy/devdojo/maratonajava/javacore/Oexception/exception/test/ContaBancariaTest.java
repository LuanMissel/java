package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.ContaBancaria;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.SaldoInsuficienteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {

        System.out.println("Digite o valor para saque:");
        try (Scanner sc = new Scanner(System.in)) {
            ContaBancaria contaBancaria = new ContaBancaria("123456", 1000);
            try {
                contaBancaria.sacar(sc.nextDouble());
            } catch (SaldoInsuficienteException | InputMismatchException e) {
                System.err.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Saldo atual: " + contaBancaria.getSaldo());
            }
        }
    }
}
