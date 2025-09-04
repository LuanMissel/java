package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArrays07 {
    public static void main(String[] args) {
         int [] numeros = {1,5,8,9,10,5,7,9,3,2,1};
         int contadordo5 = 0;
         for (int i = 0; i < numeros.length; i++) {
              if (numeros[i] == 5) {
                  contadordo5 += 1;
              }
         }
        System.out.println("O numero 5 aparece " + contadordo5 + " vezes nesse código ");
    }
}
