package projeto.sistemabancario.test;

import projeto.sistemabancario.domain.*;

import java.util.Scanner;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Vitor Souza", "76793026838", "Rua Fernando de Noronha ", "629987654356");
        Conta conta = new Conta(8996, 87690);
        conta.setSaldo(20000);
        int opcao = 0;
        int valorDigitado = 0;
        System.out.println("Olá " + cliente);
        System.out.println(conta);
        while (opcao != 4) {
            System.out.println("Qual opção você escolhe? ");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Mostrar Saldo");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Quanto você quer depositar? ");
                valorDigitado = sc.nextInt();
                conta.valor = valorDigitado;
            } else if (opcao == 2) {
                System.out.println("Qual valor você quer sacar? ");
                valorDigitado = sc.nextInt();
                conta.valor = valorDigitado;
            }

            switch (opcao) {
                case 1 -> conta.deposito();
                case 2 -> conta.saque();
                case 3 -> System.out.println("Saldo atual " + conta.getSaldo());
                case 4 -> {
                    System.out.println("Finalizando programa!");;
                }
            }


        }


    }
}
