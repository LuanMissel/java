package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main() {
        String nome = "William Suane";
        nome = nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.delete(0, 3);
        sb.reverse();
        System.out.println(sb);

    }
}
