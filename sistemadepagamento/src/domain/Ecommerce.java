package domain;

public class Ecommerce implements Pagamento {
    @Override
    public void boleto() {
        System.out.println("Pagamento com boleto realizado com sucesso!");
    }

}
