package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            System.err.println("Excessão: " + e.getMessage());
        }
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("maratona-java/arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
