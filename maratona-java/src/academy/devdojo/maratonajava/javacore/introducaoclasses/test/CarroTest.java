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

        System.out.println(carro1.nome + ", " + carro1.ano + ", " + carro1.modelo);

        System.out.println("=======================================================");

        System.out.println(carro2.nome + ", " + carro2.ano + ", " + carro2.modelo);

        System.out.println("=======================================================");

    }
}
