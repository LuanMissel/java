package domain;

public class Televisao extends Produto {
    public final double taxa = 0.10;

    public Televisao(String marca, double valor) {
        super(marca, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para Televisão...");
        return this.valor * taxa;
    }


}
