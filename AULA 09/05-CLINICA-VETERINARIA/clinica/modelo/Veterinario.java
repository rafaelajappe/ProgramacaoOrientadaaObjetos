package modelo;

import interfaces.Consultavel;
import interfaces.Vacinavel;
import interfaces.Operatorio;

public class Veterinario implements Consultavel, Vacinavel, Operatorio {
    @Override
    public void consultar(String animal) {
        System.out.println("Veterinário consultando: " + animal);
    }

    @Override
    public void vacinar(String animal) {
        System.out.println("Veterinário vacinando: " + animal);
    }

    @Override
    public void operar(String animal) {
        System.out.println("Veterinário realizando cirurgia em: " + animal);
    }
}
