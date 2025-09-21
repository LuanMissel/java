package src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class mediaSalarios {
    public void calcularMediaSalario(Funcionarios funcionario) {
        for (int i = 0; i < funcionario.salario.length; i++) {
            funcionario.media += funcionario.salario[i];
            if (funcionario.salario[i] != 0) {
            System.out.println("A média salarial é: " + (funcionario.salario [i]) );
        }
    }
}
}
