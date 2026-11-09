package modelo;

import interfaces.Agendavel;
import interfaces.Banhavel;

public class Estagiario implements Agendavel, Banhavel {
    @Override
    public void agendarConsulta(String cliente) {
        System.out.println("Estagiário agendando consulta para: " + cliente);
    }

    @Override
    public void darBanho(String animal) {
        System.out.println("Estagiário dando banho em: " + animal);
    }
}
