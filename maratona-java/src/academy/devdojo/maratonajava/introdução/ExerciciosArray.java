package src.academy.devdojo.maratonajava.introdução;

public class ExerciciosArray {
    public static void main(String[] args) {
        int[] notas = new int[5];
        notas[0] = 8;
        notas[1] = 7;
        notas[2] = 6;
        notas[3] = 9;
        notas[4] = 6;
        double m =  5;
        double somaNota = 0;
        double mediaFinal = 0;
        for (int i = 0; i < notas.length; i++){
            somaNota += notas[i];

        }
        mediaFinal = somaNota / m;
        System.out.println("Essa é a soma das notas: " + somaNota);
        System.out.println("Essa é a media final: " + mediaFinal);


    }
}
