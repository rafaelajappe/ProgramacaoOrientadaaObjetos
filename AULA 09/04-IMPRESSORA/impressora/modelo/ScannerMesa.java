package modelo;

import interfaces.Scanner;

public class ScannerMesa implements Scanner {
    @Override
    public void escanear(String documento) {
        System.out.println("Scanner de mesa escaneando: " + documento);
    }
}
