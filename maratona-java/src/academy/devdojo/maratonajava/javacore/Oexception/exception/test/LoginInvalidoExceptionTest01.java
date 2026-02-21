package src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Lucas ";
        String passwordDB = "@Lucas123";
        System.out.println("Digite o nome de usuário: ");
        String userName = teclado.nextLine();
        System.out.println("Digite a senha: ");
        String password = teclado.nextLine();
        if (!userName.equals(userNameDB) || !password.equals(passwordDB)) {
            try {
                throw new LoginInvalidoException();
            } catch (LoginInvalidoException e) {
                e.getMessage();
            }
        } else {
            System.out.println("Login realizado com sucesso!");
        }

    }
}
