package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.repositorio.UsuarioRepositorioSql;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.service.CadastroUsuario;
import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.CpfInvalidoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorCpfTest {
    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        UsuarioRepositorioSql repositorioSql = new UsuarioRepositorioSql();
        System.out.println("Digite um CPF para validação:");
        try (Scanner sc = new Scanner(System.in)) {
            String cpf = sc.nextLine();
            try {
                cadastroUsuario.cadastro(cpf);
                repositorioSql.salvar(cpf);
            } catch (CpfInvalidoException | InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }
}
