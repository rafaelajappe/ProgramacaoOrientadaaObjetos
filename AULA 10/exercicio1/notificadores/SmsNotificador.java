
package notificadores;

import interfaces.Notificador;

public class SmsNotificador implements Notificador {

    @Override
    public void enviar(String mensagem) {

        System.out.println("Enviando SMS: " + mensagem);

    }
}
