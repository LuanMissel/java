package src.academy.devdojo.maratonajava.javacore.Hheranca.test;

import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Laranjeiras", "78152-667");
        Pessoa pessoa = new Pessoa("Maria", "7059484248", endereco);


        Endereco endereco2 = new Endereco("Rua Sem Nome", "84584-482");
        Funcionario funcionario = new Funcionario("Paulo", "7584224269", endereco2, 10000);
        pessoa.imprime();
        funcionario.imprime();
    }
}
