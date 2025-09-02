package src.academy.devdojo.maratonajava.introdução;

import java.util.Scanner;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do carro? ");
        double valorTotal = input.nextDouble();
        for  (int parcela = 1; parcela <= 1000; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println(" Parcela " + parcela + " R$ " + valorParcela);
            } else  {
                break;
            }
        }
    }
}
