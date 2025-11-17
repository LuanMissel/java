package javaproject.luanmissel.poo.dominio;

public class Concessionaria {
    private String endereco;
    private Funcionarios [] equipe;


    public Concessionaria(String veiculo, String funcionario) {
        this.veiculos = veiculo;
    }

    public Concessionaria() {

    }

    public void setVeiculos(String veiculo) {
        this.veiculos = veiculo;
    }

    public String getVeiculos() {
        return veiculos;
    }

}
