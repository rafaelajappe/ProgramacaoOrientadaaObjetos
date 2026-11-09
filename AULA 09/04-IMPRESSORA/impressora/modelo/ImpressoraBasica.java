package modelo;

import interfaces.Impressora;

public class ImpressoraBasica implements Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}
