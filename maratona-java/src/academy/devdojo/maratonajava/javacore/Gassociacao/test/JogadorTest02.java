package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Raphinha");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Vini Jr");
        Jogador jogador4 = new Jogador("Marquinhos");
        Jogador jogador5 = new Jogador("Casemmiro");
        Jogador jogador6 = new Jogador("Matheus Cunha");
        Jogador jogador7 = new Jogador("Rodrygo");
        Jogador jogador8 = new Jogador("Fabinho");
        Jogador jogador9 = new Jogador("Gabriel Magalhães");
        Jogador  [] jogador = {jogador1, jogador2, jogador3, jogador4, jogador5, jogador6, jogador7, jogador8, jogador9};
        Time time = new Time("Seleção Brasileira", jogador);


        time.Imprime();
    }
}
