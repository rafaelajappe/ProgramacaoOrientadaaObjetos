
package principal;

import modelo.ConfirmacaoPedido;
import notificadores.EmailNotificador;
import notificadores.SmsNotificador;

public class Principal {

    public static void main(String[] args) {

        // Primeiro pedido: notificação por e-mail
        ConfirmacaoPedido pedidoEmail =
                new ConfirmacaoPedido(new EmailNotificador());

        pedidoEmail.confirmarPedido("Maria");

        System.out.println("--------------------------");

        // Segundo pedido: notificação por SMS
        ConfirmacaoPedido pedidoSms =
                new ConfirmacaoPedido(new SmsNotificador());

        pedidoSms.confirmarPedido("João");

    }
}
