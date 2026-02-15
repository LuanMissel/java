package domain.payment;

public class Cartao implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito realizado;");
    }
}
