package modelo;

import interfaces.Agendavel;
import interfaces.EmissorRecibo;

public class Recepcionista implements Agendavel, EmissorRecibo {
    @Override
    public void agendarConsulta(String cliente) {
        System.out.println("Recepcionista agendando consulta para: " + cliente);
    }

    @Override
    public void emitirRecibo(String cliente) {
        System.out.println("Recepcionista emitindo recibo para: " + cliente);
    }
}
