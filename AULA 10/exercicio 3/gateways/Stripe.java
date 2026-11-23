
package gateways;

import interfaces.GatewayPagamento;

public class Stripe implements GatewayPagamento {

    @Override
    public double calcularTaxa(double valor) {

        return (valor * 0.029) + 0.50;

    }

}

