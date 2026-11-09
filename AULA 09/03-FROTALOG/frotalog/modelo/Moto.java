package modelo;

import interfaces.Entregavel;

public class Moto extends Veiculo implements Entregavel {
    public Moto(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public boolean podeRealizarEntrega(double distanciaKm) {
        return distanciaKm > 0;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custoBase = 2.00 * distanciaKm;
        return custoBase / 2;
    }

    @Override
    public String getDescricao() {
        return "Moto " + getPlaca();
    }
}
