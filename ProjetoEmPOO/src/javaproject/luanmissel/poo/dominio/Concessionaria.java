package javaproject.luanmissel.poo.dominio;

public class Concessionaria {
    private String veiculos;
    private String funcionarios;


    public Concessionaria(String veiculo, String funcionario) {
        this.veiculos = veiculo;
        this.funcionarios = funcionario;
    }

    public Concessionaria() {

    }

    public void imprime(){
        System.out.print("Funcionário: " + this.funcionarios + ",");
        System.out.println(" vendeu o carro: "+ this.veiculos);
    }

    public void setVeiculos(String veiculo) {
        this.veiculos = veiculo;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios= funcionarios;
    }

    public String getVeiculos() {
        return veiculos;
    }

    public String getFuncionarios() {
        return funcionarios;
    }
}
