package src.academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class ContaBancaria {
    String nomeDoTitular;
    int agencia;
    double saldo;

    public ContaBancaria (String nome, int agencia, double saldo) {
        this.setdados(nome, agencia, saldo);
    }

    public ContaBancaria () {

    }

    private void dados (String nome, int agencia, double saldo) {
        this.nomeDoTitular = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public void setdados (String nome, int agencia, double saldo) {
        this.dados(nome, agencia, saldo);
    }

    public void getdados() {
        System.out.println("Nome do titular: " + this.nomeDoTitular);
        System.out.println("Saldo do titular: " + this.saldo);
    }

    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar (double saque) {
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente ");
        }
        else {
            this.saldo = this.saldo - saque;
        }
    }

    public void sacar (double saque, double taxa) {
        double custoTotal = taxa + saque;
        if (custoTotal > this.saldo) {
            System.out.println("Saldo insuficiente ");
        } else {
            this.saldo = this.saldo - custoTotal;
        }
    }
}
