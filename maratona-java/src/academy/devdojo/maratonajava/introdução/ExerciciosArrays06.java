package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArrays06 {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;
        int [] numeros2 = new int[10];


//        for (int i = 9; i >= 0; i--) {
//            System.out.println(numeros2[i]);
//        }

        for (int i = 0; i < numeros.length; i++) {
            numeros2[i] = numeros[numeros.length - 1 - i];
            System.out.println(numeros2[i]);
        }

    }
}
