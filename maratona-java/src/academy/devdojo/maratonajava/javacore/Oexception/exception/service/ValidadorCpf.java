package src.academy.devdojo.maratonajava.javacore.Oexception.exception.service;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.CpfInvalidoException;

public class ValidadorCpf {

    public static void validarCpf(String cpf) throws CpfInvalidoException {
        if (cpf == null || cpf.length() != 11) {
            throw new CpfInvalidoException("Cpf digitado incorretamente, deve conter 11 caracteres");
        } else {
            System.out.println("CPF válido: " + cpf);
        }
    }

}
