package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArrays02 {
    public static void main(String[] args) {
        int [] numeros = {15,20,10,35,25};
        int maiorNumero = numeros[0];
        double soma = 0;
        double media = 0;
        int ehPar = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros [i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                if (numeros[i] % 2 == 0) {
                    ehPar = ehPar + 1;
                    soma = soma + numeros[i];

                }
            }

        media = soma / ehPar;
        System.out.println(maiorNumero);
        System.out.println(soma);
        System.out.println(media);
    }
}
