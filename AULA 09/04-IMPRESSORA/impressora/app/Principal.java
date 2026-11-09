package app;

import modelo.ImpressoraBasica;
import modelo.Multifuncional;
import modelo.ScannerMesa;

public class Principal {
    public static void main(String[] args) {
        ImpressoraBasica impressora = new ImpressoraBasica();
        Multifuncional multifuncional = new Multifuncional();
        ScannerMesa scanner = new ScannerMesa();

        impressora.imprimir("Relatorio.pdf");

        System.out.println();

        multifuncional.imprimir("Contrato.pdf");
        multifuncional.escanear("Documento.pdf");
        multifuncional.enviarFax("Pedido.pdf");

        System.out.println();

        scanner.escanear("Foto.png");
    }
}
