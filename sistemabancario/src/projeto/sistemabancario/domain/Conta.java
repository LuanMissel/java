package projeto.sistemabancario.domain;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private double saque;
    private double deposito;
    public double resultado;
    public double valor;
    public double saldoAtual;
    private Cliente cliente;

    // constructors

    public Conta() {

    }

    public Conta(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "agencia = " + agencia + " conta = " + conta;
    }

    public void deposito() {
        resultado = saldo + valor;
        saldo = resultado;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println(saldo);
    }

    public void saque() {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        resultado = saldo - valor;
        saldo = resultado;
        System.out.println("Saque realizado com sucesso!");
        System.out.println(saldo);
    }

    // getters and setters


    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
