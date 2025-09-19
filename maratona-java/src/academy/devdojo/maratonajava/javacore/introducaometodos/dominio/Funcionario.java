package src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario = new double[3];

    public void ImprimirDados(){
        System.out.println("----------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            if (salario[i] != 0) {
                 System.out.println("O salário do funcionário é: "+ salario[i]);
            }
        }
    }

    public void calcularMediaSalario(){
        if (salario != null) {
            double media = 0;
            for (int i = 0; i < salario.length; i++) {
                media += salario[i];
            }
            System.out.println("A média dos salários é: "+ media/salario.length);
        }
    }
}
