package src.academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor (String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    public Desenvolvedor() {
        super();
    }

    public void salvar() throws IllegalArgumentException, IdadeForaDeLimiteException {
        if (getNome() == null) {
            throw new IllegalArgumentException("O nome do desenvolvedor não pode ser nulo.");
        }
        if (getIdade() < 18 || getIdade() > 150) {
            throw new IdadeForaDeLimiteException("A idade do desenvolvedor deve estar entre 18 e 150 anos.");
        }

        // simulação de salvamento do desenvolvedor
        System.out.println("Desenvolvedor salvo com sucesso: " + getNome() + ", Salário: " + getSalario());
    }

}


