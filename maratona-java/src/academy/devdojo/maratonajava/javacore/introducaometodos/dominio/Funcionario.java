package src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario = {15000, 4000,2000};

    public void ImprimirDados(){
        System.out.println("----------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

    }

    public void calcularMediaSalario(){
        double media = (this.salario[0] + this.salario[1]  + this.salario[2]) / 3;
        for (int i = 0; i < salario.length; i++) {
            System.out.println("O salário do funcionário é: "+ salario[i]);;
        }
        System.out.println("A média dos salários é: "+ media);
    }
}
