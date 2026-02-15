package domain;

public class Microondas extends Produto {
    public final double taxa = 0.25;

    public Microondas(String marca, double valor) {
        super(marca, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para Microondas...");
        return this.valor * taxa;
    }



}
