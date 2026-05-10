package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "maratonajava";
        String nome2 = "maratonajava";
        System.out.println(nome == nome2);
//        nome = nome.concat(" 2026"); o concat não altera a string, ele cria uma nova string, por isso o nome continua o mesmo e precisamos atribuir o resultado do concat a uma nova variável ou a mesma variável para que a string seja alterada.
        System.out.println(nome);
        System.out.println(nome.compareTo(nome2)); // compara as strings, se for igual retorna 0, se for diferente retorna um número positivo ou negativo dependendo da ordem alfabética.
        String nome3 = new String("maratonajava"); // 1 variável de referência e 2 objetos do tipo String, 3 uma string no pool de string e 4 uma string no heap, por isso o nome3 é diferente do nome e nome2, pois eles estão no pool de string e o nome3 está no heap.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
