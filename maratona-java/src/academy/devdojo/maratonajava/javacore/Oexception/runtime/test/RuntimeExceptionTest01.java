package src.academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked são filhas de Exception, ou seja, são obrigadas a serem tratadas ou lançadas sempre. Na maioria das vezes, são erros de entrada e saída, como IOException, SQLException, etc.
        // Unchecked são filhas de RuntimeException, ou seja, não são obrigadas a serem tratadas ou lançadas. Na maioria das vezes, são erros de lógica do programador, como NullPointerException, ArrayIndexOutOfBoundsException, etc.
        int [] numeros = {1, 2, 3, 4};
        System.out.println(numeros[4]);
    }
}
