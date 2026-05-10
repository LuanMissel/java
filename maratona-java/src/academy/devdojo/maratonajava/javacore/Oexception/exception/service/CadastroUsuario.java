package src.academy.devdojo.maratonajava.javacore.Oexception.exception.service;

import src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain.CpfInvalidoException;

public class CadastroUsuario {
    private String cpf;


    public void cadastro(String cpf) throws CpfInvalidoException {
       ValidadorCpf.validarCpf(cpf);
         this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
