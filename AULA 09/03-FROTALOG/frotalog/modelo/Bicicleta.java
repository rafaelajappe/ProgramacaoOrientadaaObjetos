package modelo;

import interfaces.Entregavel;

public class Bicicleta extends Veiculo implements Entregavel {
    public Bicicleta(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public boolean podeRealizarEntrega(double distanciaKm) {
        return distanciaKm > 0 && distanciaKm <= 5;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        if (!podeRealizarEntrega(distanciaKm)) {
            throw new IllegalArgumentException("Bicicleta só realiza entregas de até 5 km.");
        }

        // O enunciado não informa uma tarifa própria para a bicicleta.
        // Adotamos o custo-base de R$ 2,00 por km como hipótese do exercício.
        return 2.00 * distanciaKm;
    }

    @Override
    public String getDescricao() {
        return "Bicicleta " + getPlaca();
    }
}
