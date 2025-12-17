package src.academy.devdojo.maratonajava.introdução;

public class Aula06EstruturasDeRepetição02exercicios {
    public static void main(String[] args) {
        for  (int pares = 0; pares <= 100 ; pares += 2) {
            System.out.println(pares);
        }
        int pares = -2;
        do {
            pares = pares + 2;
            System.out.println(pares);
        } while (pares < 100);
    }
}
