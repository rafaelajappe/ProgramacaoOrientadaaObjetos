public class Veiculo {

    private String placa;
    private String modelo;
    private double diaria;

    Veiculo(String placa, String modelo, double diaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = diaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDiaria() {
        return diaria;
    }

    double calcularAluguel(int dias) {
        return diaria * dias;
    }
}