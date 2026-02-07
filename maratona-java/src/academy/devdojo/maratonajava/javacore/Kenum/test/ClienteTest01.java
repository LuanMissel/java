package src.academy.devdojo.maratonajava.javacore.Kenum.test;

import src.academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import src.academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import src.academy.devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

import java.util.Scanner;

public class ClienteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Empresa Matheus Imports", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física ");
        System.out.println(tipoCliente2);

    }
}
