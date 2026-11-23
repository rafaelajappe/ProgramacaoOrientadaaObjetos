
package modelo;

import interfaces.Notificador;

public class ConfirmacaoPedido {

    private Notificador notificador;

    public ConfirmacaoPedido(Notificador notificador) {

        this.notificador = notificador;

    }

    public void confirmarPedido(String cliente) {

        String mensagem = "Olá, " + cliente
                + "! Seu pedido foi confirmado.";

        notificador.enviar(mensagem);

    }
}

