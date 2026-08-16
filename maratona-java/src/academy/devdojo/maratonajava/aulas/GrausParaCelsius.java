package academy.devdojo.maratonajava.aulas;

import java.util.Scanner;

public class GrausParaCelsius {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahrenheit;
        int celsius = 0;
        System.out.println("Digite quantos graus em celsius você quer converter: ");
        celsius = sc.nextInt();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Conversão para fahrenheit: " + fahrenheit + "°");

    }


}
