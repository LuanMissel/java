package src.academy.devdojo.maratonajava.introdução;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000l;
        double salarioDouble = 2000;
        float salarioFloat = 2500.1f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere =  'M';

        System.out.println("A idade é: "+ idade);
        System.out.println(falso);
        System.out.println("Char " + caractere);
        System.out.println(salarioFloat);
        System.out.println(salarioDouble);
        System.out.println(numeroGrande);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
    }
}
