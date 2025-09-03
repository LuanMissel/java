package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArray03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 40;
        numeros[1] = 78;
        numeros[2] = 90;
        numeros[3] = 50;
        numeros[4] = 30;
        numeros[5] = 60;
        numeros[6] = 80;
        numeros[7] = 75;
        numeros[8] = 75;
        numeros[9] = 90;
        int contador = 0;


        for (int i = 0; i < numeros.length; ++i) {
            System.out.println(numeros[i]);
            if (numeros[i] == 90) {
                contador += 1;
            }
        }
        System.out.println("O numero 90 aparece " + contador + " vezes no código!");
    }
}
