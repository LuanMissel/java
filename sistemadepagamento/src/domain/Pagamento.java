package domain;

public interface Pagamento {
    void boleto();
    default void debito() {
        System.out.println("Pagamento com debito realizado com sucesso!");
    }
    default void credito() {
        System.out.println("Pagamento com credito realizado com sucesso!");
    }
    default void pix() {
        System.out.println("Pagamento com pix realizado com sucesso!");
    }
}

