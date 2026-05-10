package src.academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main() {
        String nome  = "Luffy";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "O"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        String numeros = "012345";
        System.out.println(numeros.substring(0, 5)); // retorna algumas partes da string, o primeiro parâmetro é o índice inicial e o segundo parâmetro é o índice final, ou seja, ele retorna a string do índice 0 até o índice 4, pois o índice final não é incluído.

        System.out.println("-----------------------------");

        String [] nomes = {"Luffy", "Zoro", "Nami", "Usopp", "Sanji", "Chopper", "Robin", "Franky", "Brook"};
        for (String n : nomes) {
            System.out.println(n.toUpperCase());
        }
    }
}
