package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArrays08 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,5,8,8,6,7,1,2,5};
        int [] numeros2 = new int [numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            boolean jaExiste = false;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    for (int k = 0; k < contador; k++) {

                        if (numeros[i] == numeros2[k]) {
                            jaExiste = true;
                            break;
                        }

                    }

                    if (jaExiste == false) {
                        numeros2[contador] = numeros[i];
                        System.out.println(numeros2[contador] + " esses são os numeros repetidos");
                        contador++;
                    }
                }
            }
        }
    }
}
