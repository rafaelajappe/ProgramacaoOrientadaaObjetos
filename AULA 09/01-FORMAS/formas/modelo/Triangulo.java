package modelo;

import interfaces.Forma;

public class Triangulo implements Forma {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Heron: funciona para qualquer triângulo válido.
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro
                * (semiperimetro - ladoA)
                * (semiperimetro - ladoB)
                * (semiperimetro - ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
