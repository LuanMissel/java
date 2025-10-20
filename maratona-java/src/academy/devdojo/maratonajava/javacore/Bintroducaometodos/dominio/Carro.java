package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;

    public void imprime(){
        System.out.println("-----------------------------");
        System.out.println( "Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }

}
