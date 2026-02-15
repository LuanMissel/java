package domain.payment;

import domain.Produto;

public class Boleto implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto realizado!");
    }
}
