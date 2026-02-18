package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.Closeable;

public class Leitor2 implements Closeable {

    @Override
    public void close() {
        System.out.println("Fechando leitor 2");
    }
}
