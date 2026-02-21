package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
         leitores();
    }

    public static void leitores() {
        try (Leitor2 leitor2 = new Leitor2();
             Leitor1 leitor1 = new Leitor1()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("Test.txt"))){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Assim seria sem o try with resources, onde temos que fechar o recurso manualmente, e caso ocorra uma exceção, o recurso pode não ser fechado, causando um vazamento de memória.
//    public static void lerArquivo2() {
//         Reader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("Test.txt"));
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                e.getMessage();
//            }
//        }
//    }
}
