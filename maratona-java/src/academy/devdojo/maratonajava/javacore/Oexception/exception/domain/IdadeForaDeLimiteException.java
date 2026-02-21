package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

public class IdadeForaDeLimiteException extends Exception {
    public IdadeForaDeLimiteException() {
        super("Idade fora do limite permitido");
    }

    public IdadeForaDeLimiteException(String message) {
        super(message);
    }
}
