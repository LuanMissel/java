package javaproject.luanmissel.poo.dominio;

public class Funcionarios {

    private String funcionarios;

    public Funcionarios(String fucionarios) {
        this.funcionarios = fucionarios;
    }

    public void imprimir1() {
        System.out.println(this.funcionarios);
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getFuncionarios() {
        return this.funcionarios;
    }
}
