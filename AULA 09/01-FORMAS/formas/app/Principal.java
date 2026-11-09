package app;

import java.util.ArrayList;
import interfaces.Forma;
import modelo.Circulo;
import modelo.Retangulo;
import modelo.Triangulo;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(2));
        formas.add(new Retangulo(4, 5));
        formas.add(new Triangulo(3, 4, 5));

        for (Forma forma : formas) {
            System.out.printf("Área: %.2f%n", forma.calcularArea());
            System.out.printf("Perímetro: %.2f%n", forma.calcularPerimetro());
            System.out.println("--------------------");
        }
    }
}
