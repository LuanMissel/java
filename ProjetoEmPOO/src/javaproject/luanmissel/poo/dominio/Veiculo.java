package javaproject.luanmissel.poo.dominio;

public class Veiculo {
    private String veiculo;
    private String marca;
    private double preco;



    public Veiculo(String veiculo,  String marca, double preco) {
        this.veiculo = veiculo;
        this.marca = marca;
        this.preco = preco;
    }

    public void imprime2() {
        System.out.println("Veiculo: " + this.veiculo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);

    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setModelo(double preco) {
        this.preco = preco;
    }
}
