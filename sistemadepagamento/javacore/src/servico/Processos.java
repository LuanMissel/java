package servico;

import domain.Produto;
import domain.payment.Pagamento;

public class Processos {
    public void CalcularUltimoValor(Produto produto, Pagamento pagamento) {
        System.out.println("-----------------------------------");

        System.out.println("O produto escolhido foi: " + produto.nome);
        System.out.println("Calculando o valor final do produto...");

        double taxa = produto.valor + produto.calcularTaxa();

        System.out.println("Valor do produto: R$ " + produto.valor);
        System.out.println("Valor Final R$ " + taxa);
        System.out.println("Processando pagamento...");
        System.out.println("-----------------------------------");

        pagamento.processarPagamento();

    }
}
