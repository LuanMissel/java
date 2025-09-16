package src.academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Pulse";
        carro1.ano = 2025;
        carro1.modelo = "Fiat";

        carro2.nome = "Fusca";
        carro2.ano = 1998;
        carro2.modelo = "Wolksvagen";

        carro3.nome = "Eco Sport";
        carro3.modelo = "Ford";
        carro3.ano = 2018;

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
