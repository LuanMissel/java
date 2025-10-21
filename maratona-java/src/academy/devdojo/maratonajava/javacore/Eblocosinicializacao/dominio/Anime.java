package src.academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int [100];
        for  (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios  : this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
