package modelo;

import interfaces.Entregavel;

public class Caminhao extends Veiculo implements Entregavel {
    public Caminhao(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public boolean podeRealizarEntrega(double distanciaKm) {
        return distanciaKm > 0;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double toneladas = getCapacidadeKg() / 1000.0;
        double custoPorKm = 2.00 + (0.50 * toneladas);
        return custoPorKm * distanciaKm;
    }

    @Override
    public String getDescricao() {
        return "Caminhão " + getPlaca();
    }
}
