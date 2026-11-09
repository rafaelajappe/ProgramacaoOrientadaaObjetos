package modelo;

import interfaces.Entregavel;

public class Van extends Veiculo implements Entregavel {
    public Van(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public boolean podeRealizarEntrega(double distanciaKm) {
        return distanciaKm > 0;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return 2.00 * distanciaKm;
    }

    @Override
    public String getDescricao() {
        return "Van " + getPlaca();
    }
}
