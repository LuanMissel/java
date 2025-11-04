package src.academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import src.academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 250);
        Carro c2 = new Carro("Mercedes", 250);
        Carro c3 = new Carro("Audi", 250);

        Carro.setVelocidadeLimite (180);

        c1.Imprime();
        c2.Imprime();
        c3.Imprime();


    }
}
