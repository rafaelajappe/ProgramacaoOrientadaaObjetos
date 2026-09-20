import java.util.ArrayList;

public class Locadora {

    private ArrayList<Veiculo> frota = new ArrayList<>();

    private double faturamento = 0;

    void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    void alugar(String placa, int dias) {

        if (dias <= 0) {
            System.out.println("Quantidade de dias inválida.");
            return;
        }

        for (Veiculo veiculo : frota) {

            if (veiculo.getPlaca().equals(placa)) {

                double valor = veiculo.calcularAluguel(dias);

                faturamento = faturamento + valor;

                System.out.println(
                    "Aluguel do " + veiculo.getModelo()
                    + " por " + dias + " dias: R$ " + valor
                );

                return;
            }
        }

        System.out.println("Placa inexistente.");
    }

    double getFaturamento() {
        return faturamento;
    }
}
