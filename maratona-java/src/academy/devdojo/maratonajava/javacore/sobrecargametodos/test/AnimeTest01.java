package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Jujutsu Kaisen");
        anime.setTipo("TV");
        anime.setEpisodios(12);

        anime.imprimir();
    }
}
