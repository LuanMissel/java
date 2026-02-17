package src.academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
       try {
           System.out.println(divisao(1,0));
       } catch (IllegalArgumentException e) {
           System.err.println("Excessão: " + e.getMessage());
       }
        System.out.println("Fim do programa");
    }

    /*
    * @param a dividendo
    * @param b divisor
    * @return resultado da divisão de a por b
    * @throws IllegalArgumentException se b for zero
     */

    public static int divisao (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("O valor de b não pode ser zero");
        }
        return a/b;
    }
}

