
package app;

import modelo.Pagamento;
import gateways.PagSeguro;
import gateways.Stripe;
import logs.LogConsole;
import servico.ProcessadorDePagamento;

public class Principal {

    public static void main(String[] args) {

        // Primeiro pagamento: PagSeguro
        Pagamento pagamento1 = new Pagamento(
                100.00,
                "Compra de produtos",
                "22/11/2026"
        );

        ProcessadorDePagamento processador1 =
                new ProcessadorDePagamento(
                        new PagSeguro(),
                        new LogConsole()
                );

        processador1.processar(pagamento1);


        System.out.println("--------------------------");


        // Segundo pagamento: Stripe
        Pagamento pagamento2 = new Pagamento(
                200.00,
                "Compra de servicos",
                "22/11/2026"
        );

        ProcessadorDePagamento processador2 =
                new ProcessadorDePagamento(
                        new Stripe(),
                        new LogConsole()
                );

        processador2.processar(pagamento2);

    }

}

