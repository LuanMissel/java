package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Monitor extends Produto {
    public final double IMPOSTO_POR_CENTO = 0.21;

    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
