package modelo;

import interfaces.Impressora;
import interfaces.Scanner;
import interfaces.Fax;

public class Multifuncional implements Impressora, Scanner, Fax {
    @Override
    public void imprimir(String documento) {
        System.out.println("Multifuncional imprimindo: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("Multifuncional escaneando: " + documento);
    }

    @Override
    public void enviarFax(String documento) {
        System.out.println("Multifuncional enviando fax: " + documento);
    }
}
