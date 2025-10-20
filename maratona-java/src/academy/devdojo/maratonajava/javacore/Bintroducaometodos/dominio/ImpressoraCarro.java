package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraCarro {
    public void imprimir(Carro carro){
        System.out.println("----------------------------");

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Marca: " + carro.marca);
    }
}
