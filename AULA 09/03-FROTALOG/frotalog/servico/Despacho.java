package servico;

import java.util.List;
import interfaces.Entregavel;

public class Despacho {
    public double calcularTotal(List<Entregavel> frota, double distanciaKm) {
        double total = 0;

        for (Entregavel veiculo : frota) {
            if (veiculo.podeRealizarEntrega(distanciaKm)) {
                double custo = veiculo.calcularCusto(distanciaKm);
                System.out.printf("%s: R$ %.2f%n", veiculo.getDescricao(), custo);
                total += custo;
            } else {
                System.out.println(veiculo.getDescricao()
                        + " não pode realizar entrega de " + distanciaKm + " km.");
            }
        }

        return total;
    }
}
