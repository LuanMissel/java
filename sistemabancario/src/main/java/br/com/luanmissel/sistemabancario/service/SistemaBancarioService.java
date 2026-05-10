package br.com.luanmissel.sistemabancario.service;

import br.com.luanmissel.sistemabancario.database.model.Cliente;
import br.com.luanmissel.sistemabancario.database.model.Conta;

import java.util.Scanner;
public class SistemaBancarioService {
private double saldo;
public double resultado;
public double valor;
public double saldoAtual;

    public void deposito() {
        resultado = saldo + valor;
        saldo = resultado;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println(saldo);
    }

    public void saque() {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        resultado = saldo - valor;
        saldo = resultado;
        System.out.println("Saque realizado com sucesso!");
        System.out.println(saldo);
    }

}
