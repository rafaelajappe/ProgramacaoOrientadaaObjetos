public class Carro extends Veiculo {

    Carro(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    double calcularAluguel(int dias) {
        return getDiaria() * dias + 30;
    }
}
