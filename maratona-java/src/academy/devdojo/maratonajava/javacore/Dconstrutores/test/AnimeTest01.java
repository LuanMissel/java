package src.academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import src.academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
    Anime anime = new Anime("Haikyu", 12, "Jujutsu Kaizen", "Ação", "Crunchyroll");
//        anime.init ("Jujutsu Kaisen", "TV",12, "Shounen");
//        anime.setNome("Jujutsu Kaisen");
//        anime.setEpisodios(12);
//        anime.setTipo("TV");
        anime.imprimir();
    }
}
