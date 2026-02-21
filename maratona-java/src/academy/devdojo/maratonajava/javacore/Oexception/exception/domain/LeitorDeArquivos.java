package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LeitorDeArquivos {
    public void lerArquivo() {
        Reader reader = null;
        try  {
            reader = new BufferedReader(new FileReader("Test.txt"));
            System.out.println("Arquivo lido com sucesso");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                System.out.println("Fechando o recurso e liberando a memória");
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }


    public void lerArquivo2() {
        try(Reader reader = new BufferedReader(new FileReader("Test.txt"))) {
            System.out.println("Arquivo lido com sucesso");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
