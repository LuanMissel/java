package src.academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividadeInfinita();
    }

    public static void recursividadeInfinita(){
        recursividadeInfinita();
    }
}
