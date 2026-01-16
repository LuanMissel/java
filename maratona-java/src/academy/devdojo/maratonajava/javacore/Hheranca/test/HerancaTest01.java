package src.academy.devdojo.maratonajava.javacore.Hheranca.test;

import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Quadra 17, lote 19 - Rua das Laranjeiras", "12367589");
        Endereco endereco1 = new Endereco("Quadra 67, lote 29 - Rua do Limoeiro", "65457589");

        Funcionario funcionario = new Funcionario("Fabio Carrilo", 18, "12345678900", endereco, "00000-8", 5300);
        Funcionario funcionario1 = new Funcionario("Lucas Ramos", 27, "34567825467", endereco1, "098765-8", 3400);

        System.out.println("===== FUNCIONÁRIO 1  =====");
        funcionario.Imprime();
        System.out.println("\n===== FUNCIONÁRIO 2 =====");
        funcionario1.Imprime();
        
        System.out.println("\n===== RELATÓRIO DE PAGAMENTO =====");
        funcionario.relatorioPagamento();
        funcionario1.relatorioPagamento();
    }
}
