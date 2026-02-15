package domain;

import domain.payment.Pagamento;

public class MaquinaDeLavar extends Produto {
    public final double taxa = 0.15;

    public MaquinaDeLavar(String marca, double valor) {
        super(marca, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para Máquina de Lavar...");
        return this.valor * taxa;
    }

}
