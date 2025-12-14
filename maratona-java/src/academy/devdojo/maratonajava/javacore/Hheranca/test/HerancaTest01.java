package src.academy.devdojo.maratonajava.javacore.Hheranca.test;

import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fabio Carrilo", 18, "12345678900", "00000-8", 5300);
        Funcionario funcionario1 = new Funcionario("Lucas Ramos", 27, " 34567825467", "098765-8", 3400);
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco("Quadra 17, lote 19 - Rua das Laranjeiras", "12367589");
        Endereco endereco1 = new Endereco("Quadra 67, lote 29 - Rua do Limoeiro", "65457589");
        funcionario.setEndereco(endereco);
        funcionario1.setEndereco(endereco1);
        funcionario.Imprime();
        System.out.println("============================================================");
        funcionario1.Imprime();

        funcionario1.relatorioPagamento();
    }
}
