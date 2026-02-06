package src.academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import src.academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import src.academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;
import src.academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        // Quando usar um modificador final com um objeto você não pode modificar a referência, pois dará erro
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Elielson");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.getNome());

    }
}
