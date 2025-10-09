package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import src.academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init ("Jujutsu Kaisen", "TV",12);
//        anime.setNome("Jujutsu Kaisen");
//        anime.setEpisodios(12);
//        anime.setTipo("TV");
        anime.imprimir();
    }
}
