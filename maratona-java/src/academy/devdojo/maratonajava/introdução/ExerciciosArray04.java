package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArray04 {
    public static void main(String[] args) {
        int [] numeros = {1, 5, 12, 8, 19};
        boolean naoOrdenado = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    naoOrdenado = true;
                    break;
                }
            }
        if (naoOrdenado == true) {
            System.out.println("os numeros não estão ordenados " + naoOrdenado);
        } else {
            System.out.println("Os numeros estão ordenados! " + naoOrdenado);
        }
    }
}
