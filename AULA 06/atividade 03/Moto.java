public class Moto extends Veiculo {

    Moto(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    double calcularAluguel(int dias) {

        double valor = getDiaria() * dias;

        if (dias >= 7) {
            valor = valor - valor * 10 / 100;
        }

        return valor;
    }
}