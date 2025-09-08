package src.academy.devdojo.maratonajava.introdução;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naofumi Iwatani";


        for (String string : nomes) {
            System.out.println(string);
        }
    }
}
