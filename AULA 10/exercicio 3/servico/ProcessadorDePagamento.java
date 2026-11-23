
package servico;

import interfaces.GatewayPagamento;
import interfaces.Log;
import modelo.Pagamento;

public class ProcessadorDePagamento {

    private GatewayPagamento gateway;
    private Log log;

    public ProcessadorDePagamento(GatewayPagamento gateway, Log log) {

        this.gateway = gateway;
        this.log = log;

    }

    public void processar(Pagamento pagamento) {

        double taxa = gateway.calcularTaxa(pagamento.getValor());

        double valorLiquido = pagamento.getValor() - taxa;

        String mensagem =
                "PAGAMENTO PROCESSADO\n" +
                "Descricao: " + pagamento.getDescricao() + "\n" +
                "Data: " + pagamento.getData() + "\n" +
                "Valor: R$ " + String.format("%.2f", pagamento.getValor()) + "\n" +
                "Taxa: R$ " + String.format("%.2f", taxa) + "\n" +
                "Valor liquido: R$ " + String.format("%.2f", valorLiquido);

        log.registrar(mensagem);

    }

}

