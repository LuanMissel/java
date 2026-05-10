package br.com.luanmissel.sistemabancario.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.DriverManager;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Cliente {
    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;


    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

}
