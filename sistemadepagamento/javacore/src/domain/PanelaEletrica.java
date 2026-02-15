package domain;

public class PanelaEletrica extends Produto {
    public final double taxa = 0.17;

    public PanelaEletrica(String marca, double valor) {
        super(marca, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para Panela Elétrica...");
        return this.valor * taxa;
    }




}
