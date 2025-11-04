package src.academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static  int [] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    // 0- o bloco de inicializaçõa estático é criado quando a JVM carregar a classe;
    // 1 - Alocado espaco em memória pro objeto;
    // 2 -Cada atributo de classe é criado e inicializado com valores default ou o quer for alocado na memória;
    // 3 Bloco de inicialização é executado;
    // 4 Construtor é executado;
    // o bloco de inicialização é inicializado apenas uma vez. O bloco de inicialização normal é inicializado quando uma nova instância é criada.
    // Métodos estáticos são utilizados para definir regras ao código. Tipo um limite de velocidade padrão para os carros.
     static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int [40];
        for  (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios  : Anime.episodios) {
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
