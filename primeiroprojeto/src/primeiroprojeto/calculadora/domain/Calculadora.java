package primeiroprojeto.calculadora.domain;

public class Calculadora {
    private double num1;
    private double num2;
    private double resultado;

    // Constructors

    public Calculadora(){

    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void somar() {
        resultado = num1 + num2;
    }

    public void subtrair () {
        resultado  = num1 - num2;
    }

    public void mutiplicar () {
        resultado = num1 * num2;
    }

    public void dividir () {
        if (num2 != 0) {
            resultado = num1 / num2;
        }
        else {
            System.out.println("Erro na impressão, impossivel dividir por zero.");
        }
    }

    public void potencia () {
        if (num1 == num2) {
            resultado = num1 * num2;
        }
        else if (num1 != num2){
            System.out.println("Erro ao imprimir");
        }
    }

    public void raizQuadrada() {

    }

    public void imprimir() {
        System.out.println("Resultado " + resultado);
    }

    // gettters and setters

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return this.num1;
    }

    public void getNum2(double num2) {
        this.num2 = num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return this.num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
