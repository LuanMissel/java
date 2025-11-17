package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Computador {
    private String nome;
    private PlacaMae placaMae;
    private CPU cpu;
    private GPU gpu;
    private Memoria[] memoria;

    public Computador(String nome) {
        this.nome = nome;
        this.placaMae = new PlacaMae("AMD Am4");
        this.cpu = new CPU("Vinik");
        this.gpu = new GPU("AMD RYZEN 5");
    }

    public Computador(String nome, Memoria[] memoria) {
        this(nome);
        this.memoria = memoria;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Placa Mãe: " + this.placaMae.getNome());
        System.out.println("CPU: " + this.cpu.getNome());
        System.out.println("GPU: " + this.gpu.getNome());
        if (memoria == null) return;
        for (Memoria memoria : memoria) {
            System.out.println("Memória: " + memoria.getNome());  // lembre-se que essa será a estrutura quando tiver um array. Você deve adicionar tudo de forma que funcione corretamente e percorra o array inteiro
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
