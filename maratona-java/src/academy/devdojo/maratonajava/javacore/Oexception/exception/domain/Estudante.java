package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.IOException;

public class Estudante implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new IOException();
    }
}
