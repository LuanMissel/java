package src.academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public final double IMPOSTO_POR_CENTO = 0.06;
    private String DataDeValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return DataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        DataDeValidade = dataDeValidade;
    }
}
