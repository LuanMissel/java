package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArrays05 {
    public static void main(String[] args) {
        int [] numeros = {15, 20, 10, 35, 25};
        int menorNumero = numeros[0];
        int maiorNumero = numeros[0];
        double soma = 0;
        double media = 0;
        int contadorPares = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }

            if  (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }

            if (numeros[i] % 2 == 0) {
                System.out.println("Esses são os números pares " + numeros[i]);
                contadorPares += 1;
            }

            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.println("Esse é o total de números pares: " + contadorPares);
        System.out.println("Esse é o maior número: " + maiorNumero);
        System.out.println("Esse é o menor número: " + menorNumero);
        System.out.println("Essa é a soma total da array: "+ soma);
        System.out.println("Essa é a média desse exemplo: " + media);

    }
}
