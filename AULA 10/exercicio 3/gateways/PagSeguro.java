
package gateways;

import interfaces.GatewayPagamento;

public class PagSeguro implements GatewayPagamento {

    @Override
    public double calcularTaxa(double valor) {

        return valor * 0.035;

    }

}
