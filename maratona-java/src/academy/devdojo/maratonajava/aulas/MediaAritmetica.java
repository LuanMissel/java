package academy.devdojo.maratonajava.aulas;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        int nota1;
        System.out.println("Digite a nota 1: ");
        nota1 = new Scanner(System.in).nextInt();

        int nota2;
        System.out.println("Digite a nota 2: ");
        nota2 = new Scanner(System.in).nextInt();

        int media = (nota1 + nota2) / 2;

       System.out.println("A média aritética é: " +  media);
    }
}
