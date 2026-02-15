package domain.payment;

import domain.Produto;

public class Pix implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX realizado!");
    }

}

