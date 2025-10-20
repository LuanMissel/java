package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro  carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        
        carro1.modelo = "Sedã";
        carro1.cor = "Azul";
        carro1.ano = 2021;
        carro1.marca = "Ford";

        carro2.modelo = "SUV";
        carro2.cor = "Vermelho";
        carro2.ano = 2025;
        carro2.marca = "Fiat";

        carro3.ano = 2026;
        carro3.marca = "Fiat";
        carro3.modelo = "Hatch";
        carro3.cor = "Vermelho";

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
