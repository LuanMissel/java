package projeto.sistemabancario.domain;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    // constructors

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " cpf = " + cpf + " endereco = " + endereco + ", telefone = " + telefone;
    }

// getters and setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
