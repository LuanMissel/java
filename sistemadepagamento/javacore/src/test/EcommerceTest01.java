package test;

import domain.*;
import domain.payment.Boleto;
import domain.payment.Cartao;
import domain.payment.Pix;
import servico.Processos;

public class EcommerceTest01 {
    public static void main(String[] args) {

        Produto produto1 = new MaquinaDeLavar("Brastemp", 1500);
        Produto produto2 = new Microondas("Electrolux", 500);
        Produto produto3 = new Televisao("TCL 43\" ", 1200);
        Produto produto4 = new PanelaEletrica("Mondial", 600);

        Processos processoPagamento = new Processos();

        processoPagamento.CalcularUltimoValor(produto1, new Cartao());

        processoPagamento.CalcularUltimoValor(produto2, new Pix());

        processoPagamento.CalcularUltimoValor(produto3, new Cartao());

        processoPagamento.CalcularUltimoValor(produto4, new Boleto());
    }
}
