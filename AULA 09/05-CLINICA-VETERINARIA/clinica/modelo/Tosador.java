package modelo;

import interfaces.Tosavel;
import interfaces.Banhavel;

public class Tosador implements Tosavel, Banhavel {
    @Override
    public void fazerTosa(String animal) {
        System.out.println("Tosador fazendo tosa em: " + animal);
    }

    @Override
    public void darBanho(String animal) {
        System.out.println("Tosador dando banho em: " + animal);
    }
}
