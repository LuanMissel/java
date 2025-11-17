package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

import java.util.Scanner;

public class JogadorTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        Jogador jogador1 = new Jogador(sc.nextLine());

        System.out.println("Digite o nome do jogador: ");
        Jogador jogador2 = new Jogador(sc.nextLine());

        System.out.println("Digite o nome do time do jogador: ");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time(sc.nextLine(), jogadores);


        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.Imprime();
        jogador2.Imprime();

        System.out.println("--- Time ---");
        time.Imprime();

    }
}
