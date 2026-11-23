
package notificadores;

import interfaces.Notificador;

public class EmailNotificador implements Notificador {

    @Override
    public void enviar(String mensagem) {

        System.out.println("Enviando E-MAIL: " + mensagem);

    }
}
