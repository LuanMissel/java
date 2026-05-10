package br.com.luanmissel.sistemabancario.database.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Conta {
    private UUID id;
    private int agencia;
    private int conta;

    private Cliente cliente;

    public Conta(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }


}
